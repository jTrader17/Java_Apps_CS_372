package com.jasontrader.trial2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import android.view.View;

/**
 *
 * @author Jason Trader
 */
public class Variable {
    public double value, uncertainty;
    public String valueP;
    private String name;

    public Variable(String v, View vi, MainActivity my){
        name = v;
        valueP = String.format("Wild variable %s appeared!\nWhat is its value\n and uncertainty?", name);
        MainActivity.vars.add(this);
        my.openNew(vi);
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
}

