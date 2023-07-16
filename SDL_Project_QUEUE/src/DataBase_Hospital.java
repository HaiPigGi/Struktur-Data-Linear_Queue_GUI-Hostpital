
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataBase_Hospital {

    private String jdbcURL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    private String user = "hr";
    private String password = "hr";
    private Connection con = null;
    private Statement stmt = null;
    private PreparedStatement pst = null;

    public DataBase_Hospital() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(jdbcURL, user, password);
            JOptionPane.showMessageDialog(null, "Success");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void InserTable() throws SQLException {
        try {
            String insert = "SELECT * PASIEN";
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1", "hr", "hr");

            pst = con.prepareStatement(insert);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Success");

        } catch (Exception ex) {
            Logger.getLogger(DataBase_Hospital.class.getName()).log(Level.SEVERE, "Data Tidak Masuk di Database", ex);
        }
    }
}

