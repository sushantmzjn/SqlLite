package com.sushant.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText word, meaning;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        word = findViewById(R.id.word);
        meaning = findViewById(R.id.meaning);
        add = findViewById(R.id.btnAdd);

        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
