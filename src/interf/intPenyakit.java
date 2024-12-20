package interf;

import java.util.List;
import model.Penyakit;

public interface intPenyakit {
    public void tambahdata(Penyakit S);
    public void ubahdata (Penyakit newS, String nik);
    public void hapusdata(String idPenyakkit);
    public Penyakit getNamaByNama (String namaPenyakit);
    public Penyakit getNamaByidPenyakit (String idPenyakit);
    public List<Penyakit> getAllPenyakit();
}
