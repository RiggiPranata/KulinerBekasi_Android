package com.example.uts252;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class kueActivity extends AppCompatActivity {

    GridView naha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kue);

        setTitle("Kue Rangi");
        setSupportActionBar(findViewById(R.id.toolbar));

        naha = findViewById(R.id.gridHarga);
        ArrayList<KulinerBinding> kulinerBindingArrayList = new ArrayList<KulinerBinding>();

        kulinerBindingArrayList.add(new KulinerBinding("Kue Rangi", "Rp. 6.000/porsi"));

        KulinerAdapter adapter = new KulinerAdapter(this, kulinerBindingArrayList);
        naha.setAdapter(adapter);
    }

    public void moreInfo(View v){
        String url = "https://radarbekasi.id/2022/04/24/kue-digarang-wangi-rangi-langka-dan-unik-temukan-di-pasar-proyek-bekasi/";
        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(web);
    }

    public void  youtube(View v){
        String urlYt = "https://youtu.be/UUYb5vAOCfk";
        Intent yt = new Intent(Intent.ACTION_VIEW, Uri.parse(urlYt));
        startActivity(yt);
    }

    public void gmaps(View v){
        String loc = "Kue Rangi Kuntil";
        String geoCode = "geo:-6.2218206,107.0245315&z=23";
        Intent maps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=("+loc+")"));
        startActivity(maps);
    }

}