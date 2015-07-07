package Tugas.Sembilan;

import java.util.ArrayList;

public class Divisi {

    private String namaDivisi;
    private Liga ligaDivisi;


    ArrayList<Club> listClub = new ArrayList<Club>();

    public Divisi(String namaDivisi, Liga ligaDivisi) {
        this.namaDivisi = namaDivisi;
        this.ligaDivisi = ligaDivisi;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public void setListClub(Club listClub) {
        this.listClub.add(listClub);
    }

    public ArrayList<Club> getListClub() {
        return listClub;
    }

    public Liga getLigaDivisi() {
        return ligaDivisi;
    }



    @Override
    public String toString() {
        return "Divisi" +
                "Nama Divisi= " + namaDivisi ;
    }
}
