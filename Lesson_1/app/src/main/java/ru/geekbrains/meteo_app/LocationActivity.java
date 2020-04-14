package ru.geekbrains.meteo_app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LocationActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        /**
         * Вывести список популярных городов
         * для примера выводится как ListView с подготовленным списком
         */
        ListView lvCity = (ListView) findViewById(R.id.lvCity);
        String[] city = {"Москва", "Воронеж", "Смоленск"};
        ArrayAdapter<String> sAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, city);
        lvCity.setAdapter(sAdapter);

    }


}
