package com.example.loginscreenactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Screen_Activity extends AppCompatActivity {


    AppCompatButton btnnext4;
    EditText edemail,edpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_screen);

        display();
    }

    private void display() {

        edemail=findViewById(R.id.edemail);
        edpassword=findViewById(R.id.edpassword);
        btnnext4=findViewById(R.id.btnnext4);

        btnnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=edemail.getText().toString();
                String password=edpassword.getText().toString();

                if (email.isEmpty())
                {
                    Toast.makeText(Login_Screen_Activity.this, "Please enter email", Toast.LENGTH_SHORT).show();
                }
                else if(password.isEmpty())
                {
                    Toast.makeText(Login_Screen_Activity.this, "Please enter password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Login_Screen_Activity.this, "Success", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}