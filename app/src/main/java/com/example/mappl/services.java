package com.example.mappl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class services extends AppCompatActivity implements View.OnClickListener {

    private Button Start;
    private  Button Stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        Start= findViewById(R.id.button2);
        Stop=findViewById(R.id.button);

        Start.setOnClickListener(this);
        Stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==Start){
            startService(new Intent(this, Ring.class));
        }
        else if (v==Stop){
            stopService(new Intent(this, Ring.class));

        }


    }
}
