package com.example.jason.finalimplement;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Display extends ActionBarActivity {
    private String eq;
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        player = MediaPlayer.create(getApplicationContext(), R.raw.victory);
        player.start();
        Intent in = this.getIntent();
        eq = in.getStringExtra("finalTimeWholeEq");
        double totVal, totUnc;
        totVal = Calc.calculate(eq);
        totUnc = Calc.getUnc(eq);
        TextView disp = (TextView) this.findViewById(R.id.finalDisp);
        String temp = String.format("The total value is : %f\nThe total uncertainty is: %f\nThe percent uncertainty is: %f", totVal, totUnc, totUnc/totVal*100) + "%";
        disp.setText(temp);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display, menu);
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

    public void finalClick(View v){
        player.stop();
        this.finish();
    }
}
