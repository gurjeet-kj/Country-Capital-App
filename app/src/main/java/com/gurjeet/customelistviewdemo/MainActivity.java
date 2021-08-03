package com.gurjeet.customelistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView countryList;
    public static ArrayList<Country>countries=new ArrayList<>();//now this array list accessible

    public static int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryList=findViewById(R.id.lvCountryList);
        fillData();

        //Create Adapter: A customized arrayAdapter
        countryList.setAdapter(new CountryAdapter(this,countries));

        countryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                index=position;
                //intent will be between main activity and country activity
                Intent intent=new Intent(MainActivity.this,CountryActivity.class);
                startActivity(intent);

            }
        });
    }

    public void fillData(){
        countries.add(new Country("Canada","Ottawa",R.drawable.canada,"37.59 million","9.985 million KM Sq"));
        countries.add(new Country("USA","Washington",R.drawable.usa,"385.2 million","9.834 million KM Sq"));
        countries.add(new Country("India","New Delhi",R.drawable.india,"1.366 billion","3.287 million km²"));
        countries.add(new Country("Iran","Tehran",R.drawable.iran,"82.91 million","1.648 million km²"));
        countries.add(new Country("Russia","Moscow",R.drawable.russia,"916 million","783,562 km²"));
    }

}