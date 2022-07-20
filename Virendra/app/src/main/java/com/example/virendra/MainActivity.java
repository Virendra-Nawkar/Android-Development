package com.example.virendra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Send (View view)
    {
        Toast.makeText(this,  "sending data....", Toast.LENGTH_SHORT).show();
    }
    public void Receive (View view)
    {
        Toast.makeText(this,  "sending data....", Toast.LENGTH_SHORT).show();
    }
    public void Delete (View view)
    {
        Toast.makeText(this,  "sending data....", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}