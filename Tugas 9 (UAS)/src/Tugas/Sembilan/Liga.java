package Tugas.Sembilan;

import java.util.ArrayList;

public class Liga {

    private String namaLiga;
    private Divisi DivisiLiga;

    ArrayList<Divisi> listDivisi = new ArrayList<Divisi>();
    ArrayList<Club> Clubs = new ArrayList<Club>();


    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public void setListDivisi(Divisi listDivisi) {
        this.listDivisi.add(listDivisi);
    }

    public void setClubs(Club clubs) {
        Clubs.add(clubs);
    }

    public ArrayList<Divisi> getListDivisi() {
        return listDivisi;
    }

    public ArrayList<Club> getClubs() {
        return Clubs;
    }

    public ArrayList<Club> getDaftarClub(Divisi Divisi) {
        return Divisi.getListClub();
    }

    @Override
    public String toString() {
        return "Liga" +
                "Nama Liga= " + namaLiga ;
    }
}
