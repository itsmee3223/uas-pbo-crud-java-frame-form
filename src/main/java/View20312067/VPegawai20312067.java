/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View20312067;

import Connection20312067.Konek20312067;
import ControlImplement20312067.ImplementPegawai20312067;
import ControlInterface20312067.InterfacePegawai20312067;
import Model20312067.MPegawai20312067;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramanda Ajisaka Asyraf
 */
public class VPegawai20312067 extends javax.swing.JFrame {
    List<MPegawai20312067> record20312067 = new ArrayList<>();
    InterfacePegawai20312067 service20312067;
    int row;
    
    void panggildata20312067(){
        try {
            record20312067 = service20312067.tampil20312067();
        } catch(Exception e20312067) {
            
        }
    }
    
    void isitabel20312067(){
        Object data20312067[][] = new Object[record20312067.size()][3];
        int x = 0;
        for(MPegawai20312067 pegawai20312067 : record20312067){
            data20312067[x][0] = pegawai20312067.getNip_20312067();
            data20312067[x][1] = pegawai20312067.getNama_20312067();
            data20312067[x][2] = pegawai20312067.getBagian_20312067();

            x++;
        }
        String judul20312067[] = {"NIP", "Nama Pegawai", "Bagian"};
        JtblPegawai20312067.setModel(new DefaultTableModel(data20312067, judul20312067));
    }
    
    void refreshdata20312067(){
        panggildata20312067();
        isitabel20312067();
    }
    
    void bersih20312067(){
        edNIP20312067.setText("");
        edNama20312067.setText("");
        edBagian20312067.setText("");
        edNIP20312067.setEnabled(true);
        edNIP20312067.requestFocus();
    }
    /**
     * Creates new form VPegawai20312067
     */
    public VPegawai20312067() {
        initComponents();
        service20312067 = new ImplementPegawai20312067();
        this.refreshdata20312067();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCari20312067 = new javax.swing.JButton();
        btnSimpan20312067 = new javax.swing.JButton();
        btnHapus20312067 = new javax.swing.JButton();
        btnKeluar20312067 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBaru20312067 = new javax.swing.JButton();
        edNIP20312067 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtblPegawai20312067 = new javax.swing.JTable();
        edNama20312067 = new javax.swing.JTextField();
        edCari20312067 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edBagian20312067 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnEdit20312067 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCari20312067.setText("Cari");
        btnCari20312067.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCari20312067ActionPerformed(evt);
            }
        });

        btnSimpan20312067.setText("Simpan");
        btnSimpan20312067.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpan20312067ActionPerformed(evt);
            }
        });

        btnHapus20312067.setText("Hapus");
        btnHapus20312067.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus20312067ActionPerformed(evt);
            }
        });

        btnKeluar20312067.setText("Keluar");
        btnKeluar20312067.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar20312067ActionPerformed(evt);
            }
        });

        jLabel1.setText("NIP");

        jLabel2.setText("Nama Pegawai");

        btnBaru20312067.setText("Baru");
        btnBaru20312067.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaru20312067ActionPerformed(evt);
            }
        });

        JtblPegawai20312067.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JtblPegawai20312067.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtblPegawai20312067MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JtblPegawai20312067);

        jLabel3.setText("Bagian");

        jLabel4.setText("Cari Pegawai");

        btnEdit20312067.setText("Edit");
        btnEdit20312067.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit20312067ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edNama20312067, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edNIP20312067, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edBagian20312067, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBaru20312067)
                            .addComponent(btnEdit20312067))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSimpan20312067, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus20312067))
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar20312067, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCari20312067)
                            .addComponent(edCari20312067, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edNIP20312067, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edNama20312067, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edBagian20312067, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBaru20312067)
                            .addComponent(btnHapus20312067))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan20312067)
                            .addComponent(btnEdit20312067)))
                    .addComponent(btnKeluar20312067, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edCari20312067, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari20312067)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCari20312067ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCari20312067ActionPerformed
        // TODO add your handling code here:
        try{
            Statement stm = (Statement) Konek20312067.sambung().createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM tbl_pegawai_20312067 WHERE Nama_20312067 LIKE '" + "%" + edCari20312067.getText() + "%" + "'");
            List<MPegawai20312067> listpegawai20312067 = new ArrayList<>();
                while(rst.next()){
                    MPegawai20312067 pegawai = new MPegawai20312067();
                    pegawai.setNip_20312067(rst.getString("Nip_20312067"));
                    pegawai.setNama_20312067(rst.getString("Nama_20312067"));
                    pegawai.setBagian_20312067(rst.getString("Bagian_20312067"));
                    listpegawai20312067.add(pegawai);
        }
        
        Object data20312067[][] = new Object[listpegawai20312067.size()][3];
        int x = 0;
        for(MPegawai20312067 pegawai20312067 : listpegawai20312067){
            data20312067[x][0] = pegawai20312067.getNip_20312067();
            data20312067[x][1] = pegawai20312067.getNama_20312067();
            data20312067[x][2] = pegawai20312067.getBagian_20312067();

            x++;
        }
        String judul20312067[] = {"NIP", "Nama Pegawai", "Bagian"};
        JtblPegawai20312067.setModel(new DefaultTableModel(data20312067, judul20312067));
        
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnCari20312067ActionPerformed

    private void btnSimpan20312067ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan20312067ActionPerformed
        // TODO add your handling code here:
        try {
            MPegawai20312067 pgw20312067 = new MPegawai20312067();
            pgw20312067.setNip_20312067(edNIP20312067.getText());
            pgw20312067.setNama_20312067(edNama20312067.getText());
            pgw20312067.setBagian_20312067(edBagian20312067.getText());


            service20312067.simpan20312067(pgw20312067);

            JOptionPane.showMessageDialog(this, "simpan sukses");
            this.refreshdata20312067();
            this.bersih20312067();

        } catch(Exception e) {

        }
    }//GEN-LAST:event_btnSimpan20312067ActionPerformed

    private void btnHapus20312067ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus20312067ActionPerformed
        // TODO add your handling code here:
        try {
            service20312067.hapus20312067(edNIP20312067.getText());
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            this.refreshdata20312067();
            this.bersih20312067();
        } catch(Exception e){
            
        }
    }//GEN-LAST:event_btnHapus20312067ActionPerformed

    private void btnKeluar20312067ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar20312067ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Yakin Keluar dari form barang?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btnKeluar20312067ActionPerformed

    private void btnBaru20312067ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaru20312067ActionPerformed
        // TODO add your handling code here:
        bersih20312067();
    }//GEN-LAST:event_btnBaru20312067ActionPerformed

    private void JtblPegawai20312067MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtblPegawai20312067MouseClicked
        // TODO add your handling code here:
        if(JtblPegawai20312067.getSelectedColumnCount() == 1){
            int rows = JtblPegawai20312067.getSelectedRow();
            edNIP20312067.setText(JtblPegawai20312067.getValueAt(rows, 0).toString());
            edNama20312067.setText(JtblPegawai20312067.getValueAt(rows, 1).toString());
            edBagian20312067.setText(JtblPegawai20312067.getValueAt(rows, 2).toString());
            edNIP20312067.setEnabled(false);
        }
    }//GEN-LAST:event_JtblPegawai20312067MouseClicked

    private void btnEdit20312067ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit20312067ActionPerformed
        // TODO add your handling code here:
        try {
            MPegawai20312067 pgw20312067 = new MPegawai20312067();
            pgw20312067.setNip_20312067(edNIP20312067.getText());
            pgw20312067.setNama_20312067(edNama20312067.getText());
            pgw20312067.setBagian_20312067(edBagian20312067.getText());
            service20312067.ubah20312067(pgw20312067);

            JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            this.refreshdata20312067();
            this.bersih20312067();
        } catch(Exception e){

        }
    }//GEN-LAST:event_btnEdit20312067ActionPerformed

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
            java.util.logging.Logger.getLogger(VPegawai20312067.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPegawai20312067.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPegawai20312067.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPegawai20312067.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPegawai20312067().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtblPegawai20312067;
    private javax.swing.JButton btnBaru20312067;
    private javax.swing.JButton btnCari20312067;
    private javax.swing.JButton btnEdit20312067;
    private javax.swing.JButton btnHapus20312067;
    private javax.swing.JButton btnKeluar20312067;
    private javax.swing.JButton btnSimpan20312067;
    private javax.swing.JTextField edBagian20312067;
    private javax.swing.JTextField edCari20312067;
    private javax.swing.JTextField edNIP20312067;
    private javax.swing.JTextField edNama20312067;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
