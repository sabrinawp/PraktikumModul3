package Model;
import Entity.Sabrina07239_CameraEntity;
import Entity.Sabrina07239_PelangganEntity;
import Model.Sabrina07239_DaftarPelangganModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Sabrina07239_PelangganModel implements Sabrina07239_ModeIinterfaces { 
    private ArrayList<Sabrina07239_PelangganEntity> pelangganEntityArrayList;
     
     public Sabrina07239_PelangganModel(){
        pelangganEntityArrayList = new ArrayList<Sabrina07239_PelangganEntity>();
    }
public void insert(Sabrina07239_PelangganEntity pelangganEntity){//menambah data pelangan
    pelangganEntityArrayList.add(pelangganEntity);  
}
public void hapusPelangganModel(int index) { //hapus data pelanggan 
        pelangganEntityArrayList.remove(pelangganEntityArrayList.get(index));
    }
public int size() {
        return pelangganEntityArrayList.size();
    }
 @Override
    public int cekData(String id, String nama){
        int loop = 0;
        while (!pelangganEntityArrayList.get(loop).getId().equals(id) && 
                !pelangganEntityArrayList.get(loop).getnama().equals(nama)){
            loop++;
        }
        return loop;
    }
    public Sabrina07239_PelangganEntity getpelangganEntityArrayList(int index){
        return pelangganEntityArrayList.get(index);
    }
}
