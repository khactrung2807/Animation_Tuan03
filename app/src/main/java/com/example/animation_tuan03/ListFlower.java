package com.example.animation_tuan03;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

public class ListFlower extends AppCompatActivity {
    ImageView img_share_1, img_share_2;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_flower);


        Fade fade = new Fade();
        View decord =getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);

        img_share_1  =findViewById(R.id.img_1);
        img_share_2 = findViewById(R.id.img_2);
        img_share_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ListFlower.this,Share_a.class);

                ActivityOptionsCompat option =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(ListFlower.this,
                                img_share_1, ViewCompat.getTransitionName(img_share_1));
                startActivity(intent,option.toBundle());
            }
        });
        img_share_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListFlower.this,Share_b.class);
                startActivity(intent);

                ActivityOptionsCompat option =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(ListFlower.this,
                                img_share_2,ViewCompat.getTransitionName(img_share_2));
                startActivity(intent,option.toBundle());
            }
        });
    }
}
