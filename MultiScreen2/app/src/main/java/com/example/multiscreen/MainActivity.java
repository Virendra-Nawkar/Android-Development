package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.multiscreen.ORDER";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void validate (View view){
        Intent intent = new Intent(this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.Textview1);
        EditText editText2 = findViewById(R.id.Textview2);
        EditText editText3 = findViewById(R.id.Textview3);

        if (editText1.getText().toString().equals("")
                || editText2.getText().toString().equals("")
                || editText3.getText().toString().equals("")){
            editText1.setError("Please enter your order");

            View b = findViewById(R.id.placeOrder);
            b.setVisibility(view.INVISIBLE);
        }

        String message = "Order for "+ editText1.getText().toString() + ","
                + editText2.getText().toString()+ "&"
                + editText3.getText().toString() + "\n has been successfully Placed";
        intent.putExtra(MSG, message);
        startActivity(intent);

    }
    public void placeOrder (View view){

    }
}