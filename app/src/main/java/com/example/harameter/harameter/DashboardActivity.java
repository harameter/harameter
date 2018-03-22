package com.example.harameter.harameter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void onClickHaraButton(View view){
        Intent haraIntent = new Intent(this, BluetoothActivity.class);
        startActivity(haraIntent);
    }
    public void onClickAbdominalButton(View view){
        Intent abdIntent = new Intent(this, BluetoothActivity.class);
        startActivity(abdIntent);
    }
}
