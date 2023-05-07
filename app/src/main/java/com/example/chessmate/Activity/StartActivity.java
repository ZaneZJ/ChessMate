package com.example.chessmate.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.chessmate.MainActivity;
import com.example.chessmate.R;
import com.google.android.material.textfield.TextInputEditText;

public class StartActivity extends AppCompatActivity  {

    public String firstPlayer = "";
    public String secondPlayer = "";

    TextInputEditText firstPlayerInput = (TextInputEditText) findViewById(R.id.firstPlayerInput);
    TextInputEditText secondPlayerInput = (TextInputEditText) findViewById(R.id.secondPlayerInput);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide the title bar and show the activity in full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_start);

        Button startButton = (Button) findViewById(R.id.play);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                firstPlayer = firstPlayerInput.getText().toString();
                secondPlayer = secondPlayerInput.getText().toString();
                System.out.println("First player = " + firstPlayer);
                System.out.println("Second player = " + secondPlayer);
                startActivity(new Intent(StartActivity.this,GameActivity.class));
            }
        });

    }

}
