package com.example.rotationanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView arshadImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arshadImage = (ImageView) findViewById(R.id.imageViewArshad);

        // setting X position
        arshadImage.setX(-2000);
        arshadImage.animate().translationXBy(2000).rotation(360).setDuration(2000);
    }
}
