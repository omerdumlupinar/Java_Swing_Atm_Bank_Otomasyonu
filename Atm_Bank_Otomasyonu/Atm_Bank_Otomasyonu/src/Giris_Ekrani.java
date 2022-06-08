
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Giris_Ekrani extends javax.swing.JFrame {

    islemeler is = new islemeler();

    public Giris_Ekrani() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_saatTarih = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_kullaniciAdi = new javax.swing.JLabel();
        jTextField_kAdi = new javax.swing.JTextField();
        jLabel_Limit = new javax.swing.JLabel();
        jLabel_parola = new javax.swing.JLabel();
        jLabel_hak = new javax.swing.JLabel();
        jPasswordField_Parola = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton_Giris = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Security");
        setLocation(new java.awt.Point(540, 170));
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saat-Tarih", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel_saatTarih.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_saatTarih.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_saatTarih.setText("Saat-Tarih");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_saatTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_saatTarih)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giriş", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel_kullaniciAdi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_kullaniciAdi.setText("Kullanıcı Adı");

        jTextField_kAdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel_Limit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Limit.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_Limit.setText("Limitiniz:");

        jLabel_parola.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel_parola.setText("Parola");

        jLabel_hak.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_hak.setForeground(new java.awt.Color(0, 102, 255));
        jLabel_hak.setText("3");

        jPasswordField_Parola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCheckBox1.setText("Göster");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton_Giris.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Giris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key.png"))); // NOI18N
        jButton_Giris.setText("Giriş  50");
        jButton_Giris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_GirisMouseClicked(evt);
            }
        });
        jButton_Giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GirisActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Kapat");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_kullaniciAdi)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_parola)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_kAdi)
                            .addComponent(jPasswordField_Parola)
                            .addComponent(jButton_Giris, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_Limit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_hak)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_kullaniciAdi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_kAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_parola)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_Parola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton_Giris)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Limit)
                    .addComponent(jLabel_hak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void saat_Tarih() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss - dd:MM:yyyy");
                jLabel_saatTarih.setText(df.format(dt));
            }
        });
        timer.start();
    }

    
    public int sayac = 50;
    public Timer timer;
    public void sayac() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayac--;
                jButton_Giris.setText("Giriş  " + sayac);
                if (sayac == 0) {
                    timer.stop();
                    jButton_Giris.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Giriş Zaman Aşımına Uğradı Lütfen Kapatıp Tekrar Deneyin...");
                }
            }
        });
        timer.start();
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        saat_Tarih();
        sayac();
        is.Baglanti();
    }//GEN-LAST:event_formWindowOpened


    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (jCheckBox1.isSelected()) {
            jPasswordField_Parola.setEchoChar((char) 0);
        } else {
            jPasswordField_Parola.setEchoChar('*');
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    int hak = 3;
    public String kullaniciAdi, parola, kontrol;

    private void jButton_GirisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GirisMouseClicked

        try {
            kullaniciAdi = jTextField_kAdi.getText();
            parola = jPasswordField_Parola.getText();

            if (kullaniciAdi.equals("")) {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adınızı Giriniz !", "Uyarı", HEIGHT);
            } else if (parola.equals("")) {
                JOptionPane.showMessageDialog(null, "Parolanızı Giriniz !", "Uyarı", HEIGHT);
            } else {
                kontrol = is.giris(kullaniciAdi, parola);
                if (kontrol.equals("basarili")) {
                    timer.stop();
                    Guvenlik_Kodu gk = new Guvenlik_Kodu();
                    gk.setVisible(true);
                    this.setVisible(false);
                    gk.setTitle(is.Guvenlik_Ad_Soyad_Getir(jTextField_kAdi.getText(), jPasswordField_Parola.getText()));

                    is.islemler_KullaniciAdi = kullaniciAdi;
                    is.islemler_Sifre = parola;

                } else {

                    JOptionPane.showMessageDialog(null, kontrol, "Uyarı", HEIGHT);
                    hak--;
                    jLabel_hak.setText(String.valueOf(hak));

                }
                if (hak == 0) {
                    JOptionPane.showMessageDialog(null, "Giriş Hakkınız Doldu Sistemden Çıkış Yapılacak...");
                    System.exit(0);
                }
            }

        } catch (SQLException ex) {
            ex.getErrorCode();
        }
    }//GEN-LAST:event_jButton_GirisMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton_GirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GirisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_GirisActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Giris_Ekrani().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Giris;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel_Limit;
    private javax.swing.JLabel jLabel_hak;
    private javax.swing.JLabel jLabel_kullaniciAdi;
    private javax.swing.JLabel jLabel_parola;
    private javax.swing.JLabel jLabel_saatTarih;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPasswordField jPasswordField_Parola;
    public javax.swing.JTextField jTextField_kAdi;
    // End of variables declaration//GEN-END:variables
}
