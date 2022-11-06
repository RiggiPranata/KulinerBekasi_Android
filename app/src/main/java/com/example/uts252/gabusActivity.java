package com.example.uts252;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class gabusActivity extends AppCompatActivity {

    GridView naha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gabus);
        setTitle("Gabus Pucung");
        setSupportActionBar(findViewById(R.id.toolbar));

        naha = findViewById(R.id.gridHarga);
        ArrayList<KulinerBinding> kulinerBindingArrayList = new ArrayList<KulinerBinding>();

        kulinerBindingArrayList.add(new KulinerBinding("Gabus Pucung", "Rp. 25.000/porsi"));

        KulinerAdapter adapter = new KulinerAdapter(this, kulinerBindingArrayList);
        naha.setAdapter(adapter);
    }

    public void moreInfo(View v){
        String url = "https://www.google.com/amp/s/www.klikanggaran.com/gaya-hidup/amp/pr-1151270018/gabus-pucung-kuliner-yang-menjadi-identitas-bekasi";
        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(web);
    }

    public void  youtube(View v){
        String urlYt = "https://youtu.be/hddoZ8WHMFI";
        Intent yt = new Intent(Intent.ACTION_VIEW, Uri.parse(urlYt));
        startActivity(yt);
    }

    public void gmaps(View v){
        String loc = "RM. Khas Betawi Udin Combo";
        String geoCode = "geo:-6.1556738,106.9809828&z=23";
        Intent maps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=("+loc+")"));
        startActivity(maps);
    }
}