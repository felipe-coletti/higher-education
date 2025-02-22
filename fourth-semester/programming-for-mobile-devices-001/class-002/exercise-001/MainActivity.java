package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText TextInputEditText = findViewById(R.id.TextInputEditText);
        EditText TextInputEditText2 = findViewById(R.id.TextInputEditText2);
        EditText TextInputEditText3 = findViewById(R.id.TextInputEditText3);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String name = TextInputEditText.getText().toString();
                String email = TextInputEditText2.getText().toString();
                String telephone = TextInputEditText3.getText().toString();
            }
        });
    }
}
