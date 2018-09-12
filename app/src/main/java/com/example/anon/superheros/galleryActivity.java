package com.example.anon.superheros;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class galleryActivity extends AppCompatActivity {
    private static final String TAG = "galleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: Activity_gallery asiigned");
        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: Getting Intent Data");
        if(getIntent().hasExtra("image_name") && getIntent().hasExtra("image_url") && getIntent().hasExtra("image_desc")){
            String ImageUrl = getIntent().getStringExtra("image_url");
            String ImageName = getIntent().getStringExtra("image_name");
            String ImageDesc = getIntent().getStringExtra("image_desc");
        setImage(ImageUrl, ImageName, ImageDesc);
        }
    }

    private void setImage(String ImageUrl, String ImageName, String ImageDesc){
        Log.d(TAG, "setImage: Setting Images");
        TextView imagename = findViewById(R.id.desc);
        imagename.setText(ImageName);

        TextView imagedesc = findViewById(R.id.full_desc);
        imagedesc.setText(ImageDesc);

        ImageView image_url = findViewById(R.id.deep_image);

        Glide.with(this)
                .asBitmap()
                .load(ImageUrl)
                .into(image_url);


    }
}
