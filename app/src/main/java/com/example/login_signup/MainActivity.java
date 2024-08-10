package com.example.login_signup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView startbtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);
        startbtn = findViewById(R.id.startBtn);

        startbtn.setOnClickListener(view -> {
            Intent gotoLogin = new Intent(getApplicationContext(), Login.class);
            startActivity(gotoLogin);
        });
    }
}