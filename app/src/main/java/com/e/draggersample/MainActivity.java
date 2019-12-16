package com.e.draggersample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    DataComponent component;
    @Inject
    MyDagger myDagger;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerDataComponent.builder().build();
        component.inject(this);

        info = findViewById(R.id.tvInfo);

        //using provided function
        String output = myDagger.MyDaggerFunction().GetName();
        info.setText(output);
        Toast.makeText(getApplicationContext(), output, Toast.LENGTH_SHORT).show();
    }
}
