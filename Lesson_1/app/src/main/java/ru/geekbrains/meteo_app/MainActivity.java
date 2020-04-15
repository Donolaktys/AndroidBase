package ru.geekbrains.meteo_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeShortToast("Created");

        TextView localityChoice = findViewById(R.id.localityChoice);
        ImageButton settingsBtn = findViewById(R.id.settingsBtn);
        Button oneDayBtn  = findViewById(R.id.oneDayBtn);
        Button threeDaysBtn  = findViewById(R.id.threeDaysBtn);
        Button weekBtn  = findViewById(R.id.weekBtn);

        //обработка нажатия кнопок на первом экране
            //
            // выбор местоположения, открытие экрана выбора
        localityChoice.setOnClickListener(v -> {
        Intent locationIntent = new Intent(MainActivity.this, LocationActivity.class);

        startActivity(locationIntent);
        });

            //обработка нажатия кнопок выбора вариантов отображения
        oneDayBtn.setOnClickListener(v -> {
            makeShortToast("\"1 день\"");
        });

        threeDaysBtn.setOnClickListener(v -> {
            makeShortToast("\"3 дня\"");
        });

        weekBtn.setOnClickListener(v -> {
            makeShortToast("\"неделя\"");
        });

            // нажатие на кнопку настроек, переход на экран настройки приложения
        settingsBtn.setOnClickListener(v -> {
            makeShortToast("\"Настройки\"");
            Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);

            startActivity(settingsIntent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        makeShortToast("Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeShortToast("Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeShortToast("Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeShortToast("Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeShortToast("Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeShortToast("Destroyed");
    }

    private void makeShortToast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
