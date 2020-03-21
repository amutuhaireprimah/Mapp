package com.example.mappl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class ActivityTwo extends AppCompatActivity {

    TextView c_file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        c_file=findViewById(R.id.file);
        String  txt ="";

        try {
            InputStream inputStream = getAssets().open("cprogram.cpp");
            int size = inputStream.available();
            byte[]buffer=new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            txt=new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        c_file.setText((CharSequence)txt);
    }
}
