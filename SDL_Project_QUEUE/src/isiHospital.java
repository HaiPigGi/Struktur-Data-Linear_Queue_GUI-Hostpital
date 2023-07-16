
import java.util.ArrayList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class isiHospital {

    ArrayList<Dokter> hospitalList = new ArrayList<>();

    public void isiDataHospital(Dokter data) {
        try {
            hospitalList.add(data);
        } catch (Exception ex) {
            Logger.getLogger(isiHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

