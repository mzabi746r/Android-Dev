package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    EditText eT;
    TextView tV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        eT=findViewById(R.id.et);
        tV=findViewById(R.id.tv);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(eT.getText().toString());
                int total=(val - 32)*5/9;
                tV.setText("the ans is:"+total+"°C");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(eT.getText().toString());
                int total=(val * 9/5) + 32;
                tV.setText("the ans is:"+total+"°F");
            }
        });



    }
}