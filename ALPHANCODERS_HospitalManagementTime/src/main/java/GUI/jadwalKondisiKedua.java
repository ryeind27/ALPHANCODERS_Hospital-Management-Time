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
public class jadwalKondisiKedua extends javax.swing.JFrame {

    /**
     * Creates new form jadwalKondisiKeempat
     */
    public jadwalKondisiKedua() {
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
        jButtonTanggal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButtonCekJadwal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jButtonTanggal.setContentAreaFilled(false);
        jButtonTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTanggalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonTanggal);
        jButtonTanggal.setBounds(60, 240, 90, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/date.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 240, 100, 80);

        jButtonLogout.setContentAreaFilled(false);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLogout);
        jButtonLogout.setBounds(70, 420, 70, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 420, 70, 70);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("07:00 - 12:00");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(290, 230, 100, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("12:00 - 17:00");
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(430, 230, 100, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("17:00 - 22:00");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3);
        jRadioButton3.setBounds(570, 230, 100, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("22:00 - 03:00");
        jPanel2.add(jRadioButton4);
        jRadioButton4.setBounds(710, 230, 100, 23);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("03:00 - 08:00");
        jPanel2.add(jRadioButton5);
        jRadioButton5.setBounds(850, 230, 100, 23);

        jButtonCekJadwal.setText("CEK JADWAL");
        jButtonCekJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCekJadwalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCekJadwal);
        jButtonCekJadwal.setBounds(830, 430, 110, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(230, 460, 750, 76);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/5.png"))); // NOI18N
        jPanel2.add(BG);
        BG.setBounds(2, 0, 1280, 720);

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

    private void jButtonTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTanggalActionPerformed
        LocalDate objekMelihatTanggal = LocalDate.now();
        JOptionPane.showMessageDialog(this, "TANGGAL HARI INI ADALAH: " + objekMelihatTanggal);
    }//GEN-LAST:event_jButtonTanggalActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonCekJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCekJadwalActionPerformed
        String pernyataan;
        if(jRadioButton1.isSelected()){
            pernyataan = "WAKTU MASUK: 07:00"
                        +"\nWAKTU KELUAR: 12:00";
        }else if(jRadioButton2.isSelected()){
            pernyataan = "WAKTU MASUK: 12:00"
                        +"\nWAKTU KELUAR: 17:00";
        }else if(jRadioButton3.isSelected()){
            pernyataan = "WAKTU MASUK: 17:00"
                        +"\nWAKTU KELUAR: 22:00";
        }else if(jRadioButton4.isSelected()){
            pernyataan = "WAKTU MASUK: 12:00"
                        +"\nWAKTU KELUAR: 17:00";

        }else{
            pernyataan = "WAKTU MASUK: 12:00"
                        +"\nWAKTU KELUAR: 17:00";
        }
        jTextArea1.setText(pernyataan);
    }//GEN-LAST:event_jButtonCekJadwalActionPerformed

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
            java.util.logging.Logger.getLogger(jadwalKondisiKedua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiKedua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiKedua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwalKondisiKedua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwalKondisiKedua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCekJadwal;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
