package com.example.vicky.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activityyinwenge extends Activity {

    ImageButton fbutton;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityyinwenge);

        fbutton = (ImageButton)findViewById(R.id.imageButton8);
        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activityyinwenge.this,Activityshouye.class);
                startActivity(intent);
            }
        });
    }
}
