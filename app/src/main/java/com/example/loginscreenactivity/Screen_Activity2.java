package com.example.loginscreenactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Screen_Activity2 extends AppCompatActivity {

    AppCompatButton btnnext2;
    TextView txtskip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_screen2);

        display();
    }

    private void display() {

        btnnext2=findViewById(R.id.btnnext2);
        txtskip2=findViewById(R.id.txtskip2);

        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Screen_Activity2.this,Screen_activity3.class);
                startActivity(i);

            }
        });
        txtskip2.setOnClickListener(new View.OnClickListener() {
            private Object MainActivity;

            @Override
            public void onClick(View view) {

                Intent i = new Intent(Screen_Activity2.this, Signup_Activity.class);
                startActivity(i);

            }
        });
    }
}