package com.example.jason.finalimplement;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import java.util.ArrayList;

/**
 * Allows user to input equation
 */
public class Equation extends ActionBarActivity {

    /**
     *
     * @param savedInstanceState
     * makes interface
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_equation, menu);
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

    /**
     *
     * @param v
     * open activity for allowing user to input data
     */
    public void equationClick(View v){
        EditText entry = (EditText) this.findViewById(R.id.entry);
        String eq = entry.getText().toString();
        Intent i = new Intent(this, Initialize.class);
        i.putExtra("theWholeEquation", eq);
        startActivity(i);
        entry.setText("");
    }

    /**
     *
     * @param v
     * kill app
     */
    public void end(View v){
        this.finish();
    }
}
