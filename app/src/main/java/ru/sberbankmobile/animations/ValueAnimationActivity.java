package ru.sberbankmobile.animations;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ValueAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animation);

        ImageView imageView = findViewById(R.id.imageView);

        // alpha
        ValueAnimator alphaAnimator = ValueAnimator.ofFloat(0f, 1f);
        configureAnimating(alphaAnimator);
        alphaAnimator.addUpdateListener(
                animator -> imageView.setAlpha((Float) animator.getAnimatedValue())
        );
        alphaAnimator.start();

        // scale
        ValueAnimator scaleAnimator = ValueAnimator.ofFloat(0.5f, 1f);
        configureAnimating(scaleAnimator);
        scaleAnimator.addUpdateListener(
                animator -> {
                    Float scale = (Float) animator.getAnimatedValue();
                    imageView.setScaleX(scale);
                    imageView.setScaleY(scale);
                }
        );
        scaleAnimator.start();
    }

    private void configureAnimating(ValueAnimator animator) {
        animator.setRepeatCount(10);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setDuration(900);
    }
}