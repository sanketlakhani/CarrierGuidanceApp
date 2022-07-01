package com.example.loginscreenactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Screen_activity3 extends AppCompatActivity {

    AppCompatButton btnnext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_screen3);

        display();

    }

    public void display() {
        btnnext3 = findViewById(R.id.btnnext3);

        btnnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Screen_activity3.this, Signup_Activity.class);
                startActivity(i);
            }
        });
    }
}