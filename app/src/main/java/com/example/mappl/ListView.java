package com.example.mappl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView=findViewById(R.id.list);
        final ArrayList<String>arrayList = new ArrayList<>();
        arrayList.add("Name");
        arrayList.add("Age");
        arrayList.add("Sex");
        arrayList.add("Places");
        arrayList.add("Restaurants");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           public void onItemClick(AdapterView<?> adapterView, View view,int i, long l){

           }
        });
    }

}
