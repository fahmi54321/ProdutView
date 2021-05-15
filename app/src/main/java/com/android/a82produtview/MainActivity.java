package com.android.a82produtview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.steelkiwi.library.IncrementProductView;
import com.steelkiwi.library.listener.OnStateListener;

public class MainActivity extends AppCompatActivity {

    TextView amount;
    IncrementProductView incrementProductView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.amount);
        incrementProductView = findViewById(R.id.productView);

        incrementProductView.setOnStateListener(new OnStateListener() {
            @Override
            public void onCountChange(int count) {
                amount.setText("$"+count*45);
            }

            @Override
            public void onConfirm(int count) {
                Toast.makeText(MainActivity.this, "You want to buy"+count+" Products", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClose() {

            }
        });
    }
}