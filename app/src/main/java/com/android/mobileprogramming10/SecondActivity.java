package com.android.mobileprogramming10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        Intent inIntent=getIntent();
        int num1=inIntent.getIntExtra("Num1",0);
        int num2=inIntent.getIntExtra("Num2",0);

        int hapValue = num1+num2;

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent=new Intent(SecondActivity.this,MainActivity.class);
                outIntent.putExtra("Hap",hapValue);
                setResult(RESULT_OK, outIntent);
                finish();
            }
        });

    }
}