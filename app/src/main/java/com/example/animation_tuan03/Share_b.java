package com.example.animation_tuan03;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Share_b extends AppCompatActivity {
    Button btnBack_2;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivty_share_b);

        btnBack_2 = findViewById(R.id.btnBack_2);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade); // fade phải trùng với tên trong file xml
        getWindow().setExitTransition(fade);
        btnBack_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share_b.this,ListFlower.class);
                startActivity(intent);
            }
        });
    }
}
