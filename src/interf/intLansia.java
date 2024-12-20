
package interf;

import java.util.List;
import model.Lansia;

public interface intLansia {
    public void tambahdata(Lansia S);
    public void ubahdata (Lansia newS, String nik);
    public void hapusdata(String nik);
    public Lansia getNamaByNama (String nama);
    public Lansia getNamaByNik (String nik);
    public List<Lansia> getAllLansia();
}
