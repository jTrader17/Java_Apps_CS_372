package com.jasontrader.trial2;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class NewVariableActivity extends ActionBarActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_variable);
        Intent i = getIntent();
        String prompt = String.format("Wild Variable appeared!\nWhat is the value and\nuncertainty of variable %d", MainActivity.var_count+1);
        player = MediaPlayer.create(getApplicationContext(), R.raw.battle);
        //player.start();
        TextView my = (TextView) this.findViewById(R.id.mess);
        my.setText(prompt);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Pokemon GB.ttf");
        my.setTypeface(myTypeface);
    }

    public void clicked(View v){
        EditText myV = (EditText)this.findViewById(R.id.value);
        double varValue= Double.parseDouble(myV.getText().toString());
        EditText myU = (EditText)this.findViewById(R.id.unc);
        double varUnc= Double.parseDouble(myU.getText().toString());
        MainActivity.update(varValue, varUnc);
        player.stop();
        this.finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_variable, menu);
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
}
