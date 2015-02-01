package com.example.jason.finalimplement;

import android.view.View;

/**
 *
 * @author Jason Trader
 */
public class Variable {
    private double value, uncertainty;
    private String name;

    public Variable(String v) {
        name = v;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public double getUnc() {
        return uncertainty;
    }

    public void setValue(double value){
        this.value = value;
    }

    public void setUncertainty(double  unc){
        this.uncertainty = unc;
    }
}

