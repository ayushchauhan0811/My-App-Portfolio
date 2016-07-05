package com.example.ayush.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popularMovies = (Button) findViewById(R.id.popular_movies);
        Button stockHawk = (Button) findViewById(R.id.stock_hawk);
        Button bigger = (Button) findViewById(R.id.build_it_bigger);
        Button appMaterial = (Button) findViewById(R.id.app_material);
        Button goUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        Button capstone = (Button) findViewById(R.id.capstone);

        popularMovies.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        bigger.setOnClickListener(this);
        appMaterial.setOnClickListener(this);
        goUbiquitous.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.popular_movies :
                Toast.makeText(this,"This will launch my Popular Movies App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock_hawk :
                Toast.makeText(this,"This will launch my Stock Hawk App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger :
                Toast.makeText(this,"This will launch my Build It Bigger App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.app_material :
                Toast.makeText(this,"This will launch my Make Your App Material App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.go_ubiquitous :
                Toast.makeText(this,"This will launch my Go Ubiquitous App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone :
                Toast.makeText(this,"This will launch my Capstone App",Toast.LENGTH_SHORT).show();

        }
    }
}
