
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AnaForm extends javax.swing.JFrame {

    islemeler is = new islemeler();
    DefaultTableModel model;

    public AnaForm() {
        initComponents();
        jMenuItem1.setEnabled(false);
        setResizable(false);
        ActionEvent evt = null;
        jMenuItem2ActionPerformed(evt);
        setLocationRelativeTo(null);

        //işlemleri Listeye Ekleme
        model = (DefaultTableModel) jTable1.getModel();
        try {
            ArrayList<islem> islemlerList = is.islemGetir();

            for (islem isle : islemlerList) {
                Object[] row = {isle.getIslemTarihi(), isle.getAcıklama(), isle.getTutar(), isle.getBakiye()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.getErrorCode();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_bakiye = new javax.swing.JLabel();
        jLabel_isim = new javax.swing.JLabel();
        jLabel_hesapNo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_BankaAdi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Havale = new javax.swing.JButton();
        jButton_paraYatırma = new javax.swing.JButton();
        jButton_Eft = new javax.swing.JButton();
        jButton_paraCekme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ana Sayfa");
        setLocation(new java.awt.Point(430, 280));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(40, 145, 146));
        jPanel1.setMinimumSize(new java.awt.Dimension(381, 155));
        jPanel1.setPreferredSize(new java.awt.Dimension(381, 157));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatar_Erkek.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("İsim:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hesap No:");

        jLabel_bakiye.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_bakiye.setText("Bakiye");

        jLabel_isim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_isim.setText("İsim");

        jLabel_hesapNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_hesapNo.setText("HesapNO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Bakiye:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N

        jLabel_BankaAdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_BankaAdi.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_BankaAdi.setText("Banka Adi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_isim)
                    .addComponent(jLabel_hesapNo)
                    .addComponent(jLabel_bakiye))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel_BankaAdi)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel_isim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel_hesapNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel_bakiye))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_BankaAdi)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(40, 145, 146));

        jButton_Havale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Havale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Untitled-1.png"))); // NOI18N
        jButton_Havale.setText("Havale");
        jButton_Havale.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_Havale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HavaleActionPerformed(evt);
            }
        });

        jButton_paraYatırma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_paraYatırma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paraCekme.png"))); // NOI18N
        jButton_paraYatırma.setText("Para Yatır => ");
        jButton_paraYatırma.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_paraYatırma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_paraYatırmaActionPerformed(evt);
            }
        });

        jButton_Eft.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Eft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eft.png"))); // NOI18N
        jButton_Eft.setText("EFT");
        jButton_Eft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EftActionPerformed(evt);
            }
        });

        jButton_paraCekme.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_paraCekme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paraCekme.png"))); // NOI18N
        jButton_paraCekme.setText("=> Para Çek");
        jButton_paraCekme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_paraCekmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Havale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_paraYatırma, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Eft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_paraCekme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_paraYatırma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_paraCekme, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Havale, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Eft, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İşlem Tarihi", "Açıklama", "Tutar", "Bakiye"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jMenu1.setText("Giriş");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("İşlem");
        jMenu2.setToolTipText("");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("On");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Off");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setSize(520, 560);
        jScrollPane1.setVisible(true);
        jMenuItem1.setEnabled(false);
        jMenuItem2.setEnabled(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public int para() {
        int para = (is.ikiyuz * 200) + (is.yuz * 100) + (is.elli * 50) + (is.yirmi * 20) + (is.on * 10) + (is.bes * 5);
        return para;
    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        is.Baglanti();
        try {
            is.anaform_Bilgileri();
            jLabel_isim.setText(is.ad + " " + is.soyad);
            jLabel_hesapNo.setText(String.valueOf(is.HesapNo));
            jLabel_BankaAdi.setText(is.bankaAd);
            jLabel_bakiye.setText(String.valueOf(para()));

            if (is.HesapNo == 20612055) {
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar2.jpg")));
            }
        } catch (SQLException ex) {

        }


    }//GEN-LAST:event_formWindowOpened

    Date dt = new Date();
    SimpleDateFormat df = new SimpleDateFormat("HH.mm ");
    SimpleDateFormat df2 = new SimpleDateFormat("EE");
    double eft_Saat = Double.parseDouble(df.format(dt));
    String gun = df2.format(dt);


    private void jButton_EftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EftActionPerformed

        if (gun.equals("Paz") || gun.equals("Cmt")) {
            JOptionPane.showMessageDialog(null, "Haftasonu işlem yapamazsınız");
        } else {
            if (eft_Saat > 09.00 && eft_Saat < 17.00) {
                try {
                    is.anaform_Bilgileri();
                    if (is.bakiye == 0) {
                        JOptionPane.showMessageDialog(null, "Hesabınıza Çekilebilir  Limit yok ");
                    } else {
                        Eft eft = new Eft();
                        eft.setVisible(true);
                        this.setVisible(false);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AnaForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "09.00-17.00 Satleri Arasında Eft Yapmalısınız..");
            }
        }


    }//GEN-LAST:event_jButton_EftActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setSize(520, 390);
        jScrollPane1.setVisible(false);
        jMenuItem1.setEnabled(true);
        jMenuItem2.setEnabled(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton_paraYatırmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_paraYatırmaActionPerformed
        try {
            is.anaform_Bilgileri();
            if (is.bakiye >= 6000) {
                JOptionPane.showMessageDialog(null, "Hesabınıza Para Yatırma Limitinizi Doldurdunuz. ");
            } else {
                Para_Yatir py = new Para_Yatir();
                py.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnaForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_paraYatırmaActionPerformed

    private void jButton_paraCekmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_paraCekmeActionPerformed

        try {
            is.anaform_Bilgileri();
            if (is.bakiye <= 0) {
                JOptionPane.showMessageDialog(null, "Hesabınıza Çekilebilir  Limit yok ");
            } else {
                Para_Cekme pc = new Para_Cekme();
                pc.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnaForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_paraCekmeActionPerformed

    private void jButton_HavaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HavaleActionPerformed

        try {
            is.anaform_Bilgileri();
            if (is.bakiye == 0) {
                JOptionPane.showMessageDialog(null, "Hesabınıza Havale Edilebilir Limit Yok ");
            } else {
                Havale h = new Havale();
                h.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnaForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_HavaleActionPerformed

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
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Eft;
    private javax.swing.JButton jButton_Havale;
    private javax.swing.JButton jButton_paraCekme;
    private javax.swing.JButton jButton_paraYatırma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_BankaAdi;
    private javax.swing.JLabel jLabel_bakiye;
    private javax.swing.JLabel jLabel_hesapNo;
    public javax.swing.JLabel jLabel_isim;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
