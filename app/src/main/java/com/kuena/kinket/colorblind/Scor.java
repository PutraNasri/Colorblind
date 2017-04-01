package com.kuena.kinket.colorblind;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Scor extends Activity {
    String datax;
    private TextView scr;
    private TextView fel;
    private TextView ne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scor);

        Intent intent = getIntent();
        datax = intent.getStringExtra("data");

        scr = (TextView)findViewById(R.id.scrr);
        scr.setText(datax);

        fel =(TextView)findViewById(R.id.fle);
        int axx = Integer.parseInt(datax);
        int fal = 10 - axx ;
        fel.setText(fal);

        if (axx>=8){
            ne=(TextView)findViewById(R.id.ne);
            ne.setText("Your eyes do not experience color blind");
        }
        else{
            ne.setText("check your eyes to an eye doctor, or you can repeat again");
        }

    }
    public void repeat(View v){

    }
}
