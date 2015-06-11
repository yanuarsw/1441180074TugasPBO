package com.smart;

/**
 * Created by TTheBraveone on 6/11/2015.
 */
public class Pabrikan {

    private String namaVendor;
    private String asalNegara;
    private double nomorSeri;


    public Pabrikan(String namaVendor, String asalNegara) {
        this.namaVendor = namaVendor;
        this.asalNegara = asalNegara;
    }

    public Pabrikan(String namaVendor, String asalNegara, double nomorSeri) {
        this.namaVendor = namaVendor;
        this.asalNegara = asalNegara;
        this.nomorSeri = nomorSeri;
    }

    public double getNomorSeri() {
        return nomorSeri;
    }

    public void setNomorSeri(double nomorSeri) {
        this.nomorSeri = nomorSeri;
    }

    public String getNamaVendor() {
        return namaVendor;
    }

    public void setNamaVendor(String namaVendor) {
        this.namaVendor = namaVendor;
    }

    public String getAsalNegara() {
        return asalNegara;
    }

    public void setAsalNegara(String asalNegara) {
        this.asalNegara = asalNegara;
    }

    @Override
    public String toString() {
        return "{" +
                "namaVendor='" + namaVendor + '\'' +
                ", asalNegara='" + asalNegara + '\'' +
                ", nomorSeri=" + nomorSeri +
                '}';
    }
}
