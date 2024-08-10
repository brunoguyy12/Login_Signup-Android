package com.example.login_signup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    EditText em, pass;
    TextView signup;
    AppCompatButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        em = findViewById(R.id.emailInput);
        pass = findViewById(R.id.passwordInput);

        signup = findViewById(R.id.gotoSignup);
        login = findViewById(R.id.loginBtn);

        login.setOnClickListener(view -> {
            if(em.getText().toString().length() < 3 || pass.getText().toString().length() < 3 ){
                String text = "Enter valid credentials";
                int duration = Toast.LENGTH_SHORT;
                Toast tst = Toast.makeText(this, text, duration);
                tst.show();
            }
            else{
                Intent res = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(res);
            }
        });

        signup.setOnClickListener(view -> {
            Intent signup = new Intent(getApplicationContext(), Signup.class);
            startActivity(signup);
        });
    }
}