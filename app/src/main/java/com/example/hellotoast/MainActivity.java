package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Variable to store the counter value
    private int counterNumber = 0;

    // Reference to the TextView that shows the counter
    private TextView counterDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the XML layout file
        setContentView(R.layout.activity_main);

        // Find the counter TextView from the XML by its ID
        counterDisplay = findViewById(R.id.txt_counter_value);

        // Find all three buttons from the XML by their IDs
        Button toastButton = findViewById(R.id.btn_show_toast);
        Button greetingButton = findViewById(R.id.btn_greeting);
        Button increaseButton = findViewById(R.id.btn_increase);

        // Set what happens when you click the SHOW TOAST button
        toastButton.setOnClickListener(view -> {
            // Show a temporary message that disappears after a few seconds
            Toast.makeText(MainActivity.this, "allo allo hello toast", Toast.LENGTH_SHORT).show();
        });

        // Set what happens when you click the Say hhiiiii! button
        greetingButton.setOnClickListener(view -> {
            // Show a different greeting message
            Toast.makeText(MainActivity.this, "wiiii haaaaallooo hry?", Toast.LENGTH_SHORT).show();
        });

        // Set what happens when you click the INCREASE button
        increaseButton.setOnClickListener(view -> {
            // Add 1 to the counter
            counterNumber++;
            // Update the display with the new number
            counterDisplay.setText(String.valueOf(counterNumber));
        });
    }
}