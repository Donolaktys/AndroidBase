package ru.geekbrains.lesson_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private TextView locality;
private TextView infoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locality = findViewById(R.id.locality);
        infoText = findViewById(R.id.infoText);
        Button oneDayBtn  = findViewById(R.id.oneDayBtn);
        Button threeDaysBtn  = findViewById(R.id.threeDaysBtn);
        Button weekBtn  = findViewById(R.id.weekBtn);

        oneDayBtn.setOnClickListener(v -> {
            infoText.setText("Нажата кнопка 1 день");
        });

        threeDaysBtn.setOnClickListener(v -> {
            infoText.setText("Нажата кнопка 3 дня");
        });

        weekBtn.setOnClickListener(v -> {
            infoText.setText("Нажата кнопка неделя");
        });
    }


}
