package Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Helper.DialogHelper;
import Helper.ShareHelper;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }
    void init() { 
        setSize(1000, 600); 
        setIconImage(ShareHelper.APP_ICON); 
        setLocationRelativeTo(null); 
         
        new Timer(1000, new ActionListener() { 
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a"); 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                lblThoigian.setText(format.format(new Date())); 
            } 
        }).start(); 
        this.openWelcome(); 
        this.openLogin(); 
    } 
    void openLogin(){ 
        new DangNhapJDialog(this, true).setVisible(true); 
    } 
    void openWelcome(){ 
        new ChaoJDialog(this, true).setVisible(true); 
    } 
    void logoff(){ 
        ShareHelper.logoff(); 
        this.openLogin(); 
    } 
    void exit(){ 
         if(DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")){ 
            System.exit(0); 
        } 
    } 
    void openLoainhaCC(){ 
        if(ShareHelper.authenticated()){ 
            new LoainhaCC().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openQLNguoiDung(){ 
        if(ShareHelper.authenticated()){ 
            new QLNguoiDung().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openSanPham(){ 
        if(ShareHelper.authenticated()){ 
            new QLSanPham().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openThongTinKho(){ 
        if(ShareHelper.authenticated()){ 
            new QLThongTinKho().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openNhaCC(){ 
        if(ShareHelper.authenticated()){ 
             new NhaCC().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openPhieuNhap(){ 
        if(ShareHelper.authenticated()){ 
             new Phieunhap().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    }
    void openPhieuXuat(){ 
        if(ShareHelper.authenticated()){ 
             new Phieuxuat().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    }
     void openThongKe(int tabIndex){ 
        if(ShareHelper.authenticated()){ 
               new ThongKe(tabIndex).setVisible(true);
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    }
    void openAbout(){ 
        new Gioithieu(this, true).setVisible(true); 
    } 
    void openWebsite(){ 
        try { 
            Desktop.getDesktop().browse(new File("C:\\wamp64\\www\\banhang\\public_html\\LaptopStore.index").toURI()); 
        }  
        catch (IOException ex) { 
            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!"); 
         
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDXuat = new javax.swing.JButton();
        btnKetthuc = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        lblanhnen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblThoigian = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnQuanLi = new javax.swing.JMenu();
        mnNguoidung = new javax.swing.JMenuItem();
        mnThongTinKho = new javax.swing.JMenuItem();
        mnQLSanPham = new javax.swing.JMenuItem();
        mnQLLoaiSanPham = new javax.swing.JMenuItem();
        mnQLNhaCC = new javax.swing.JMenuItem();
        mnQLLoaiNhaCC = new javax.swing.JMenuItem();
        mnQLphieuxuat = new javax.swing.JMenuItem();
        mnQLPhieuNhap = new javax.swing.JMenuItem();
        mnThongKe = new javax.swing.JMenu();
        mnNguoiHocTungNam = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnDoanhthu = new javax.swing.JMenuItem();
        mnTroGiup = new javax.swing.JMenu();
        mnHuongdan = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnDXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnDXuat.setText("Đăng Xuất");
        btnDXuat.setFocusable(false);
        btnDXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDXuat);

        btnKetthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        btnKetthuc.setText("Kết Thúc");
        btnKetthuc.setFocusable(false);
        btnKetthuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetthuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetthucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetthuc);
        jToolBar1.add(jSeparator7);

        lblanhnen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblanhnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phương-pháp-quản-lý-kho-1024x512.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblThoigian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm.png"))); // NOI18N
        lblThoigian.setText("02:30:54 PM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblThoigian)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblThoigian)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jMenuBar1.setToolTipText("");

        mnHeThong.setText("Hệ thống  ");
        mnHeThong.setToolTipText("");
        mnHeThong.add(jSeparator1);

        mnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        mnDoiMatKhau.setText("Đổi mật khẩu");
        mnHeThong.add(mnDoiMatKhau);
        mnHeThong.add(jSeparator2);

        jMenuBar1.add(mnHeThong);

        mnQuanLi.setText("Quản lý");

        mnNguoidung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        mnNguoidung.setText("Quản lý người dùng");
        mnNguoidung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNguoidungActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnNguoidung);

        mnThongTinKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        mnThongTinKho.setText("Quảng lý thông tin kho");
        mnThongTinKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThongTinKhoActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnThongTinKho);

        mnQLSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lego brick.png"))); // NOI18N
        mnQLSanPham.setText("Quản lý sản phẩm");
        mnQLSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLSanPhamActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLSanPham);

        mnQLLoaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Genealogy.png"))); // NOI18N
        mnQLLoaiSanPham.setText("Quản lý loại sản phẩm ");
        mnQLLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLLoaiSanPhamActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLLoaiSanPham);

        mnQLNhaCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        mnQLNhaCC.setText("Quản lý nhà cung cấp");
        mnQLNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLNhaCCActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLNhaCC);

        mnQLLoaiNhaCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Full basket.png"))); // NOI18N
        mnQLLoaiNhaCC.setText("Quản lý loại cung cấp");
        mnQLLoaiNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLLoaiNhaCCActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLLoaiNhaCC);

        mnQLphieuxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Properties.png"))); // NOI18N
        mnQLphieuxuat.setText("Quản lý phiếu xuất");
        mnQLphieuxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLphieuxuatActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLphieuxuat);

        mnQLPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Notes.png"))); // NOI18N
        mnQLPhieuNhap.setText("Quản lý phiếu nhập");
        mnQLPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLPhieuNhapActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLPhieuNhap);

        jMenuBar1.add(mnQuanLi);

        mnThongKe.setText("Thống kê");

        mnNguoiHocTungNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        mnNguoiHocTungNam.setText("Nhập Kho");
        mnNguoiHocTungNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNguoiHocTungNamActionPerformed(evt);
            }
        });
        mnThongKe.add(mnNguoiHocTungNam);
        mnThongKe.add(jSeparator3);

        mnDoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dollar.png"))); // NOI18N
        mnDoanhthu.setText("Vốn nhập");
        mnDoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDoanhthuActionPerformed(evt);
            }
        });
        mnThongKe.add(mnDoanhthu);

        jMenuBar1.add(mnThongKe);

        mnTroGiup.setText("Trợ giúp");

        mnHuongdan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnHuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        mnHuongdan.setText("Hướng dẫn sử dụng");
        mnHuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHuongdanActionPerformed(evt);
            }
        });
        mnTroGiup.add(mnHuongdan);
        mnTroGiup.add(jSeparator5);

        mnGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N
        mnGioiThieu.setText("Giới thiệu kho hàng");
        mnGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGioiThieuActionPerformed(evt);
            }
        });
        mnTroGiup.add(mnGioiThieu);

        jMenuBar1.add(mnTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
            .addComponent(lblanhnen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblanhnen, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnThongTinKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnThongTinKhoActionPerformed
        // TODO add your handling code here:
        openThongTinKho();
        
    }//GEN-LAST:event_mnThongTinKhoActionPerformed

    private void mnQLLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnQLLoaiSanPhamActionPerformed

    private void mnNguoidungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNguoidungActionPerformed
        // TODO add your handling code here:
        openQLNguoiDung();
    }//GEN-LAST:event_mnNguoidungActionPerformed

    private void mnQLSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLSanPhamActionPerformed
        // TODO add your handling code here:
        openSanPham();
        
    }//GEN-LAST:event_mnQLSanPhamActionPerformed

    private void mnNguoiHocTungNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNguoiHocTungNamActionPerformed
        openThongKe(0);
                // TODO add your handling code here:
     
    }//GEN-LAST:event_mnNguoiHocTungNamActionPerformed

    private void mnDoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDoanhthuActionPerformed
        // TODO add your handling code here:
        openThongKe(1);
        
    }//GEN-LAST:event_mnDoanhthuActionPerformed

    private void mnHuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHuongdanActionPerformed
        // TODO add your handling code here:
        openWebsite();
    }//GEN-LAST:event_mnHuongdanActionPerformed

    private void mnGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGioiThieuActionPerformed
        // TODO add your handling code here:
        openAbout();
    }//GEN-LAST:event_mnGioiThieuActionPerformed

    private void btnDXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDXuatActionPerformed
        // TODO add your handling code here:
        MainJFrame.this.dispose();
        JOptionPane.showMessageDialog(this, "You have disconnect account, plz login to use this VinNew");
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnDXuatActionPerformed

    private void btnKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetthucActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKetthucActionPerformed

    private void mnQLNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLNhaCCActionPerformed
        // TODO add your handling code here:
        openNhaCC();
    }//GEN-LAST:event_mnQLNhaCCActionPerformed

    private void mnQLLoaiNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLLoaiNhaCCActionPerformed
        // TODO add your handling code here:
        openLoainhaCC();
    }//GEN-LAST:event_mnQLLoaiNhaCCActionPerformed

    private void mnQLphieuxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLphieuxuatActionPerformed
        // TODO add your handling code here:
        openPhieuXuat();
    }//GEN-LAST:event_mnQLphieuxuatActionPerformed

    private void mnQLPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLPhieuNhapActionPerformed
        // TODO add your handling code here:
        openPhieuNhap();
    }//GEN-LAST:event_mnQLPhieuNhapActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDXuat;
    private javax.swing.JButton btnKetthuc;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblThoigian;
    private javax.swing.JLabel lblanhnen;
    private javax.swing.JMenuItem mnDoanhthu;
    private javax.swing.JMenuItem mnDoiMatKhau;
    private javax.swing.JMenuItem mnGioiThieu;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenuItem mnHuongdan;
    private javax.swing.JMenuItem mnNguoiHocTungNam;
    private javax.swing.JMenuItem mnNguoidung;
    private javax.swing.JMenuItem mnQLLoaiNhaCC;
    private javax.swing.JMenuItem mnQLLoaiSanPham;
    private javax.swing.JMenuItem mnQLNhaCC;
    private javax.swing.JMenuItem mnQLPhieuNhap;
    private javax.swing.JMenuItem mnQLSanPham;
    private javax.swing.JMenuItem mnQLphieuxuat;
    private javax.swing.JMenu mnQuanLi;
    private javax.swing.JMenu mnThongKe;
    private javax.swing.JMenuItem mnThongTinKho;
    private javax.swing.JMenu mnTroGiup;
    // End of variables declaration//GEN-END:variables
}