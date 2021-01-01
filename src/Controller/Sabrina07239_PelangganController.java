package Controller;

import Entity.Sabrina07239_DaftarPelangganEntity;
import Entity.Sabrina07239_PelangganEntity;
import Model.Sabrina07239_PelangganModel;
import java.util.Date;
import java.util.ArrayList;
public class Sabrina07239_PelangganController implements Sabrina07239_ControllerInterface{
    int indexLogin = 0;
    public Sabrina07239_PelangganController() {
    }
    
    public Sabrina07239_PelangganEntity getData() {
        return Sabrina07239_AllObjectModel.pelangganModel.getpelangganEntityArrayList(indexLogin);
    }
    
    public void Sabrina07239_DaftarCamera(int indexCamera,  Sabrina07239_PelangganEntity pelanggan,
            boolean isVerified) {
        Sabrina07239_AllObjectModel.daftarPelangganmodel.insertDataPelanggan(new 
        Sabrina07239_DaftarPelangganEntity (indexCamera,pelanggan, isVerified));
    }
    
    @Override
    public void login(String id, String nama) {
        indexLogin = Sabrina07239_AllObjectModel.pelangganModel.cekData(id, nama);
    }
    
    public void insert(String id,String nama,
    String alamat, String noIdentitas,String notelp,Date tgl_sewa,Date tgl_kembali) {
        Sabrina07239_AllObjectModel.pelangganModel.insert(new Sabrina07239_PelangganEntity(id,nama,alamat,noIdentitas,notelp,tgl_sewa,tgl_kembali));
    }
    
    public Sabrina07239_PelangganEntity pelangganEntity() {
        return Sabrina07239_AllObjectModel.pelangganModel.getpelangganEntityArrayList(indexLogin);
    }
    
    public int cekDaftarPelanggan(String id) {
        int cek = Sabrina07239_AllObjectModel.daftarPelangganmodel.cekData(id, null);
        return cek;
    }
    
    public Sabrina07239_DaftarPelangganEntity showDaftarPelanggan(int index) {
        return Sabrina07239_AllObjectModel.daftarPelangganmodel.showDaftarPelanggan(index);
    }
    
    public void deleteDataPelanggan(int index) {
        Sabrina07239_AllObjectModel.daftarPelangganmodel.hapusPelangganModel(index);
    }
    public ArrayList<Sabrina07239_DaftarPelangganEntity> cekDaftarPelangganModel() {
        return Sabrina07239_AllObjectModel.daftarPelangganmodel.getdaftarpelangganArrayList();
    }
}
