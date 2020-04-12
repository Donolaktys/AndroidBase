package ru.geekbrains.lesson_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LocationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        String[] city = {"Москва", "Воронеж", "Смоленск"};

        ListView lvCity = (ListView) findViewById(R.id.lvCity);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, city);

        lvCity.setAdapter(adapter);
    }
}
