package com.sushant.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WordDetail extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_detail);
        textView = findViewById(R.id.tv1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String means = bundle.getString("Meaning");
            textView.setText(means);
        } else {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();

        }
    }
}
