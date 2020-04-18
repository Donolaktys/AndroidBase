package ru.geekbrains.meteo_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MakeLog.lifeCycle(this,"Created");

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
            MakeLog.click(this,"\"1 день\"");
        });

        threeDaysBtn.setOnClickListener(v -> {
            MakeLog.click(this,"\"3 дня\"");
        });

        weekBtn.setOnClickListener(v -> {
            MakeLog.click(this,"\"неделя\"");
        });

            // нажатие на кнопку настроек, переход на экран настройки приложения
        settingsBtn.setOnClickListener(v -> {
            MakeLog.click(this,"\"Настройки\"");
            Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);

            startActivity(settingsIntent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        MakeLog.lifeCycle(this,"Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MakeLog.lifeCycle(this,"Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        MakeLog.lifeCycle(this,"Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MakeLog.lifeCycle(this,"Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MakeLog.lifeCycle(this,"Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MakeLog.lifeCycle(this,"Destroyed");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        MakeLog.lifeCycle(this, "Сохранение данных");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        MakeLog.lifeCycle(this, "Восстановление данных");
    }

}
