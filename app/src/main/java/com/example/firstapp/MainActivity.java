package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mlistview = (ListView) findViewById(R.id.listview);

        //WITH IMAGE
        City city1 = new City("Paris1", "The Good City", R.drawable.gambar);
        City city2 = new City("Paris2", "The Good City", R.drawable.gambar2);
        City city3 = new City("Paris3", "The Good City", R.drawable.gambar);
        City city4 = new City("Paris4", "The Good City", R.drawable.gambar2);
        City city5 = new City("Paris5", "The Good City", R.drawable.gambar);
        City city6 = new City("Paris5", "The Good City", R.drawable.gambar);
        City city7 = new City("Paris5", "The Good City", R.drawable.gambar);
        City city8 = new City("Paris5", "The Good City", R.drawable.gambar2);
        //JUST IMAGE
//        City city1 = new City(R.drawable.gambar);
//        City city2 = new City(R.drawable.gambar2);
//        City city3 = new City(R.drawable.gambar);
//        City city4 = new City(R.drawable.gambar2);
//        City city5 = new City(R.drawable.gambar);
//        City city6 = new City(R.drawable.gambar);
//        City city7 = new City(R.drawable.gambar);
//        City city8 = new City(R.drawable.gambar2);
        //NON IMAGE
//        City city1 = new City("Paris1", "The Good City");
//        City city2 = new City("Paris2", "The Good City");
//        City city3 = new City("Paris3", "The Good City");
//        City city4 = new City("Paris4", "The Good City");
//        City city5 = new City("Paris5", "The Good City");
//        City city6 = new City("Paris5", "The Good City");
//        City city7 = new City("Paris5", "The Good City");
//        City city8 = new City("Paris5", "The Good City");

        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);
        cityList.add(city5);
        cityList.add(city6);
        cityList.add(city7);
        cityList.add(city8);

        customAdapter adapter = new customAdapter(this, R.layout.custom_layout, cityList);
        mlistview.setAdapter(adapter);
    }
}