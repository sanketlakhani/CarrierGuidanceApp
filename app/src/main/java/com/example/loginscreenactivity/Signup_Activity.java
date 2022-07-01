package com.example.loginscreenactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup_Activity extends AppCompatActivity {

    AppCompatButton btnnext4;
    EditText edtemail, edtname, edtpassword;
    TextView txtlogin;
    String emaill = "@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_signup);

        display();
    }

    public void display() {

        edtemail = findViewById(R.id.edtemail);
        edtname = findViewById(R.id.edtname);
        edtpassword = findViewById(R.id.edtpassword);
        btnnext4 = findViewById(R.id.btnnext4);
        txtlogin=findViewById(R.id.txtlogin);

        btnnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtname.getText().toString();
                String email = edtemail.getText().toString();
                String password = edtpassword.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(Signup_Activity.this, "Please enter name", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(Signup_Activity.this, "Please enter email", Toast.LENGTH_SHORT).show();
                } else if (!email.endsWith(emaill)) {
                    Toast.makeText(Signup_Activity.this, "Invalid Email", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(Signup_Activity.this, "Please enter password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(Signup_Activity.this, Login_Screen_Activity.class);
                    startActivity(i);
                }
            }
        });
        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Signup_Activity.this,Login_Screen_Activity.class);
                startActivity(i);

            }
        });
    }
}