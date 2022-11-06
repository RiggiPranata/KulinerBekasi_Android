package com.example.uts252;

public class KulinerBinding {

    private String nama;
    private String harga;

    public KulinerBinding(String nama, String harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getHarga(){
        return harga;
    }

    public void setHarga(String harga){
        this.harga = harga;
    }
}
