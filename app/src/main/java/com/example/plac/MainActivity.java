package com.example.plac;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TabLayout tab_layout;
    ViewPager viewpager;
    ImageView btn_guiding, btn_star, car;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setupViewPagerForeBut();

        tab_layout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
    }

    private void setupViewPagerForeBut() {
        Main_Adapter main_adapter = new Main_Adapter(getSupportFragmentManager(), this);
        viewpager.setAdapter(main_adapter);
        tab_layout.setupWithViewPager(viewpager);

    }

    @SuppressLint("WrongViewCast")
    private void initViews() {
        tab_layout = findViewById(R.id.tab_layout);
        viewpager = findViewById(R.id.viewpager);
        btn_guiding = findViewById(R.id.btn_guiding);
        btn_star = findViewById(R.id.btn_star);
        btn_guiding.setOnClickListener(this);
        btn_star.setOnClickListener(this);


        car = findViewById(R.id.car);
        StartAnim(car, R.anim.car_animation_right);
        Car_Place();
        countDownTimer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Car_Place();
                countDownTimer.start();
            }
        };
        countDownTimer.start();
    }


    public void Car_Place() {
        car.setRotationY(0);
        int Min = 90;
        int Max = 1200;
        Random random = new Random();

        int i = random.nextInt((Max - Min) + 20) + Min;

//        ViewGroup.MarginLayoutParams marginLayout = (ViewGroup.MarginLayoutParams) car.getLayoutParams();
//        marginLayout.setMargins(0, 0, 0, i);
//        car.setLayoutParams(marginLayout);
        if (i%2 == 0){
            StartAnim(car, R.anim.car_animation_right);
        }else{
            car.setRotationY(180);
            StartAnim(car, R.anim.car_animation_left);
        }

        car.setY(i);


    }

    private void StartAnim(View view, int animid) {
        Animation animation = AnimationUtils.loadAnimation(this, animid);
        view.startAnimation(animation);
        car.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_guiding:
                Guid_Dialog guid = new Guid_Dialog(this);
                guid.setButtonsOnClick(new Guid_Dialog.OnClickLisiner() {
                    @Override
                    public void onclick(AlertDialog alertDialog) {
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                    }
                });
                break;
            case R.id.btn_star:
                String DEVELOPER_ID = "MoRs6";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://cafebazaar.ir/developer/mors6"));
                startActivity(intent);
                break;

        }
    }
}