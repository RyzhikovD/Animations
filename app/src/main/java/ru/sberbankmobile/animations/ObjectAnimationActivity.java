package ru.sberbankmobile.animations;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ObjectAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animation);

        ImageView imageView = findViewById(R.id.imageView);

        // rotation animator
        ObjectAnimator rotationAnimator = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 720f);
        configureAnimating(rotationAnimator);
        rotationAnimator.start();

        // translation animator
        float translationY = 50;
        ObjectAnimator translationAnimator = ObjectAnimator.ofFloat(imageView, "translationY", 0f, translationY);
        configureAnimating(translationAnimator);
        translationAnimator.start();
    }

    private void configureAnimating(ValueAnimator animator) {
        animator.setRepeatCount(10);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setDuration(900);
    }
}
