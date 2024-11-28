package com.mobileapp.task8_emailapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView username;
    Button emailBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        emailBtn = findViewById(R.id.emailbtn);
        Intent i = getIntent();
        String email = i.getStringExtra("email");
        String msg = i.getStringExtra("message");
        username = findViewById(R.id.name);
        String un = i.getStringExtra("name");
        username.setText("Hello, \n " + un);

        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:" + email));
                intent.setType("message/rfc822");  // Ensures email apps handle it
                intent.putExtra(Intent.EXTRA_SUBJECT, "Testing the implicit");
                intent.putExtra(Intent.EXTRA_TEXT, msg);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity2.this, "No email app available", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity2.this, "Go to Gmail", Toast.LENGTH_SHORT).show();
            }
        });

    }
}