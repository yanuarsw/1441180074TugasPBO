package bank;

/**
 * Created by TTheBraveone on 6/17/2015.
 */
public class Nasabah {

    private String nama;
    private Rek saldonya;


    public Nasabah(String nama) {
        this.nama = nama;
    }

    public Nasabah(String nama, Rek saldonya) {
        this.nama = nama;
        this.saldonya = saldonya;
    }

    public Rek getSaldoku() {
        return saldonya;
    }

    public void setSaldoku(Rek saldoku) {
        this.saldonya = saldoku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "nama='" + nama + '\'' +
                ", saldoku=" + saldonya +
                '}';
    }
}
