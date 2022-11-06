package com.example.uts252;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class KulinerAdapter extends ArrayAdapter<KulinerBinding> {

    public KulinerAdapter(@NonNull Context context, ArrayList<KulinerBinding> kulinerBindingArrayList){
        super(context,0,kulinerBindingArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View listitemView = convertView;
        if(listitemView == null){
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.row_data, parent, false);
        }

        KulinerBinding kulinerBinding = getItem(position);
        TextView namaKuliner = listitemView.findViewById(R.id.namaKuliner);
        TextView hargaKuliner = listitemView.findViewById(R.id.hargaKuliner);

        namaKuliner.setText(kulinerBinding.getNama());
        hargaKuliner.setText(kulinerBinding.getHarga());
        return listitemView;
    }

}
