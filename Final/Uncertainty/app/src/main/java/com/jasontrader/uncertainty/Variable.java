package com.jasontrader.uncertainty;

import android.content.Intent;
import android.view.View;


/**
 *
 * @author Jason Trader
 */
public class Variable {
    private double value, uncertainty;
    private String name;

    public Variable(String v, MainActivity myView, View vi){

        name = v;
        myView.setMess(String.format("Wild variable %s appeared\nWhat is its value\n and uncertainty?", name));
        myView.sendMessage(vi);
        //System.out.printf("What is the uncertainty of %s?\n", name);
       // uncertainty = my.nextDouble();
    }

    public String getName(){
        return name;
    }

    public double getValue(){
        return value;
    }

    public double getUnc(){
        return uncertainty;
    }

    public void setValue(double value){
        this.value=value;
    }

    public void setUnc(double unc){
        uncertainty = unc;
    }
}

