package com.example.cryptostressrelief;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends Activity {
    Button lilshit;
    TextView dedLilShitCounter;
    int dedlilshitcount = 0;
    public int hitpoints= 3;
    public int hitcount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        lilshit = findViewById(R.id.lilshit);

        dedLilShitCounter = findViewById(R.id.tv_dedlilshitcounter);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/whoasksyupu.ttf");
        dedLilShitCounter.setTypeface(typeface);

        lilshit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(hitcount == 0)
                {
                    lilshit.setBackgroundResource(R.drawable.starbust);
                    hitcount++;
                }

                if(hitcount == hitpoints)
                {
                    dedlilshitcount += 1;
                    String output = "Ded Lil Shit Counter: " + Integer.toString(dedlilshitcount) ;
                    dedLilShitCounter.setText(output);
                    lilshit.setBackgroundResource(R.drawable.dedstarbust);
                    hitcount = 0;
                }
                else
                    hitcount++;
            }

        });


    }

   /* public void updateLilShitCounter(int hitcount){
        if(hitcount == hitpoints)
        {
            dedlilshitcount += 1;
            String output = "Ded Lil Shit Counter: " + Integer.toString(dedlilshitcount) ;
            dedLilShitCounter.setText(output);
        }

    }*/
}
