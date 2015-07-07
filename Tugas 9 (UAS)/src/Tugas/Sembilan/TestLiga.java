package Tugas.Sembilan;

import java.util.Collections;

public class TestLiga {

    public static void main(String[] args) {


        Liga inggris = new Liga("Iggris");

        Divisi pro = new Divisi("Profesional",inggris);
        Divisi amateur = new Divisi("Amateur",inggris);

        Club arsenal = new Club("Arsenal",pro,inggris);
        Club chealsea = new Club("Arsenal",pro,inggris);
        Club MU = new Club("Mancheter United",pro,inggris);
        Club MANY = new Club("Manchester City",pro,inggris);

        Club fulham = new Club("Fulham",amateur,inggris);
        Club crystalplc = new Club("Crystal Palace",amateur,inggris);
        Club southampton = new Club("Southhampton",amateur,inggris);
        Club midlesbrought = new Club("Midlesbrought",amateur,inggris);

        inggris.setListDivisi(pro);
        inggris.setListDivisi(amateur);

        pro.setListClub(arsenal);
        pro.setListClub(chealsea);
        pro.setListClub(MU);
        pro.setListClub(MANY);

        amateur.setListClub(fulham);
        amateur.setListClub(crystalplc);
        amateur.setListClub(southampton);
        amateur.setListClub(midlesbrought);

        /*
        1.Get daftar Divisi by nama Liga
        2.Get daftar Klub by nama Liga
        3.Get daftar Klub by nama Divisi
        4.Get Klub ini berada di Divisi mana by nama Klub
        5.Get Klub ini berada di Liga apa by nama Klub
         */

//        nomor 1
        System.out.println("Nomor 1");
        System.out.println(inggris.getListDivisi());
        System.out.println("-----------------------------");
//        normor 2
        System.out.println("Nomor 2");
        inggris.setClubs(arsenal);
        System.out.println(inggris.getClubs());

//        nomor 3
        System.out.println("Nomor 3");
        System.out.println(pro.getListClub());
        System.out.println("-----------------------------");
        System.out.println(amateur.getListClub());
//        nomor 4
        System.out.println("Nomor 4");
//        arsenal.setDivisiClub(amateur);
        System.out.println("Klub ini di "+arsenal.getDivisiClub());
        System.out.println("-------------------------------");
        System.out.println("Klub ini di " + fulham.getDivisiClub());
//        nomor 5
        System.out.println("Nomor 5.");
//        chealsea.setLigaClub(inggris);
        System.out.println("Klub ini di "+chealsea.getLigaClub());
        System.out.println("--------------------------------");
        System.out.println("Klub ini di "+southampton.getLigaClub());


        System.out.println("Test");
        System.out.println(amateur.getListClub());
        System.out.println(pro.getListClub());
        System.out.println(inggris.getListDivisi());
        System.out.println();
        System.out.println(inggris.getDaftarClub(pro));
    }

}
