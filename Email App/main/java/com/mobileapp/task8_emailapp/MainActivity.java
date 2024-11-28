package com.mobileapp.task8_emailapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText msg = findViewById(R.id.msg);
        Button btn = findViewById(R.id.btn);

        // Button click listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nametext = name.getText().toString().trim();
                String emailtext = email.getText().toString().trim();
                String msgtext = msg.getText().toString().trim();

                // Check if name and email fields are empty
                if (nametext.isEmpty() || emailtext.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both name and email", Toast.LENGTH_SHORT).show();
                } else {
                    // Navigate to MainActivity2
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("name", nametext);
                    i.putExtra("email", emailtext);
                    i.putExtra("message", msgtext);
                    startActivity(i);
                }
            }
        });
    }
}
