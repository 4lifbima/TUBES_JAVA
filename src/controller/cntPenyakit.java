package controller;

import java.util.ArrayList;
 import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
 import model.Penyakit;
 import java.util.List;
 import interf.intPenyakit;
        
public class cntPenyakit implements intPenyakit{
    ObjectContainer db;

    public cntPenyakit() {
        db = Db4oEmbedded.openFile("F:/Javacoba/Siposbindu/db_project.yap");
    }
    
    @Override
    public void tambahdata(Penyakit S) {
        db.store(S);
  
    }

    @Override
    public void ubahdata(Penyakit newS, String idPenyakit) {
        Penyakit S = null;
        ObjectSet result;
        Query qr = db.query();
        qr.constrain(Penyakit.class);
        qr.descend("idPenyakit").constrain(idPenyakit);
        result = qr.execute();
        if(result.hasNext()){
            S = (Penyakit)result.next();
            S = newS;
            db.store(newS);        
        }
    }

    @Override
    public void hapusdata(String idPenyakit) {
        Penyakit S = null;
        ObjectSet result;
        Query qr = db.query();
        qr.constrain(Penyakit.class);
        qr.descend("idPenyakit").constrain(idPenyakit);
        result = qr.execute();
        if(result.hasNext()){
            S = (Penyakit)result.next();
            db.delete(S);
            System.out.println("Data Berhasil Di Hapus" + idPenyakit);
        } else {
            System.out.println("Data Tidak Berhasil Di Hapus" + idPenyakit);
        }
    }

    @Override
    public Penyakit getNamaByNama(String nama) {
        Penyakit s =null;
        ObjectSet result;
        Query qr = db.query();
        qr.constrain(Penyakit.class);
        qr.descend("nama").constrain(nama);
        result = qr.execute();
        if(result.hasNext()){
            s = (Penyakit) result.next();
        }
        return null ;
    }

    @Override
    public Penyakit getNamaByidPenyakit(String idPenyakit) {
       Query qr = db.query();
        qr.constrain(Penyakit.class);
        qr.descend("idPenyakit").constrain(idPenyakit);
        ObjectSet<Penyakit> result = qr.execute();
        return result.isEmpty()? null : result.next();
       
    }

    @Override
    public List<Penyakit> getAllPenyakit() {
        List<Penyakit> Penyakit = new ArrayList<>();
        ObjectSet result = db.query(Penyakit.class);
        while(result.hasNext()){
            Penyakit.add((Penyakit) result.next());
        }
        return Penyakit;
    }
}
