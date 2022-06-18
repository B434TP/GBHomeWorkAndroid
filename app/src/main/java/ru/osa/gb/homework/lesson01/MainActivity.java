package ru.osa.gb.homework.lesson01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button textEditTestBut = findViewById(R.id.textEditTestBut);
        textEditTestBut.setOnClickListener(v -> {
            Intent i;
            i = new Intent(this, TextEditTestActivity.class);
            startActivity(i);
        });


    }
}


