package com.kuena.kinket.colorblind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sepuluh extends AppCompatActivity {
    String datax;
    private EditText a ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepuluh);
        a=(EditText)findViewById(R.id.a);
        Intent intent = getIntent();
        datax = intent.getStringExtra("data");
    }
    public void next(View v){
        String hasil = "";
        int data = 0 ;
        if (a.getText().toString().equals("7")) {
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

        Intent intent = new Intent(this, Scor.class);
        intent.putExtra("data",hasil);
        startActivity(intent);
    }
}
