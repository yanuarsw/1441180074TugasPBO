package com.company;

/**
 * Created by TheBraveone on 6/10/2015.
 */
public class main {
    public static void main(String[] args) {

        ItsintheBag aku = new ItsintheBag("Yanuar","Jl Letjend Pandjaitan NO 14",'l',"Mahasiswa",20);


        System.out.println(aku.getNamaPenulis());
        System.out.println(aku.getAlamatPenulis());
        System.out.println(aku.getJenisKelamin());

        System.out.println(aku.toString());
    }
}
