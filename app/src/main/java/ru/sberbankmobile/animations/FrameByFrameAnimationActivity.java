package ru.sberbankmobile.animations;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameByFrameAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_drawable);
        ImageView imageView =
                findViewById(R.id.horseImageView);
        ((AnimationDrawable) imageView.getDrawable()).start();
    }
}
