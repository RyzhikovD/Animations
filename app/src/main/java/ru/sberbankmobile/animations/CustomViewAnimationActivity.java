package ru.sberbankmobile.animations;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ru.sberbankmobile.animations.customviews.FinanceProgressView;

public class CustomViewAnimationActivity extends AppCompatActivity {

    private ObjectAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_animation);

        FinanceProgressView financeProgressView = findViewById(R.id.finance_progress);
        mAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.custom_view_animator);
        mAnimator.setTarget(financeProgressView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAnimator.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAnimator.end();
    }
}
