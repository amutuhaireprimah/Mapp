package com.example.mappl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.List;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
public class ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        setTitle("List items");
        ListView listView = (ListView)findViewById(R.id.list);
        List<String> dataList = new ArrayList<String>();
        dataList.add("Names");
        dataList.add("Age");
        dataList.add("Sex");
        dataList.add("course");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ListView.this,
                android.R.layout.simple_list_item_multiple_choice, dataList);
        ListView.setAdapter(arrayAdapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Object clickItemObj = adapterView.getAdapter().getItem(index);
                Toast.makeText(ListView.this, " clicked " + clickItemObj.toString(),

                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
