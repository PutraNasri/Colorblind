package com.kuena.kinket.colorblind;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View v){
        Intent hasilIntent = new Intent(MainActivity.this, satu.class);
        startActivity(hasilIntent);
        finish();
    }
}
