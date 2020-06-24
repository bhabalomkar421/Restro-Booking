package com.example.restrobooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    Button myimgbtn1;
    Button myimgbtn2;
    Button myimgbtn3;
    Button myimgbtn4;
    Button myimgbtn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        myimgbtn1=(Button)findViewById(R.id.imageButton1);
        myimgbtn2=(Button)findViewById(R.id.imageButton2);
        myimgbtn3=(Button)findViewById(R.id.imageButton3);
        myimgbtn4=(Button)findViewById(R.id.imageButton4);
        myimgbtn5=(Button)findViewById(R.id.imageButton5);
        myimgbtn1.setOnClickListener(this);
        myimgbtn2.setOnClickListener(this);
        myimgbtn3.setOnClickListener(this);
        myimgbtn4.setOnClickListener(this);
        myimgbtn5.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        switch(view.getId())
        {
            case R.id.imageButton1: {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeActivity.this, HotelActivity1.class);
                        startActivity(intent);
                        finish();
                    }
                }).start();
                break;
            }
            case R.id.imageButton2: {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeActivity.this, HotelActivity2.class);
                        startActivity(intent);
                        finish();
                    }
                }).start();
                break;
            }

            case R.id.imageButton3: {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeActivity.this, HotelActivity3.class);
                        startActivity(intent);
                        finish();
                    }
                }).start();
                break;
            }
            case R.id.imageButton4: {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeActivity.this, HotelActivity4.class);
                        startActivity(intent);
                        finish();
                    }
                }).start();
                break;

            }
            case R.id.imageButton5: {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(HomeActivity.this, HotelActivity5.class);
                        startActivity(intent);
                        finish();
                    }
                }).start();
                break;
            }

          }
        }
}
