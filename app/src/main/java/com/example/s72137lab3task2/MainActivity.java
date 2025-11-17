package com.example.s72137lab3task2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private Button btnHello;
    private TextView txtResult;
    private Button btnCount;
    private TextView txtCount;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link UI objects
        edtName = findViewById(R.id.edtName);
        btnHello = findViewById(R.id.btnHello);
        txtResult = findViewById(R.id.txtResult);
        btnCount = findViewById(R.id.btnCount);
        txtCount = findViewById(R.id.txtCount);


        //attach java event listener
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString().trim();
                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your name",
                            Toast.LENGTH_SHORT).show();
                } else {
                    txtResult.setText("Hello " + name + "!");
                }
            }
        });

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                txtCount.setText("Clicks: " + clickCount);
                if (clickCount == 5) {
                    Toast.makeText(MainActivity.this, "You clicked 5 times!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
