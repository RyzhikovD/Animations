package ru.sberbankmobile.animations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClickGoTo(R.id.frame_by_frame_animation, FrameByFrameAnimationActivity.class);
        onClickGoTo(R.id.tween_animation, TweenAnimationActivity.class);
        onClickGoTo(R.id.value_animation, ValueAnimationActivity.class);
        onClickGoTo(R.id.object_animation, ObjectAnimationActivity.class);
        onClickGoTo(R.id.customView_animation, CustomViewAnimationActivity.class);
    }

    private void onClickGoTo(@IdRes int viewId, @NonNull Class<? extends Activity> whereToGo) {
        findViewById(viewId).setOnClickListener((v) ->
                startActivity(new Intent(this, whereToGo))
        );
    }
}
