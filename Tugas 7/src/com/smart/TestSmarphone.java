package com.smart;

/**
 * Created by TTheBraveone on 6/11/2015.
 */
public class TestSmarphone {
    public static void main(String[] args) {

       Pabrikan Samsung = new Pabrikan("Samsung","Korea Selatan",1233113.0);
        Pabrikan Motorola = new Pabrikan("Motorola","Inggris",123312.1);


       Smartphone sEnam = new Smartphone("S6","6 inch",'A',"Core i3",5700000.0,Samsung);
        Smartphone Baru = new Smartphone("Moto g","4 inch",'B',"Core duo",2100000.0,Motorola);

        System.out.println(Motorola.getNamaVendor());
        System.out.println(Motorola.getNomorSeri());
        System.out.println(Motorola.toString());
        System.out.println(Baru.toString());

        System.out.println(sEnam.toString());


    }
}
