package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHello = findViewById(R.id.textView2);
        txtHello.setText("You Say Hello");
    }

    public void helloBtnOnClick(View view) {
        EditText personName = findViewById(R.id.editTextName);
        TextView txtHello = findViewById(R.id.textView2);
//        if(txtHello.getText() == "You Say Hello") {
//            txtHello.setText("I Say Goodbye");
//        } else {
//            txtHello.setText("You Say Hello");
//        }
        txtHello.setText("Hello " + personName.getText().toString() + ", Welcome To Earth");

    }
}