package com.example.restrobooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
     Button mybtn1;
     Button Register;
     EditText e1;
     EditText e2;
    String usrnm="1234";
    String pswrd="abc";
    TextView mytext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1=findViewById(R.id.phoneno);
        e2=findViewById(R.id.pswd);
        mybtn1=findViewById(R.id.mybutton1);
        Register=findViewById(R.id.mybutton2);

        mybtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(usrnm.equals(String.valueOf(e1)) && pswrd.equals(String.valueOf(e2))) {
                  //  mytext.setText("logged in");
                    Intent intent1 = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent1);
                    finish();
               // }
            }
        });
    }

}
