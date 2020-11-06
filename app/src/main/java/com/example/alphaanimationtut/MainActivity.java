package com.example.alphaanimationtut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final  String TAG="It's just for Allert";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AlphaAnimation alphaAnimation=new AlphaAnimation(1,0.2f);
        alphaAnimation.setDuration(400);
        //alphaAnimation.setRepeatCount(Animation.INFINITE);
        alphaAnimation.setRepeatCount(5);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        //alphaAnimation.setFillAfter(true);

        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Log.i(TAG, "onAnimationEnd: ");
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Log.i(TAG, "onAnimationRepeat: ");
            }
        });

        ImageView imageView=findViewById(R.id.iv_main);
        View playButton=findViewById(R.id.fab_main);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.startAnimation(alphaAnimation);
            }
        });
    }
}