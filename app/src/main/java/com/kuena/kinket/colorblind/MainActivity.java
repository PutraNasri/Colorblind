package com.kuena.kinket.colorblind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View v){
        Intent hasilIntent = new Intent(MainActivity.this, Start.class);
        startActivity(hasilIntent);
        finish();
    }
}
