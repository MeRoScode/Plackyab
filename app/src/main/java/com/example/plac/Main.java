package com.example.plac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener {

    private Button btn_search ;
    private Button btn_spishal ;
    private Button btn_tarikh ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        interview();
    }

    private void interview() {
        btn_search = findViewById(R.id.btn_search) ;
        btn_spishal = findViewById(R.id.btn_spishal) ;
        btn_tarikh = findViewById(R.id.btn_tarikh) ;

        btn_search.setOnClickListener(this);
        btn_spishal.setOnClickListener(this);
        btn_tarikh.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_search:
                Intent intent1 = new  Intent(Main.this, FristActivity.class) ;
                intent1.putExtra("a",1) ;
                startActivity(intent1);
                break;
            case R.id.btn_spishal:
                Intent intent2 = new  Intent(Main.this, FristActivity.class) ;
                intent2.putExtra("b",2) ;
                startActivity(intent2);
                break;
            case R.id.btn_tarikh:
              //  Intent intent3 = new  Intent(Main.this, .class) ;
              // startActivity(intent3);
                break;

        }

    }
}