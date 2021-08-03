package com.gurjeet.customelistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity {
    TextView title,population,area;
    ImageView flag;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        title=findViewById(R.id.txvCoName);
        population=findViewById(R.id.txvPop);
        area=findViewById(R.id.txvArea);
        flag=findViewById(R.id.imvCountry);
        back=findViewById(R.id.btnBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CountryActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        title.setText(MainActivity.countries.get(MainActivity.index).getCountryName());
        population.setText(MainActivity.countries.get(MainActivity.index).getPopulation());
        area.setText(MainActivity.countries.get(MainActivity.index).getArea());
        flag.setImageResource(MainActivity.countries.get(MainActivity.index).getFlagImage());
    }
}