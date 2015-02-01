package com.example.jason.finalimplement;

import android.view.View;

/**
 *
 * @author Jason Trader
 * Holds variable data
 */
public class Variable {
    private double value, uncertainty;
    private String name;

    /**
     *
     * @param v
     * makes a new variable
     */
    public Variable(String v) {
        name = v;
    }

    /**
     *
     * @return name
     *
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     *
     * @return uncertainty
     */
    public double getUnc() {
        return uncertainty;
    }

    /**
     *
     * @param value
     * sets value of variable
     */
    public void setValue(double value){
        this.value = value;
    }

    /**
     *
     * @param unc
     * sets uncertainty of variable
     */
    public void setUncertainty(double  unc){
        this.uncertainty = unc;
    }
}

