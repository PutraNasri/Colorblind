package com.kuena.kinket.colorblind;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class tiga extends Activity {
    String datax;
    private EditText a ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);
        a=(EditText)findViewById(R.id.a);

        Intent intent = getIntent();
        datax = intent.getStringExtra("data");
    }
    public void next(View v){
        String hasil = "";
        int data = 0 ;
        if (a.getText().toString().equals("6")) {
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

        Intent intent = new Intent(this, empat.class);
        intent.putExtra("data",hasil);
        startActivity(intent);
    }
}