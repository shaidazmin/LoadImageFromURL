package com.hatbd.loadimagefromurlusingglidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView image_one, image_two, image_three;
    private String [] url =
            {
            "http://www.icons101.com/icon_ico/id_79335/android.ico",
            "https://freeiconshop.com/wp-content/uploads/edd/android-flat.png",
            "http://icons.iconarchive.com/icons/social-media-icons/glossy-social/256/Android-icon.png"
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_one = findViewById(R.id.image_one);
        image_two = findViewById(R.id.image_two);
        image_three = findViewById(R.id.image_three);

        Glide.with(this).load(url[0]).into(image_one);
        Glide.with(this).load(url[1]).into(image_two);
        Glide.with(this).load(url[2]).into(image_three);

    }
}
