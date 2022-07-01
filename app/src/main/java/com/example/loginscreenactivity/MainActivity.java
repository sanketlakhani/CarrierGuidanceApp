package com.example.loginscreenactivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnnext;
    TextView txtskip;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        display();
    }

    private void display() {


        btnnext = findViewById(R.id.btnnext);
        txtskip = findViewById(R.id.txtskip);



        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Screen_Activity2.class);
                startActivity(i);

            }
        });

        txtskip.setOnClickListener(new View.OnClickListener() {
            private Object MainActivity;

            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Signup_Activity.class);
                startActivity(i);

            }
        });
    }
}