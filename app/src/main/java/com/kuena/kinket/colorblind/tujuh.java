package com.kuena.kinket.colorblind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class tujuh extends AppCompatActivity {
    String datax;
    private EditText a ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuh);
        a=(EditText)findViewById(R.id.a);
        Intent intent = getIntent();
        datax = intent.getStringExtra("data");
    }
    public void next(View v){
        String hasil = "";
        int data = 0 ;
        if (a.getText().toString().equals("35")) {
            int axx = Integer.parseInt(datax);
            int as = data + 1 + axx;
            hasil=String.valueOf(as);
        }
        else{
            int axx = Integer.parseInt(datax);
            int as = data + 0 + axx;
            hasil=String.valueOf(as);
        }
        Toast.makeText(this,hasil, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, delapan.class);
        intent.putExtra("data",hasil);
        startActivity(intent);
    }
}