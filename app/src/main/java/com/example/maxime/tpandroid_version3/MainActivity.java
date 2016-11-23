package com.example.maxime.tpandroid_version3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.maxime.tpandroid_version3.BtActivity;
import com.example.maxime.tpandroid_version3.MapActivity;

public class MainActivity extends AppCompatActivity {

    Button mMapActivityButton;
    Button mBluetoothButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBluetoothButton = (Button) findViewById(R.id.bluetooth_button);
        mMapActivityButton = (Button) findViewById(R.id.map_activity_button);

        mMapActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mapActivityIntent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(mapActivityIntent);
            }
        });

        mBluetoothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bluetoothIntent = new Intent(getApplicationContext(), BtActivity.class);
                startActivity(bluetoothIntent);
            }
        });
    }
}