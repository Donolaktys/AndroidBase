package ru.geekbrains.meteo_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity {
private Button localityBtn;
private ImageButton settingsBtn;
private TextView infoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localityBtn = findViewById(R.id.localityBtn);
        infoText = findViewById(R.id.infoText);
        settingsBtn = findViewById(R.id.settingsBtn);
        Button oneDayBtn  = findViewById(R.id.oneDayBtn);
        Button threeDaysBtn  = findViewById(R.id.threeDaysBtn);
        Button weekBtn  = findViewById(R.id.weekBtn);

        //обработка нажатия кнопок на первом экране
            //
            // выбор местоположения, открытие экрана выбора
        localityBtn.setOnClickListener(v -> {
        Intent locationIntent = new Intent(MainActivity.this, LocationActivity.class);

        startActivity(locationIntent);
        });

            //обработка нижних кнопок, выбор вариантов отображения
        oneDayBtn.setOnClickListener(v -> {
            infoText.setText("Нажата кнопка \"1 день\"");
        });

        threeDaysBtn.setOnClickListener(v -> {
            infoText.setText("Нажата кнопка \"3 дня\"");
        });

        weekBtn.setOnClickListener(v -> {
            infoText.setText("Нажата кнопка \"неделя\"");
        });

            // нажатие на кнопку настроек, переход на экран настройки приложения
        settingsBtn.setOnClickListener(v -> {
            Intent locationIntent = new Intent(MainActivity.this, SettingsActivity.class);

            startActivity(locationIntent);
        });
    }


}
