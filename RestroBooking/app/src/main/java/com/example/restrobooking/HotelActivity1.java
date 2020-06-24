package com.example.restrobooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;


public class HotelActivity1 extends AppCompatActivity {
    Button avail;
    Button book;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel1);
        avail=findViewById(R.id.btn2);
        book=findViewById(R.id.bookbutton);
        t1=findViewById(R.id.mytxt);
        avail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Available Tables : 2 ");
                Toast.makeText(getApplicationContext(),"Available Tables: 2", Toast.LENGTH_LONG).show();
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HotelActivity1.this,DateActivity1.class);
                startActivity(i);
                finish();
            }
        });
    }
}
