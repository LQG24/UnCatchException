package com.example.test.uncatchexception;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.unCatch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               throw new RuntimeException("点击异常");
            }
        });
    }
}
