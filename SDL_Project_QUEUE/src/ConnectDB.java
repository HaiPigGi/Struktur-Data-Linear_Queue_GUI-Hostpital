
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectDB {

    String jdbcURL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    String user = "hr";
    String password = "hr";
    Connection conn;

    public ConnectDB() {
    }

    public void getDBConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // dari Driver class
            conn = DriverManager.getConnection(jdbcURL, user, password);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil!");
        } catch (Exception e) {
            // perform error handling here
            JOptionPane.showMessageDialog(null, "Koneksi Gagal!");
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
