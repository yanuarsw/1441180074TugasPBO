package Tugas.Sembilan;

import java.util.ArrayList;

public class Club {

    private String namaClub;
    private Divisi divisiClub;
    private Liga ligaClub;

    public Club(String namaClub, Divisi divisiClub) {
        this.namaClub = namaClub;
        this.divisiClub = divisiClub;
    }

    public Club(String namaClub, Divisi divisiClub, Liga ligaClub) {
        this.namaClub = namaClub;
        this.divisiClub = divisiClub;
        this.ligaClub = ligaClub;
    }

    public void setDivisiClub(Divisi divisiClub) {
        this.divisiClub = divisiClub;
    }

    public void setLigaClub(Liga ligaClub) {
        this.ligaClub = ligaClub;
    }

    public String getNamaClub() {
        return namaClub;
    }

    public Divisi getDivisiClub() {
        return divisiClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    public Liga getLigaClub() {
        return ligaClub;
    }

    @Override
    public String toString() {
        return "Club" +
                "Nama Club= " + namaClub ;
    }
}
