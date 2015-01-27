package com.jasontrader.trial2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class FinalShow extends ActionBarActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_show);
        Intent i = getIntent();
        TextView my = (TextView) findViewById(R.id.total);
        String myFinal = String.format("The total is: %f\nThe uncertainty is: %f\nThe percent uncertainty is: %f", MainActivity.c, MainActivity.u, (MainActivity.u / MainActivity.c) * 100);
        my.setText(myFinal.toString());
        player = MediaPlayer.create(getApplicationContext(), R.raw.victory);
        player.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_final_show, menu);
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