package com.example.mappl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText message = (EditText) findViewById(R.id.message);
        Toast.makeText(this, "Sending message " + message.getText().toString(),
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("MESSAGE", message.getText().toString()); startActivity(intent);
        message.setText("");
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.con:
                startActivity(new Intent(this, ActivityTwo.class));
                return true;
            case R.id.gal:
                startActivity(new Intent(this, ActivityTwo.class));
                return true;
            case R.id.list:
                startActivity(new Intent(this, ListView.class));
                return true;

            case R.id.cp:
                startActivity(new Intent(this,ActivityTwo.class));
                return  true;

            default:

                return super.onOptionsItemSelected(item);
        }
    }
}
