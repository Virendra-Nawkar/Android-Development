package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void send (View view){
        Toast.makeText(this, "sending data form app....", Toast.LENGTH_SHORT).show();
    }
    public void Receive (View view){
        Toast.makeText(this, "Receive data form app....", Toast.LENGTH_SHORT).show();
    }
    public void Delete (View view){
        Toast.makeText(this, "Deleting data form app....", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}