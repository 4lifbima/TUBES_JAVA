package model;

public class Lansia {
    private String nik;
    private String nama;
    private String umur;
    private String jkel;
    private String alamat;

    public Lansia() {
    }

    public Lansia(String nik, String nama, String umur, String jkel, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.umur = umur;
        this.jkel = jkel;
        this.alamat = alamat;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getJkel() {
        return jkel;
    }

    public void setJkel(String jkel) {
        this.jkel = jkel;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
 
