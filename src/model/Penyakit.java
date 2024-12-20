package model;

public class Penyakit {
    private String idPenyakit;
    private String namaPenyakit;
    private String ptm;

    public Penyakit() {
    }

    public Penyakit(String idPenyakit, String namaPenyakit, String ptm) {
        this.idPenyakit = idPenyakit;
        this.namaPenyakit = namaPenyakit;
        this.ptm = ptm;
    }

    public String getIdPenyakit() {
        return idPenyakit;
    }

    public void setIdPenyakit(String idPenyakit) {
        this.idPenyakit = idPenyakit;
    }

    public String getNamaPenyakit() {
        return namaPenyakit;
    }

    public void setNamaPenyakit(String namaPenyakit) {
        this.namaPenyakit = namaPenyakit;
    }

    public String getPtm() {
        return ptm;
    }

    public void setPtm(String ptm) {
        this.ptm = ptm;
    }
}
