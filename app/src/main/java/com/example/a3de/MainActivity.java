package com.example.a3de;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.editTextTextPersonName);

        text.setText("test");
    }

    public void redirect(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name1", text.getText().toString());
        startActivity(intent);
    }
}