package ru.geekbrains.meteo_app;

import android.content.Intent;
import android.icu.util.UniversalTimeScale;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements Constants{
    private TextView localityChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MakeLog.lifeCycle(this,"MAIN Created");

        localityChoice = findViewById(R.id.localityChoice);
        ImageButton settingsBtn = findViewById(R.id.settingsBtn);
        Button oneDayBtn  = findViewById(R.id.oneDayBtn);
        Button threeDaysBtn  = findViewById(R.id.threeDaysBtn);
        Button weekBtn  = findViewById(R.id.weekBtn);
        TextView infoLink = findViewById(R.id.infoLink);
        String link = getApplicationContext().getString(R.string.link);

        //обработка нажатия кнопок на первом экране
            //
            // выбор местоположения, открытие экрана выбора
        localityChoice.setOnClickListener(v -> {
        Intent locationIntent = new Intent(MainActivity.this, LocationActivity.class);
            startActivityForResult(locationIntent, 1);
        });

            //дополнительная информация
        infoLink.setOnClickListener(v -> {
            Intent info = new Intent(Intent.ACTION_VIEW, Uri.parse(link + localityChoice.getText()));
            startActivity(info);
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
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        MakeLog.lifeCycle(getApplicationContext(), "onActivityResult");
        if (data == null) {return;}
        String city = data.getStringExtra(CITY);
        localityChoice.setText(city);
    }

    @Override
    protected void onStart() {
        super.onStart();
        MakeLog.lifeCycle(this,"MAIN Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MakeLog.lifeCycle(this,"MAIN Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        MakeLog.lifeCycle(this,"MAIN Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MakeLog.lifeCycle(this,"MAIN Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MakeLog.lifeCycle(this,"MAIN Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MakeLog.lifeCycle(this,"MAIN Destroyed");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        MakeLog.lifeCycle(this, "MAIN Сохранение данных");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        MakeLog.lifeCycle(this, "MAIN Восстановление данных");
    }

}
