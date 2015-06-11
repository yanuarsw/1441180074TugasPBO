package com.smart;

public class Smartphone{

    private String namaSmartphone;
    private String lebarLayar;
    private char kualitasSmartphone; 
    private String jenisProcessor;
    private double hargaPasaran;
    private Pabrikan merkSmartphone;

    public Smartphone (String namaSmartphone, String lebarLayar, char kualitasSmartphone) {
        this.namaSmartphone = namaSmartphone;
        this.lebarLayar = lebarLayar;
        this.kualitasSmartphone = kualitasSmartphone;
    }

    public Smartphone(String namaSmartphone, String lebarLayar) {
        this.namaSmartphone = namaSmartphone;
        this.lebarLayar = lebarLayar;
    }

    public Smartphone(String namaSmartphone, String lebarLayar, char kualitasSmartphone, String jenisProcessor, double hargaPasaran) {
        this.namaSmartphone = namaSmartphone;
        this.lebarLayar = lebarLayar;
        this.kualitasSmartphone = kualitasSmartphone;
        this.jenisProcessor = jenisProcessor;
        this.hargaPasaran = hargaPasaran;
    }

    public Smartphone(String namaSmartphone, String lebarLayar, char kualitasSmartphone, String jenisProcessor, double hargaPasaran, Pabrikan merkSmartphone) {
        this.namaSmartphone = namaSmartphone;
        this.lebarLayar = lebarLayar;
        this.kualitasSmartphone = kualitasSmartphone;
        this.jenisProcessor = jenisProcessor;
        this.hargaPasaran = hargaPasaran;
        this.merkSmartphone = merkSmartphone;
    }

    public String getNamaSmartphone() {
        return namaSmartphone;
    }

    public void setNamaSmartphone(String namaSmartphone) {
        this.namaSmartphone = namaSmartphone;
    }

    public String getLebarLayar() {
        return lebarLayar;
    }

    public void setLebarLayar(String lebarLayar) {
        this.lebarLayar = lebarLayar;
    }

    public char getKualitasSmartphone() {
        return kualitasSmartphone;
    }

    public void setKualitasSmartphone(char kualitasSmartphone) {
        this.kualitasSmartphone = kualitasSmartphone;
    }

    public String getJenisProcessor() {
        return jenisProcessor;
    }

    public void setJenisProcessor(String jenisProcessor) {
        this.jenisProcessor = jenisProcessor;
    }

    public double getHargaPasaran() {
        return hargaPasaran;
    }

    public void setHargaPasaran(double hargaPasaran) {
        this.hargaPasaran = hargaPasaran;
    }



    @Override
    public String toString() {
        return "{" +
                "Nama smartphone: '" + namaSmartphone + '\'' +
                ", Lebar Layar: '" + lebarLayar + '\'' +
                ", Kualitas Smartphone: " + kualitasSmartphone +
                ", Jenis Processor: '" + jenisProcessor + '\'' +
                ", Harga Pasaran: " + hargaPasaran +
                ", Merk Smartphone:'" + merkSmartphone + '\'' +
                '}';
    }
}
