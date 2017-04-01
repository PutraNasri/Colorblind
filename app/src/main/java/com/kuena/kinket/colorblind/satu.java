package com.kuena.kinket.colorblind;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class satu extends Activity {
private EditText a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);

        a=(EditText)findViewById(R.id.a);
    }
    public void next (View v){
        String hasil = "";
        int data = 0 ;
        if (a.getText().toString().equals("12")) {
            int as = data + 1 ;
            hasil=String.valueOf(as);
        }
        else{
            int as = data + 0 ;
            hasil=String.valueOf(as);
        }
        Toast.makeText(this,hasil, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, dua.class);
        intent.putExtra("data",hasil);
        startActivity(intent);
    }
}
