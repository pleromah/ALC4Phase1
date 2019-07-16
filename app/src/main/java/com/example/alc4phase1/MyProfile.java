package com.example.alc4phase1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        //this.setTitle("My Profile");
        ImageView profilePhoto = (ImageView) findViewById(R.id.photo1);

        int imageResource = getResources().getIdentifier("@drawable/photo", null, this.getPackageName());
        profilePhoto.setImageResource(imageResource);

    }

}
