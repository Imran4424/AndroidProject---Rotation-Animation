package com.example.rotationanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView arshadImage;
    Button fullScreenButton;
    boolean isScaleUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arshadImage = (ImageView) findViewById(R.id.imageViewArshad);
        fullScreenButton = (Button) findViewById(R.id.buttonFullScreen);
        isScaleUp = true;

        // setting X position
        arshadImage.setX(-2000);
        arshadImage.animate().translationXBy(2000).rotation(360).setDuration(2000);
    }

    public void buttonPressed(View v) {
        if (isScaleUp) {
            rotateScaleDown();
            isScaleUp = false;
        } else {
            rotateScaleUp();
            isScaleUp = true;
        }
    }

    void rotateScaleDown() {
        /*
         * there is a difference between scaleX and scaleByX; rotationX and rotationByX
         *
         * scaleX set a fix scale value for the object
         * here, scaleX and scaleY setting the image size by scaling down to 0.5
         * but scaleByX and scaleByY always divide the current image size by the parameter and scale to the new result
         *
         * same goes for rotationX and rotationY which number of rotation is fixed in any direction
         * but
         * */
        arshadImage.animate().rotation(3600).scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }

    void rotateScaleUp() {
        arshadImage.animate().rotation(-3600).scaleX(1).scaleY(1).setDuration(2000);
    }
}
