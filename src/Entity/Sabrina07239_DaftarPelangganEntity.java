package Entity;
public class Sabrina07239_DaftarPelangganEntity {
   private Sabrina07239_PelangganEntity pelanggan; 
    private boolean isVerified;
    private int indexCamera; 
    
     public Sabrina07239_DaftarPelangganEntity(int indexCamera,Sabrina07239_PelangganEntity pelanggan, boolean isVerified) { 
        this.indexCamera = indexCamera;
        this.pelanggan = pelanggan;
        this.isVerified = isVerified;
    }

    public Sabrina07239_PelangganEntity getPelanggan() {
        return pelanggan;
    }

    public boolean isIsVerified() {
        return isVerified;
    }


    public int getIndexCamera() {
        return indexCamera;
    }

    public void setPelanggan(Sabrina07239_PelangganEntity pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public void setIndexCamera(int indexCamera) {
        this.indexCamera = indexCamera;
    }
     
}
