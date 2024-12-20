
package controller;

import java.util.ArrayList;
 import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
 import model.Lansia;
 import java.util.List;
 import interf.intLansia;

public class cntLansia implements intLansia{
    ObjectContainer db;

    public cntLansia() {
        db = Db4oEmbedded.openFile("F:/Javacoba/Siposbindu/db_project.yap");
    }
    
    @Override
    public void tambahdata(Lansia S) {
        db.store(S);
  
    }

    @Override
    public void ubahdata(Lansia newS, String nik) {
        Lansia S = null;
        ObjectSet result;
        Query qr = db.query();
        qr.constrain(Lansia.class);
        qr.descend("nik").constrain(nik);
        result = qr.execute();
        if(result.hasNext()){
            S = (Lansia)result.next();
            S = newS;
            db.store(newS);        
        }
    }

    @Override
    public void hapusdata(String nik) {
        Lansia S = null;
        ObjectSet result;
        Query qr = db.query();
        qr.constrain(Lansia.class);
        qr.descend("nik").constrain(nik);
        result = qr.execute();
        if(result.hasNext()){
            S = (Lansia)result.next();
            db.delete(S);
            System.out.println("Data Berhasil Di Hapus" + nik);
        } else {
            System.out.println("Data Tidak Berhasil Di Hapus" + nik);
        }
    }

    @Override
    public Lansia getNamaByNama(String nama) {
        Lansia s =null;
        ObjectSet result;
        Query qr = db.query();
        qr.constrain(Lansia.class);
        qr.descend("nama").constrain(nama);
        result = qr.execute();
        if(result.hasNext()){
            s = (Lansia) result.next();
        }
        return null ;
    }

    @Override
    public Lansia getNamaByNik(String nik) {
       Query qr = db.query();
        qr.constrain(Lansia.class);
        qr.descend("nik").constrain(nik);
        ObjectSet<Lansia> result = qr.execute();
        return result.isEmpty()? null : result.next();
       
    }

    @Override
    public List<Lansia> getAllLansia() {
        List<Lansia> Lansia = new ArrayList<>();
        ObjectSet result = db.query(Lansia.class);
        while(result.hasNext()){
            Lansia.add((Lansia) result.next());
        }
        return Lansia;
    }
    
}
