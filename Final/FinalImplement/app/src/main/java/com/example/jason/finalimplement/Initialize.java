package com.example.jason.finalimplement;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class Initialize extends ActionBarActivity {
    private String eq;
    private ArrayList<Variable> theseVars;
    private ArrayList<EditText> entries = new ArrayList(0);
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initialize);

        Intent in = this.getIntent();
        eq = in.getStringExtra("theWholeEquation");
        theseVars = Calc.findAllVars(eq);
        player = MediaPlayer.create(getApplicationContext(), R.raw.battle);
        player.start();

        LinearLayout l = (LinearLayout) this.findViewById(R.id.def);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0,0,0,10);
        TextView start = new TextView(this);
        start.setLayoutParams(lp);
        start.setText("Whoa! Wild variables appeared!");
        start.setTextColor(Color.RED);
        start.setTextSize(22);
        l.addView(start);

        for (int i=0; i<theseVars.size(); i++) {
            TextView prompt = new TextView(this);
            prompt.setLayoutParams(lp);
            prompt.setText(String.format("What is the value of %s?", theseVars.get(i).getName()));

            EditText value = new EditText(this);
            value.setLayoutParams(lp);
            value.setHint("value goes here");
            value.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
            entries.add(value);

            EditText unc = new EditText(this);
            unc.setLayoutParams(lp);
            unc.setHint("uncertainty goes here");
            unc.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
            entries.add(unc);

            l.addView(prompt);
            l.addView(value);
            l.addView(unc);
        }
        Button b = new Button(this);
        b.setText("Submit!");
        lp.gravity = Gravity.RIGHT;
        b.setLayoutParams(lp);
        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                initButtonClick(v);
            }
        });
        l.addView(b);
    }

    public void initButtonClick(View v){
        double unc, value = 0.0;
        for(int i = 0; i<entries.size(); i++){
            unc = Double.parseDouble(entries.get(i).getText().toString());
            if(i%2==1){
                int temp = i/2;
                theseVars.get(temp).setValue(value);
                theseVars.get(temp).setUncertainty(unc);
            }
            value = unc;
        }
        player.stop();
        Intent in = new Intent(this, Display.class);
        in.putExtra("finalTimeWholeEq", eq);
        startActivity(in);
        this.finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_initialize, menu);
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
