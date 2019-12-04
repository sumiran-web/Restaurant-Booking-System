package com.example.restaurantbookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etUsr, etPwd;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsr = findViewById(R.id.etUsr);
        etPwd = findViewById(R.id.etPwd);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chkUn = etUsr.getText().toString();
                String chkPw = etPwd.getText().toString();

                if (chkUn.equals("admin") && chkPw.equals("admin")) {
                    Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(),"Incorrect username or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
