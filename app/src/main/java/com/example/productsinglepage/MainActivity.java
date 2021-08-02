package com.example.productsinglepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int [] images = {
            R.drawable.product_img_one,
            R.drawable.product_img_one,
            R.drawable.product_img_one,
            R.drawable.product_img_one
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<SlideModel>();
        slideModels.add(0,new SlideModel(images[0]));
        slideModels.add(0,new SlideModel(images[1]));
        slideModels.add(0,new SlideModel(images[2]));
        slideModels.add(0,new SlideModel(images[3]));
        imageSlider.setImageList(slideModels,true);


    }
}