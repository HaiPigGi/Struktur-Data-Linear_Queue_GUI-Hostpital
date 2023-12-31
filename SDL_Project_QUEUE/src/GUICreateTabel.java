
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUICreateTabel extends javax.swing.JDialog {

    private Connection conn;
    private Statement stmt = null;
    private ResultSet rset = null;
    private PreparedStatement pst = null;
    isiHospital base;

    public GUICreateTabel(java.awt.Frame parent, boolean modal, isiHospital base) {
        initComponents();
        this.base = base;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNIM = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTglLahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buttonDaftar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daftar Pasien Baru");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel7.setText("Daftar Pasien Baru");

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon daftar/icons8-circled-envelope-30.png"))); // NOI18N
        jLabel1.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon daftar/icons8-lock-30.png"))); // NOI18N
        jLabel2.setText("Password :");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon daftar/icons8-badge-30.png"))); // NOI18N
        jLabel3.setText("NIK :");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon daftar/icons8-contact-30.png"))); // NOI18N
        jLabel4.setText("Nama :");

        tfTglLahir.setText("ddMMyyyy");
        tfTglLahir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTglLahirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTglLahirFocusLost(evt);
            }
        });
        tfTglLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTglLahirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon daftar/icons8-birthday-date-30.png"))); // NOI18N
        jLabel5.setText("Tanggal Lahir :");

        buttonDaftar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        buttonDaftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon daftar.png"))); // NOI18N
        buttonDaftar.setText("Daftar");
        buttonDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDaftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDaftar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNIM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTglLahir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(217, 217, 217))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(buttonDaftar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTglLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTglLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTglLahirActionPerformed

    private void buttonDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDaftarActionPerformed
        String email = tfEmail.getText();
        String password = tfPassword.getText();
        String nik = tfNIM.getText();
        String date = tfTglLahir.getText();
        String nama = tfNama.getText();

        if (email.isEmpty() || password.isEmpty() || nik.isEmpty() || date.isEmpty() || nama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mohon isi semua data yang tersedia");
            return;
        }

        try {
            //        ConnectDB handler = new ConnectDB();
            //        handler.getDBConnection();
            //        conn = handler.conn;
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1", "hr", "hr");

            try {
                stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
            } catch (SQLException ex) {
                Logger.getLogger(GUICreateTabel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                String query = "INSERT INTO BIODATA VALUES ('" + email + "','" + password + "'," + nik + ",'" + date + "','" + nama + "')";
                stmt.execute(query);
                tfEmail.setText("");
                tfPassword.setText("");
                tfNIM.setText("");
                tfTglLahir.setText("");
                tfNama.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(GUICreateTabel.class.getName()).log(Level.SEVERE, null, ex);
            }
            String pesan = "Selamat, " + nama + ". Data berhasil dimasukkan";
            JOptionPane.showMessageDialog(null, pesan);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(GUICreateTabel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDaftarActionPerformed

    private void tfTglLahirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTglLahirFocusGained
        if (tfTglLahir.getText().equals("ddMMyyyy")) {
            tfTglLahir.setText("");
        }
    }//GEN-LAST:event_tfTglLahirFocusGained

    private void tfTglLahirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTglLahirFocusLost
        if (tfTglLahir.getText().equals("")) {
            tfTglLahir.setText("ddMMyyyy");
        }
    }//GEN-LAST:event_tfTglLahirFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDaftar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNIM;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfTglLahir;
    // End of variables declaration//GEN-END:variables
}
