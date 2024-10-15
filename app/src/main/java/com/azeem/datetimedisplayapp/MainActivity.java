package com.azeem.datetimedisplayapp;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textViewDateTime;
    private Button buttonShowDateTime;
    private Button buttonClearText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the UI components
        textViewDateTime = findViewById(R.id.textViewDateTime);
        buttonShowDateTime = findViewById(R.id.buttonShowDateTime);
        buttonClearText = findViewById(R.id.buttonClearText);

        // Set up the "Show Date & Time" button click listener
        buttonShowDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current date and time
                String currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());

                // Set the text view to display the current date and time
                textViewDateTime.setText(currentDateTime);
            }
        });

        // Set up the "Clear Text" button click listener
        buttonClearText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the text view content
                textViewDateTime.setText("");
            }
        });
    }
}
