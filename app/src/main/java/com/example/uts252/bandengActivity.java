package com.example.uts252;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class bandengActivity extends AppCompatActivity {

    GridView naha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandeng);

        setTitle("Bandeng Rorod");
        setSupportActionBar(findViewById(R.id.toolbar));

        naha = findViewById(R.id.gridHarga);
        ArrayList<KulinerBinding> kulinerBindingArrayList = new ArrayList<KulinerBinding>();

        kulinerBindingArrayList.add(new KulinerBinding("Bandeng Rorod", "Rp. 25.000/pack"));

        KulinerAdapter adapter = new KulinerAdapter(this, kulinerBindingArrayList);
        naha.setAdapter(adapter);
    }

    public void moreInfo(View v){
        String url = "https://radarbekasi.id/2022/04/16/bandeng-rorod-oleh-oleh-bekasi-layak-jadi-buah-tangan/";
        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(web);
    }

    public void  youtube(View v){
        String urlYt = "https://youtu.be/GCVjGe27s9g";
        Intent yt = new Intent(Intent.ACTION_VIEW, Uri.parse(urlYt));
        startActivity(yt);
    }

    public void gmaps(View v){
        String loc = "Warung Mpok Omah Bandeng Rorod";
        String geoCode = "geo:-6.2427625,107.0383281&z=23";
        Intent maps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=("+loc+")"));
        startActivity(maps);
    }
}