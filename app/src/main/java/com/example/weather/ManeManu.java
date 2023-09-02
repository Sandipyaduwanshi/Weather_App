package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ManeManu extends AppCompatActivity {
TextView auto_date,name,Digri_shoe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mane_manu);
        getSupportActionBar().hide();
        AllInslige();

        Date currentDate = new Date();
//
//        // Format the date\
        SimpleDateFormat dayNameFormat = new SimpleDateFormat("EEEE", Locale.getDefault());
        String dayName = dayNameFormat.format(currentDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat(" M");
        String formattedDate = dateFormat.format(currentDate);

        // Set the formatted date to the TextView
//        auto_date.setText("" + dayName);
        auto_date.setText(dayName + formattedDate);


        String temperature = "\u00B0C";
        Digri_shoe.setText(temperature);

    }



    private void AllInslige() {

        auto_date = findViewById(R.id.auto_date);
        name = findViewById(R.id.name);
        Digri_shoe = findViewById(R.id.Digri_shoe);
    }
}