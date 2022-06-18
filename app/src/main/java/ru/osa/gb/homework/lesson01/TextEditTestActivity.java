package ru.osa.gb.homework.lesson01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TextEditTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_edit_test);

        final Button fromTextEditTestToMainBut = findViewById(R.id.fromTextEditTestToMainBut);
        fromTextEditTestToMainBut.setOnClickListener(v -> {

            Intent i;
            i = new Intent(this, MainActivity.class);
            startActivity(i);

        });


    }
}
