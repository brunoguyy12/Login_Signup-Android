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

public class Signup extends AppCompatActivity {

    EditText name, email, password, confirm;
    TextView login;
    AppCompatButton signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        name = findViewById(R.id.nameEdit);
        email = findViewById(R.id.emailEdit);
        password = findViewById(R.id.passwordEdit);
        confirm = findViewById(R.id.confirmEdit);
        signup = findViewById(R.id.signupBtn);
        login = findViewById(R.id.gotoLogin);

        signup.setOnClickListener(view -> {
            if(email.getText().toString().length() < 3 || password.getText().toString().length() < 3 ||
                name.getText().toString().length() < 3 ){
                String text = "Sign up with enough informations";
                int duration = Toast.LENGTH_LONG;
                Toast tst = Toast.makeText(this, text, duration);
                tst.show();
            }
            else{
                if(confirm.getText().toString().equals(password.getText().toString())) {
                    Toast.makeText(this, "Signed up successfully!", Toast.LENGTH_LONG).show();
                    Intent res = new Intent(getApplicationContext(), home.class);
                    startActivity(res);
                }
                else{
                    String text = "Confirm password does not match";
                    int duration = Toast.LENGTH_LONG;
                    Toast tst = Toast.makeText(this, text, duration);
                    tst.show();
                }
            }
        });

        login.setOnClickListener(view -> {
            Intent login = new Intent(getApplicationContext(), Login.class);
            startActivity(login);
        });

    }
}