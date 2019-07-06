package com.hemant.stopwatch;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2;
    Button first_btn;
    Animation atg,btg_one,btg_two;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_shalash);
        textView2 = findViewById(R.id.tv_sub_shalash);
        first_btn = findViewById(R.id.btn_get);

        imageView = findViewById(R.id.ivsplash);

        atg = AnimationUtils.loadAnimation(this,R.anim.atg);
        btg_one = AnimationUtils.loadAnimation(this,R.anim.btg_one);
        btg_two = AnimationUtils.loadAnimation(this,R.anim.btg_two);

        imageView.startAnimation(atg);
        textView.startAnimation(btg_one);
        textView2.startAnimation(btg_one);
        first_btn.startAnimation(btg_two);




        Typeface mlight = Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
        Typeface medium = Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");
        Typeface regular = Typeface.createFromAsset(getAssets(),"fonts/MRegular.ttf");

        textView.setTypeface(regular);
        textView2.setTypeface(medium);
        first_btn.setTypeface(mlight);
    }
}
