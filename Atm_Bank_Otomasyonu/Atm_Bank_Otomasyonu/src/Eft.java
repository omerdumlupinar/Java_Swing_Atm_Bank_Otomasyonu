
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Eft extends javax.swing.JFrame {

    islemeler is = new islemeler();
    DefaultTableModel model;

    public Eft() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        ActionEvent evt = null;
        jMenuItem3ActionPerformed(evt);
        jMenuItem2.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel_Yazi = new javax.swing.JLabel();
        jLabel_avatar1 = new javax.swing.JLabel();
        jLabel_Yazi1 = new javax.swing.JLabel();
        jLabel_Yazi2 = new javax.swing.JLabel();
        jTextField_hesapNo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_ikiyuz = new javax.swing.JLabel();
        jLabel_yuz = new javax.swing.JLabel();
        jLabel_elli = new javax.swing.JLabel();
        jLabel_yirmi = new javax.swing.JLabel();
        jLabel_on = new javax.swing.JLabel();
        jLabel_bes = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_avatar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel_bakiye = new javax.swing.JLabel();
        jLabel_isim = new javax.swing.JLabel();
        jLabel_hesapNo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_BankaAdi = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jPanel1.setBackground(new java.awt.Color(130, 189, 150));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EFT Menüsü");
        setSize(new java.awt.Dimension(570, 470));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("200");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("100");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("5");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("İşlem Onayla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("20");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("10");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.setEnabled(false);
        jTextField1.setRequestFocusEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("50");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel_Yazi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Yazi.setForeground(new java.awt.Color(204, 204, 0));
        jLabel_Yazi.setText("Hesap No");

        jLabel_avatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paraCekme.png"))); // NOI18N

        jLabel_Yazi1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Yazi1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel_Yazi1.setText("Ana Sayfa=>");
        jLabel_Yazi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Yazi1MouseClicked(evt);
            }
        });

        jLabel_Yazi2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Yazi2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel_Yazi2.setText("EFT Tutarı");

        jTextField_hesapNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_hesapNo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField_hesapNoCaretUpdate(evt);
            }
        });
        jTextField_hesapNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_hesapNoActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vakıf Bankası", "Ziraat Bankası", "İş Bankası", "Garanti Bankası" }));
        jComboBox1.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel_Yazi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_hesapNo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Yazi2)
                                        .addGap(50, 50, 50)))
                                .addGap(163, 163, 163))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel_avatar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Yazi1))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_Yazi2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Yazi1)
                                .addGap(19, 19, 19)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Yazi)
                            .addComponent(jTextField_hesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yuzz.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ikiyuzz.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bess.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ellii.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yirmii.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/onn.png"))); // NOI18N

        jLabel_ikiyuz.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_ikiyuz.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ikiyuz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ikiyuz.setText("00 ");

        jLabel_yuz.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_yuz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_yuz.setText("00 ");

        jLabel_elli.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_elli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_elli.setText("00 ");

        jLabel_yirmi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_yirmi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_yirmi.setText("00 ");

        jLabel_on.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_on.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_on.setText("00 ");

        jLabel_bes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_bes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bes.setText("00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel_ikiyuz)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_yuz)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel_elli)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel_yirmi)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel_on)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_bes)
                        .addGap(47, 47, 47))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel100)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_elli)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_yuz)
                        .addComponent(jLabel_ikiyuz))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_on)
                        .addComponent(jLabel_yirmi))
                    .addComponent(jLabel_bes))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(40, 145, 146));
        jPanel5.setMinimumSize(new java.awt.Dimension(381, 155));
        jPanel5.setPreferredSize(new java.awt.Dimension(381, 157));

        jLabel_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatar_Erkek.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("İsim:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Hesap No:");

        jLabel_bakiye.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_bakiye.setText("Bakiye");

        jLabel_isim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_isim.setText("İsim");

        jLabel_hesapNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_hesapNo.setText("HesapNO");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Bakiye:");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N

        jLabel_BankaAdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_BankaAdi.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_BankaAdi.setText("Banka Adi");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel_avatar)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_isim)
                    .addComponent(jLabel_hesapNo)
                    .addComponent(jLabel_bakiye))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_BankaAdi))
                .addGap(61, 61, 61))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel_isim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel_hesapNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel_bakiye)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_BankaAdi))
                            .addComponent(jLabel_avatar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("İşlemler");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("On");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Off");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String islem_tarih;
    Date dt = new Date();
    SimpleDateFormat df = new SimpleDateFormat("dd.mm-HH:mm ");

    public int para() {
        int para = (is.ikiyuz * 200) + (is.yuz * 100) + (is.elli * 50) + (is.yirmi * 20) + (is.on * 10) + (is.bes * 5);
        return para;
    }

    public void bilgilistele() {
        is.Baglanti();
        try {
            is.anaform_Bilgileri();
            jLabel_isim.setText(is.ad + " " + is.soyad);
            jLabel_hesapNo.setText(String.valueOf(is.HesapNo));
            jLabel_bakiye.setText(String.valueOf(para()));
            jLabel_BankaAdi.setText(String.valueOf(is.bankaAd));

            jLabel_ikiyuz.setText(String.valueOf(is.ikiyuz));
            jLabel_yuz.setText(String.valueOf(is.yuz));
            jLabel_elli.setText(String.valueOf(is.elli));
            jLabel_yirmi.setText(String.valueOf(is.yirmi));
            jLabel_on.setText(String.valueOf(is.on));
            jLabel_bes.setText(String.valueOf(is.bes));

            if (is.HesapNo == 20612055) {
                jLabel_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar2.jpg")));
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(AnaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int arapara = 0;
    String isle = "EFT";

    public void islem_ekle_ve_para_ekle() {

        try {

            is.Havala_Alan_Bilgileri(Integer.parseInt(jTextField_hesapNo.getText()));
            String banka = jLabel_BankaAdi.getText();

            if (banka.equals(jComboBox1.getSelectedItem())) {
                JOptionPane.showMessageDialog(null, "Aynı Banka Üyelerine EFT yapılmaz Havala Bölümüne Gidiniz...", "Uyarı", HEIGHT);
                jTextField1.setText("");
            } else {

                if (is.havale_bakiye + gonderilecekToplamPara > 6000) {
                    int alıcıMiktar = 6000 - is.havale_bakiye;
                    JOptionPane.showMessageDialog(null, "Gönderdiğiniz Miktar Alıcının Limitini Aşıyor Gönderim Limit " + alıcıMiktar + " Olmalı...", "Uyarı", HEIGHT);
                    jTextField_hesapNo.setText("");
                } else {
                    islem_tarih = df.format(dt);
                    is.Havala_Alan_Bilgileri(Integer.parseInt(jTextField_hesapNo.getText()));
                    jLabel_bakiye.setText(String.valueOf(arapara));
                    //gönderen islem
                    is.islemEkle(islem_tarih, isle, ("-" + gonderilecekToplamPara), Integer.parseInt(jLabel_bakiye.getText()), Integer.parseInt(jLabel_hesapNo.getText()));
                    //alıcı islem
                    is.islemEkle(islem_tarih, isle, ("+" + gonderilecekToplamPara), (is.havale_bakiye + gonderilecekToplamPara), Integer.parseInt(jTextField_hesapNo.getText()));
                    JOptionPane.showMessageDialog(null, "Hesabınızadan\n" + jTextField_hesapNo.getText() + " Nolu Hesaba\n" + gonderilecekToplamPara + " TL EFT Gerçekleşmiştir.", "Bilgi", ICONIFIED);
                    jTextField1.setText(String.valueOf(0));
                    //gonderen banknot gunceleme
                    is.banknot_ekle(
                            Integer.parseInt(jLabel_ikiyuz.getText()),
                            Integer.parseInt(jLabel_yuz.getText()),
                            Integer.parseInt(jLabel_elli.getText()),
                            Integer.parseInt(jLabel_yirmi.getText()),
                            Integer.parseInt(jLabel_on.getText()),
                            Integer.parseInt(jLabel_bes.getText()),
                            Integer.parseInt(jLabel_hesapNo.getText()));

                    is.Havala_Alan_Bilgileri(Integer.parseInt(jTextField_hesapNo.getText()));
                    //alıcı banknot gunceleme
                    is.havale_banknotlar(gonderilecekToplamPara);
                    is.banknot_ekle(is.havale_ikiyuz, is.havale_yuz, is.havale_elli, is.havale_yirmi, is.havale_on, is.havale_bes, Integer.parseInt(jTextField_hesapNo.getText()));

                    jTextField_hesapNo.setText("");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Para_Yatir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        bilgilistele();

        if (is.ikiyuz <= 0) {
            jButton1.setEnabled(false);
        }
        if (is.yuz <= 0) {
            jButton2.setEnabled(false);
        }
        if (is.elli <= 0) {
            jButton7.setEnabled(false);
        }
        if (is.yirmi <= 0) {
            jButton5.setEnabled(false);
        }
        if (is.on <= 0) {
            jButton6.setEnabled(false);
        }
        if (is.bes <= 0) {
            jButton3.setEnabled(false);
        }


    }//GEN-LAST:event_formWindowOpened

    int gonderilecekToplamPara = 0;


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jLabel_ikiyuz.setText(String.valueOf(Integer.parseInt(jLabel_ikiyuz.getText()) - 1));
        if (Integer.parseInt(jLabel_ikiyuz.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "200'lük Limiti Doldu", "Bilgi", ICONIFIED);
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);
        }

        gonderilecekToplamPara = Integer.parseInt(jTextField1.getText()) + Integer.parseInt(jButton1.getText());
        jTextField1.setText(String.valueOf(gonderilecekToplamPara));


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jLabel_yuz.setText(String.valueOf(Integer.parseInt(jLabel_yuz.getText()) - 1));
        if (Integer.parseInt(jLabel_yuz.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "100'lük Limiti Doldu", "Bilgi", ICONIFIED);
            jButton2.setEnabled(false);
        } else {
            jButton2.setEnabled(true);
        }

        gonderilecekToplamPara = Integer.parseInt(jTextField1.getText()) + Integer.parseInt(jButton2.getText());
        jTextField1.setText(String.valueOf(gonderilecekToplamPara));

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jLabel_elli.setText(String.valueOf(Integer.parseInt(jLabel_elli.getText()) - 1));
        if (Integer.parseInt(jLabel_elli.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "50'lik Limiti Doldu", "Bilgi", ICONIFIED);
            jButton7.setEnabled(false);
        } else {
            jButton7.setEnabled(true);
        }

        gonderilecekToplamPara = Integer.parseInt(jTextField1.getText()) + Integer.parseInt(jButton7.getText());
        jTextField1.setText(String.valueOf(gonderilecekToplamPara));

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jLabel_bes.setText(String.valueOf(Integer.parseInt(jLabel_bes.getText()) - 1));
        if (Integer.parseInt(jLabel_bes.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "5'lik Limiti Doldu", "Bilgi", ICONIFIED);
            jButton3.setEnabled(false);
        } else {
            jButton3.setEnabled(true);
        }

        gonderilecekToplamPara = Integer.parseInt(jTextField1.getText()) + Integer.parseInt(jButton3.getText());
        jTextField1.setText(String.valueOf(gonderilecekToplamPara));


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        jLabel_on.setText(String.valueOf(Integer.parseInt(jLabel_on.getText()) - 1));
        if (Integer.parseInt(jLabel_on.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "10'luk Limiti Doldu", "Bilgi", ICONIFIED);
            jButton6.setEnabled(false);
        } else {
            jButton6.setEnabled(true);
        }

        gonderilecekToplamPara = Integer.parseInt(jTextField1.getText()) + Integer.parseInt(jButton6.getText());
        jTextField1.setText(String.valueOf(gonderilecekToplamPara));


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jLabel_yirmi.setText(String.valueOf(Integer.parseInt(jLabel_yirmi.getText()) - 1));
        if (Integer.parseInt(jLabel_yirmi.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "20'lik Limiti Doldu", "Bilgi", ICONIFIED);
            jButton5.setEnabled(false);
        } else {
            jButton5.setEnabled(true);
        }

        gonderilecekToplamPara = Integer.parseInt(jTextField1.getText()) + Integer.parseInt(jButton5.getText());
        jTextField1.setText(String.valueOf(gonderilecekToplamPara));


        
    }//GEN-LAST:event_jButton5ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            if (Integer.parseInt(jTextField1.getText()) != 0) {
                if (!jTextField_hesapNo.getText().equals("")) {
                    is.Havala_Alan_Bilgileri(Integer.parseInt(jTextField_hesapNo.getText()));

                    if (is.Eft_hesap_Kontrol(Integer.parseInt(jTextField_hesapNo.getText()), String.valueOf(jComboBox1.getSelectedItem()))) {

                        if (!jTextField_hesapNo.getText().equals(jLabel_hesapNo.getText())) {

                            arapara = Integer.parseInt(jLabel_bakiye.getText()) - gonderilecekToplamPara;
                            islem_ekle_ve_para_ekle();

                        } else {
                            JOptionPane.showMessageDialog(null, "Kendi Hesabınıza EFT Yapamassınız.", "Uyarı", HEIGHT);
                            jTextField1.setText("");
                        }
                    } else {

                        arapara = Integer.parseInt(jLabel_bakiye.getText()) - gonderilecekToplamPara;
                        islem_tarih = df.format(dt);
                        jLabel_bakiye.setText(String.valueOf(arapara));
                        //gönderen islem
                        is.islemEkle(islem_tarih, isle, ("-" + gonderilecekToplamPara), Integer.parseInt(jLabel_bakiye.getText()), Integer.parseInt(jLabel_hesapNo.getText()));
                        JOptionPane.showMessageDialog(null, "Hesabınızadan\n" + jTextField_hesapNo.getText() + " Nolu Hesaba\n" + gonderilecekToplamPara + " TL EFT Gerçekleşmiştir.", "Bilgi", ICONIFIED);
                        jTextField1.setText(String.valueOf(0));
                        //gonderen banknot gunceleme
                        is.banknot_ekle(
                                Integer.parseInt(jLabel_ikiyuz.getText()),
                                Integer.parseInt(jLabel_yuz.getText()),
                                Integer.parseInt(jLabel_elli.getText()),
                                Integer.parseInt(jLabel_yirmi.getText()),
                                Integer.parseInt(jLabel_on.getText()),
                                Integer.parseInt(jLabel_bes.getText()),
                                Integer.parseInt(jLabel_hesapNo.getText()));
                        jTextField_hesapNo.setText("");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Lütfen Alıcı Bilgisi Giriniz...", "Uyarı", HEIGHT);
                }
            } else {
                JOptionPane.showMessageDialog(null, "0 Girilmez...", "Uyarı", HEIGHT);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Lütfen Rakamlar İle İşlem Yapınız...", "Uyarı", HEIGHT);
        } catch (SQLException ex) {
            Logger.getLogger(Havale.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        this.setSize(590, 540);
        jMenuItem2.setEnabled(false);
        jMenuItem3.setEnabled(true);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        this.setSize(580, 450);
        jMenuItem2.setEnabled(true);
        jMenuItem3.setEnabled(false);
        jPanel3.setVisible(false);


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel_Yazi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Yazi1MouseClicked
        AnaForm af = new AnaForm();
        this.setVisible(false);
        af.setVisible(true);
    }//GEN-LAST:event_jLabel_Yazi1MouseClicked

    private void jTextField_hesapNoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField_hesapNoCaretUpdate
        String deger = jTextField_hesapNo.getText().substring(0);
        if (deger.equals("1")) {
            jComboBox1.setSelectedIndex(0);
            jComboBox1.setBackground(Color.yellow);
        } else if (deger.equals("2")) {
            jComboBox1.setSelectedIndex(1);
            jComboBox1.setBackground(Color.RED);
            jComboBox1.setForeground(Color.WHITE);

        } else if (deger.equals("3")) {
            jComboBox1.setSelectedIndex(2);
            jComboBox1.setBackground(Color.BLUE);
            jComboBox1.setForeground(Color.WHITE);

        } else if (deger.equals("4")) {
            jComboBox1.setSelectedIndex(3);
            jComboBox1.setBackground(Color.GREEN);

        }
    }//GEN-LAST:event_jTextField_hesapNoCaretUpdate

    private void jTextField_hesapNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_hesapNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_hesapNoActionPerformed

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
            java.util.logging.Logger.getLogger(Para_Yatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Para_Yatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Para_Yatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Para_Yatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Para_Yatir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_BankaAdi;
    private javax.swing.JLabel jLabel_Yazi;
    private javax.swing.JLabel jLabel_Yazi1;
    private javax.swing.JLabel jLabel_Yazi2;
    private javax.swing.JLabel jLabel_avatar;
    private javax.swing.JLabel jLabel_avatar1;
    private javax.swing.JLabel jLabel_bakiye;
    private javax.swing.JLabel jLabel_bes;
    private javax.swing.JLabel jLabel_elli;
    private javax.swing.JLabel jLabel_hesapNo;
    private javax.swing.JLabel jLabel_ikiyuz;
    public javax.swing.JLabel jLabel_isim;
    private javax.swing.JLabel jLabel_on;
    private javax.swing.JLabel jLabel_yirmi;
    private javax.swing.JLabel jLabel_yuz;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_hesapNo;
    // End of variables declaration//GEN-END:variables
}
