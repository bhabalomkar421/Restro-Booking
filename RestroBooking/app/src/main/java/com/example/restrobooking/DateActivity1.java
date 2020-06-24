package com.example.restrobooking;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;
public class DateActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       final TextView DisplayDate;
       DatePickerDialog.OnDateSetListener DateSetListener=null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date1);
        DisplayDate=(TextView) findViewById(R.id.vtDate);

        final DatePickerDialog.OnDateSetListener finalDateSetListener = DateSetListener;
        DisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal= Calendar.getInstance();
                int Year = cal.get(Calendar.YEAR);
                int Month = cal.get(Calendar.MONTH);
                int Day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        DateActivity1.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        finalDateSetListener,
                        Year,Month,Day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                DisplayDate.setText("15/9/2019");
            }
        });

        DateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                //Log.d(TAG, "onDateSet: dd/mm/yyyy"+dayOfMonth+"/"+month+"/"+year);
                String date=dayOfMonth+"/"+month+"/"+year;
                //DisplayDate.setText("15/9/2019");

                //Toast.makeText();
              //  Toast.makeText(getApplicationContext(),date,Toast.LENGTH_LONG).show();

            }
        };
    }
}
