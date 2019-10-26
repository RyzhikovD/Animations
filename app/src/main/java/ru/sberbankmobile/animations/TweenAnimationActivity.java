package ru.sberbankmobile.animations;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        animateViaXml();
    }

    private void animateViaXml() {
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.tween_animations);
        View view = findViewById(R.id.imageView);
        view.startAnimation(animation);
    }
}
