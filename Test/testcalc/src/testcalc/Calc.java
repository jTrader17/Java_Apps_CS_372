/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcalc;
import java.util.HashMap; 
import java.util.ArrayList;
import java.lang.Math;

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
        vars.clear();
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
    
    public static void getUnc(String eq){ 
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
            
        }
        
        return 0.0;
    }
}


