/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.time.LocalDate;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane; 
/**
 * sebuah class untuk memilih jadwal kerja
 * @author Alphancoders
 * @version 2021.11.27
 */
public class jadwalTetapPegawai extends javax.swing.JFrame {

    /**
     * Creates new form jadwalKondisiKeempat
     */
    public jadwalTetapPegawai() {
        initComponents();
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadiobuttonJadwalPertama = new javax.swing.JRadioButton();
        jRadioButtonJadwalKetiga = new javax.swing.JRadioButton();
        jRadiobuttonJadwalKedua = new javax.swing.JRadioButton();
        buttonProses = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(80, 250, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/date.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 230, 90, 120);

        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(90, 400, 60, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 390, 70, 100);

        jRadiobuttonJadwalPertama.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(jRadiobuttonJadwalPertama);
        jRadiobuttonJadwalPertama.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jRadiobuttonJadwalPertama.setText("07.00-15.00");
        jPanel2.add(jRadiobuttonJadwalPertama);
        jRadiobuttonJadwalPertama.setBounds(280, 220, 120, 50);

        jRadioButtonJadwalKetiga.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(jRadioButtonJadwalKetiga);
        jRadioButtonJadwalKetiga.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jRadioButtonJadwalKetiga.setText("23:00-06:00");
        jPanel2.add(jRadioButtonJadwalKetiga);
        jRadioButtonJadwalKetiga.setBounds(570, 220, 120, 50);

        jRadiobuttonJadwalKedua.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(jRadiobuttonJadwalKedua);
        jRadiobuttonJadwalKedua.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jRadiobuttonJadwalKedua.setText("15:00-23:00");
        jPanel2.add(jRadiobuttonJadwalKedua);
        jRadiobuttonJadwalKedua.setBounds(420, 220, 120, 50);

        buttonProses.setBackground(new java.awt.Color(204, 204, 255));
        buttonProses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonProses.setText("CEK JADWAL");
        buttonProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProsesActionPerformed(evt);
            }
        });
        jPanel2.add(buttonProses);
        buttonProses.setBounds(900, 420, 150, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CHOOSE YOUR FAVOURITE TIME ^_^");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(690, 150, 290, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("ANDA BEKERJA SEBAGAI PEGAWAI DI RUMAH SAKIT INI");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(360, 580, 560, 90);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(240, 460, 820, 70);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/5.png"))); // NOI18N
        jPanel2.add(BG);
        BG.setBounds(10, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LocalDate objekMelihatTanggal = LocalDate.now();
       JOptionPane.showMessageDialog(this, "TANGGAL HARI INI ADALAH: " + objekMelihatTanggal);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProsesActionPerformed
        String pernyataan;
        if(jRadiobuttonJadwalPertama.isSelected()){
            pernyataan = "WAKTU MASUK : 07:00" + 
                         "\nWAKTU KELUAR: 15:00"
            ;
        }else if(jRadiobuttonJadwalKedua.isSelected()){
            pernyataan = "WAKTU MASUK: 15:00" + 
                         "\nWAKTU KELUAR: 23:00"
            ;
        }else{
            pernyataan = "WAKTU MASUK: 23:00" + 
                         "\nWAKTU KELUAR: 06:00"
            ;
        }
        jTextArea1.setText(pernyataan);
    }//GEN-LAST:event_buttonProsesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jadwalTetapPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwalTetapPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwalTetapPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwalTetapPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwalTetapPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonProses;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonJadwalKetiga;
    private javax.swing.JRadioButton jRadiobuttonJadwalKedua;
    private javax.swing.JRadioButton jRadiobuttonJadwalPertama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
