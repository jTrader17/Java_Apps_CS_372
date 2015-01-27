package com.jasontrader.uncertainty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private EditText equation;
    private String mess;
    private static ArrayList<Variable> vars = new ArrayList(0);
    private static int varCount = 0;

    public void setMess(String s){
        mess = s;
    }

    public void addVar(Variable v){
        vars.add(v);
    }

    public static void update(double value, double unc){
        vars.get(varCount).setValue(value);
        vars.get(varCount).setUnc(unc);
        varCount++;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){

        EditText userEq = (EditText) this.findViewById(R.id.equa);
        String eq = userEq.getText().toString();
        double d = Calc.calculate(eq, this, v);
        double u = Calc.getUnc(eq);
    }

    public void sendMessage(View v){
        Intent intent = new Intent(this, NewVariables.class);
        intent.putExtra("com.jasontrader.uncertainty.MESSAGE", mess);
        startActivity(intent);

    }
}
