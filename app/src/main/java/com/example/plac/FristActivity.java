package com.example.plac;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.Random;

public class FristActivity extends AppCompatActivity implements View.OnClickListener {

    private TabLayout tab_layout;
    private ViewPager viewpager;
    private ImageView btn_goident;
    private ImageView btn_star;
    private ImageView car;
    private Textveiev plak ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        inerviews();
        setupViewPagerForeBut();

        tab_layout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(com.example.plac.FristActivity.this, tab.getText(), Toast.LENGTH_SHORT).show();
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
        main_adapter main_adapter = new main_adapter(getSupportFragmentManager(), this);
        viewpager.setAdapter(main_adapter);
        tab_layout.setupWithViewPager(viewpager);

    }

    @SuppressLint("WrongViewCast")
    private void inerviews() {
        tab_layout = findViewById(R.id.tab_layout);
        viewpager = findViewById(R.id.viewpager);
        btn_goident = findViewById(R.id.btn_goident);
        btn_star = findViewById(R.id.btn_star);
        btn_goident.setOnClickListener(this);
        btn_star.setOnClickListener(this);


        car = findViewById(R.id.car);
        startanim(car, R.anim.in_from_right2);
        car();
    }


    public void car(){
    int min = 90 ;
    int max = 750 ;
    Random random = new Random();

     int i = random.nextInt(max - min + 45) + min;

    ViewGroup.MarginLayoutParams marginLayout = (ViewGroup.MarginLayoutParams) car.getLayoutParams();
        marginLayout.setMargins(0,0,0,i);
    }
    private void setupviewpagerforebut2() {
        secend_adapter secend_adapter = new secend_adapter(getSupportFragmentManager(), this);
        viewpager.setAdapter(secend_adapter);
        tab_layout.setupWithViewPager(viewpager);

    }
    private void startanim(View view , int animid){
        Animation animation = AnimationUtils.loadAnimation(this,animid);
        view.startAnimation(animation);
        car.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_goident:
                goident goident = new goident(this);
                goident.setButton(new goident.OnClickLisiner() {
                    @Override
                    public void onclick(AlertDialog alertDialog) {
                        if (alertDialog != null){
                        alertDialog.dismiss();
                        }
                    }
                });
                break;
            case R.id.btn_star:
                String DEVELOPER_ID = "MoRs6";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("bazaar://collection?slug=by_author&aid=" + DEVELOPER_ID));
                intent.setPackage("com.example.plac");
                startActivity(intent);
            break;

        }
    }
}