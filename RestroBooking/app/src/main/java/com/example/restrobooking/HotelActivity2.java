package com.example.restrobooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HotelActivity2 extends AppCompatActivity {
    Button avail;
    Button book;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel2);
        avail=findViewById(R.id.btn2);
        book=findViewById(R.id.bookbutton);
        t1=findViewById(R.id.mytxt);
        avail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Sorry, No tables available");
                Toast.makeText(getApplicationContext(),"Available Tables: 2", Toast.LENGTH_LONG).show();
            }
        });

    }
}
