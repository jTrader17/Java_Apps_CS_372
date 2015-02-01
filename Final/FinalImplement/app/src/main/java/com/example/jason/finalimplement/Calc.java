package com.example.jason.finalimplement;

import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Math;
import android.view.View;

/**
 *
 * @author Jason Trader
 */
public class Calc {
    private static ArrayList<Integer> pmpositions = new ArrayList(0);
    private static String curr_token;
    private static int i;
    private static HashMap<String, Variable> vars = new HashMap(0);
    private static double unc;


    private static void get_token(String eq){
        if(i< eq.length()){
            curr_token = "" + eq.charAt(i);
            i++;
        }
    }

    private static String get_var(String eq){
        String var = curr_token;
        while (i<eq.length() && checkVar(eq.charAt(i))){
            get_token(eq);
            var+=curr_token;
        }
        get_token(eq);
        return var;
    }

    private static boolean checkVar(char c){
        return Character.isLetter(c);
    }

    private static double get_num(String eq){
        String num = curr_token;
        while (i<eq.length() && checkNum(eq.charAt(i))){
            get_token(eq);
            num+=curr_token;
        }
        get_token(eq);
        return Double.parseDouble(num);
    }

    private static boolean checkNum(Character c){
        if(Character.isDigit(c) || c.equals('.')){
            return true;
        }
        return false;
    }

    public static double calculate(String eq){

        pmpositions.clear();
        pmpositions.add(-1);
        i = 0;
        get_token(eq);
        return expr(eq);
    }
    private static double expr(String eq){
        double left = term(eq);
        while(true){
            switch(curr_token){
                case "+":
                    pmpositions.add(i-1);
                    get_token(eq);
                    left += term(eq);
                    break;
                case "-":
                    pmpositions.add(i-1);
                    get_token(eq);
                    left -= term(eq);
                    break;
                default:
                    return left;
            }
        }
    }

    private static double term(String eq){
        double left = prim(eq);

        while(true){
            switch (curr_token){
                case "*":
                    get_token(eq);
                    left*= prim(eq);
                    break;
                case "/":
                    get_token(eq);
                    left/= prim(eq);
                    break;
                default:
                    return left;
            }
        }
    }

    private static double prim(String eq){
        switch (curr_token){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                return get_num(eq);
            case "-":
                get_token(eq);
                return -prim(eq);
            case "(":
                get_token(eq);
                double e = expr(eq);
                if (!curr_token.equals(")"))
                    throw new IllegalArgumentException("need ')'");
                get_token(eq);
                return e;
            default:
                String var = get_var(eq);
                if(!vars.containsKey(var)){
                    vars.put(var, new Variable(var));
                }
                return vars.get(var).getValue();
        }
    }

    public static double getUnc(String eq){
        ArrayList<String> parts = new ArrayList(0);
        if (pmpositions.isEmpty()){
            parts.add(eq);
        }
        else{
            for(int q=0; q<pmpositions.size(); q++){
                if(q+1==pmpositions.size())
                    parts.add(eq.substring(pmpositions.get(q)+1));
                else
                    parts.add(eq.substring(pmpositions.get(q)+1,pmpositions.get(q+1)));
            }
        }
        unc = findUnc(parts);
        return unc;
    }

    private static double findUnc(ArrayList<String> parts){
        ArrayList<Double> uncs = new ArrayList(0);
        for(String part: parts)
            uncs.add(calculateUnc(part));
        double totalUnc = 0.0;
        for (double unc: uncs)
            totalUnc+=Math.pow(unc, 2);
        return Math.sqrt(totalUnc);
    }

    private static double calculateUnc(String part){
        boolean beenNum = false;
        boolean div = false;
        HashMap<Variable, Integer> theseVars = new HashMap();
        for(int q=0; q<part.length(); q++){
            char c = part.charAt(q);

            if (Character.isLetter(c)){
                String var = "";
                int position = q;
                for(int w=q; w<part.length(); w++){
                    if(Character.isLetter(part.charAt(w))){
                        var+=part.charAt(w);
                        q++;
                    }
                    else
                        break;
                }
                theseVars.put(vars.get(var),position);
            }
        }

        if (theseVars.isEmpty()){
            return 0.0;
        }
        else{
            int c =-1;
            double leftTot = 1.0;
            double leftUnc = 0.0;
            while(true){
                c++;
                if(!(c<part.length()))
                    break;
                char inQ = part.charAt(c);//pretty much switching on c
                if (Character.isDigit(inQ)){
                    beenNum = true;
                    String temp = "";
                    while(Character.isDigit(inQ) || inQ == '.'){
                        temp+=inQ;
                        c++;
                        if(!(c<part.length())){
                            if(div){
                                leftUnc/=Double.parseDouble(temp);
                                return leftUnc;
                            }
                            else{
                                leftUnc*=Double.parseDouble(temp);
                                return leftUnc;
                            }
                        }
                        inQ = part.charAt(c);
                    }
                    c--;
                    if(div){
                        leftTot/=Double.parseDouble(temp);
                        leftUnc/=Double.parseDouble(temp);
                        div = false;
                    }
                    else{
                        leftTot*=Double.parseDouble(temp);
                        leftUnc*=Double.parseDouble(temp);
                    }

                }
                else if (Character.isLetter(inQ)){
                    String temp = "";
                    while(Character.isLetter(inQ)){
                        temp+=inQ;
                        c++;
                        if(!(c<part.length())){
                            if(div && beenNum){
                                Variable vv = vars.get(temp);
                                double myTemp = leftTot;
                                leftTot/=vv.getValue();
                                leftUnc=leftTot*Math.sqrt(Math.pow(leftUnc/myTemp, 2) + Math.pow(vv.getUnc()/vv.getValue(), 2));
                                return leftUnc;
                            }
                            else if(!div && beenNum){
                                Variable vv = vars.get(temp);
                                double myTemp = leftTot;
                                leftTot*=vv.getValue();
                                leftUnc=leftTot*Math.sqrt(Math.pow(leftUnc/myTemp, 2) + Math.pow(vv.getUnc()/vv.getValue(), 2));
                                return leftUnc;
                            }
                            else if(!div){
                                Variable vv = vars.get(temp);
                                leftTot=vv.getValue();
                                leftUnc=vv.getUnc();
                                return leftUnc;
                            }
                        }
                        inQ = part.charAt(c);
                    }
                    c--;
                    if(div && beenNum){
                        Variable vv = vars.get(temp);
                        double myTemp = leftTot;
                        leftTot/=vv.getValue();
                        leftUnc=leftTot*Math.sqrt(Math.pow(leftUnc/myTemp, 2) + Math.pow(vv.getUnc()/vv.getValue(), 2));
                        div = false;
                    }
                    else if(!div && beenNum){
                        Variable vv = vars.get(temp);
                        double myTemp = leftTot;
                        leftTot*=vv.getValue();
                        leftUnc=leftTot*Math.sqrt(Math.pow(leftUnc/myTemp, 2) + Math.pow(vv.getUnc()/vv.getValue(), 2));
                    }
                    else if(!div){
                        Variable vv = vars.get(temp);
                        leftTot=vv.getValue();
                        leftUnc=vv.getUnc();
                        return leftUnc;
                    }
                    beenNum=true;
                }
                else if(inQ == '/'){
                    div= true;
                }
                else if(inQ == '*'){}
            }
            return leftUnc;
        }
    }

    public static ArrayList<Variable> findAllVars(String eq){
        vars.clear();
        ArrayList<Variable> vs = new ArrayList(0);
        for (int i=0; i<eq.length(); i++){
            String temp ="";
            if(Character.isLetter(eq.charAt(i))){
                while(i<eq.length() && Character.isLetter(eq.charAt(i))){
                    temp+=eq.charAt(i);
                    i++;
                }
                Variable my = new Variable(temp);
                if(!vars.containsKey(my.getName())) {
                    vars.put(my.getName(), my);
                    vs.add(my);
                }
            }
        }
        return vs;
    }
}