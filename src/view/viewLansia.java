
package view;

import controller.cntLansia;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Lansia;

public class viewLansia extends javax.swing.JInternalFrame {
    cntLansia daoLansia; 
    public viewLansia() {
       initComponents();
        daoLansia = new cntLansia();
        tampilData();
    }
    private void tampilData(){
        List<Lansia> Lansia = daoLansia.getAllLansia();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (Lansia s : Lansia) {
            model.addRow(new Object[]{
                s.getNik(),
                s.getNama(),
                s.getUmur(),
                s.getJkel(),
                s.getAlamat()
            });
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        umur = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        Daftar = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jkel = new javax.swing.JComboBox<>();

        jLabel1.setText("NIK :");

        jLabel2.setText("Nama :");

        jLabel3.setText("Umur :");

        jLabel4.setText("Jenis Kelamin :");

        jLabel5.setText("Alamat :");

        nik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nikKeyTyped(evt);
            }
        });

        Daftar.setText("Daftar");
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });

        Keluar.setText("Exit");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nik", "Nama", "Umur", "Jenis Kelamin", "Alamat"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addComponent(Daftar)
                .addGap(402, 402, 402)
                .addComponent(Keluar)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hapus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(umur, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nik)
                            .addComponent(alamat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jkel, 0, 170, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(umur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Keluar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Daftar)
                        .addComponent(Hapus)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarActionPerformed
                                  
        Lansia s = new Lansia();
        s.setNik(nik.getText());
        s.setNama(nama.getText());
        s.setUmur(umur.getText());
        s.setJkel(jkel.getSelectedItem().toString());
        s.setAlamat(alamat.getText());
        if(daoLansia.getNamaByNik(s.getNik()) == null){
            daoLansia.tambahdata(s);
        } else {
            daoLansia.ubahdata(s, nik.getText());
        }
        tampilData();
        nik.setText("");
        nama.setText("");
        umur.setText("");
        alamat.setText("");
    }                                        

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {                                     
        Lansia s = null ;
        s = daoLansia.getNamaByNik(nik.getText());
        if(null !=  s){
            nama.setText(s.getNama());
            umur.setText(s.getUmur());
            alamat.setText(s.getAlamat());
            jkel.setSelectedItem(s.getJkel());
        } else {
            nama.setText("");
            umur.setText("");
            alamat.setText("");
            jkel.setSelectedIndex(0);
        }
    
    }//GEN-LAST:event_DaftarActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
         daoLansia.hapusdata(nik.getText());
        tampilData();
    }//GEN-LAST:event_HapusActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void nikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nikKeyTyped
         Lansia s = null ;
        s = daoLansia.getNamaByNik(nik.getText());
        if(null !=  s){
            nama.setText(s.getNama());
            umur.setText(s.getUmur());
            jkel.setSelectedItem(s.getJkel());
            alamat.setText(s.getAlamat());
        } else {
            nama.setText("");
            umur.setText("");
            jkel.setSelectedIndex(0);
            alamat.setText("");
        }
    }//GEN-LAST:event_nikKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Daftar;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jkel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField umur;
    // End of variables declaration//GEN-END:variables
}
