package Entity;
import java.util.Date;
public class Sabrina07239_PetugasEntity extends Sabrina07239_RentalCamera{
    public Sabrina07239_PetugasEntity(String id,String nama,
    String alamat, String noIdentitas,String notelp){
    super(id,nama,alamat,noIdentitas,notelp); 
}
 @Override   
    public String getId() {
        return id;
    }
}

