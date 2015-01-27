package com.jasontrader.trial2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    public static ArrayList<Variable> vars = new ArrayList(0);
    public static int var_count = 0;
    public static double c, u;

    public static void update(double value, double unc){
        vars.get(var_count).value = value;
        vars.get(var_count).uncertainty=unc;
        var_count++;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNew(View v){
        Intent i = new Intent(this, NewVariableActivity.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v){
        EditText my = (EditText) this.findViewById(R.id.entered);
        String equ = my.getText().toString();
        my.setText("");
        c = Calc.calculate(equ, v, this);
        u = Calc.getUnc(equ);
    }

    public void end(View v){
        Intent in = new Intent(this, FinalShow.class);
        startActivity(in);
    }
}
