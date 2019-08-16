package com.example.todo_first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] tasks = {"office","study","dinner","sleep"};
    private TextView textView;
    public int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.)
                textView.setText(tasks[currentIndex]);
   }

    public void next(View view) {
        currentIndex++;
        textView.setText(tasks[currentIndex]);
    }

    public void previous(View view) {
    }
}
