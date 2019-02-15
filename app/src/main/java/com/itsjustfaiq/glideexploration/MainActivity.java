package com.itsjustfaiq.glideexploration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
    ImageView my_image_view;
    String fullImageUrl = "https://cdn.idntimes.com/content-images/community/2018/03/26066893-2013366842215814-1335073223703789568-n-60a6a9e2790ad1cecdb9272da711b5ab.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_image_view = findViewById(R.id.ivGlide);

        RequestOptions requestOption = new RequestOptions()
                .placeholder(R.drawable.placeholder).centerCrop();
        Glide.with(this).load(fullImageUrl).apply(requestOption).into(my_image_view);
    }
}
