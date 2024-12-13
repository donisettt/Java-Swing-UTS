/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.text.NumberFormat;

/**
 *
 * @author DONI SETIAWAN
 */


class Transaksi {
    String Nama, Kode_Barang, Tanggal, Harga_Satuan, Qty_Jual, Harga_Akhir, Diskon, Total_harga, Bayar, Kembalian;
    int Stok;
//    public void getKasir() {
//        Kasir = "Doni Setiawan Wahyono";
//    }
    
    public String getNama() {
        return this.Nama;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public String getKodeBarang() {
        return this.Kode_Barang;
    }
    
    public void setKodeBarang(String Kode_Barang) {
        this.Kode_Barang = Kode_Barang;
    }
    
    public String getTanggal() {
        return this.Tanggal;
    }
    
    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    
    public String getHargaSatuan() {
        return this.Harga_Satuan;
    }
    
    public void setHargaSatuan(String Harga_Satuan) {
        this.Harga_Satuan = Harga_Satuan;
    }
    
    public String getQtyJual() {
        return this.Qty_Jual;
    }
    
    public void setQtyJual(String Qty_Jual) {
        this.Qty_Jual = Qty_Jual;
    }
    
    public String getHargaAkhir() {
        return this.Harga_Akhir;
    }
    
    public void setHargaAkhir(String Harga_Akhir) {
        this.Harga_Akhir = Harga_Akhir;
    }
    
    public String getDiskon() {
        return this.Diskon;
    }
    
    public void setDiskon(String Diskon) {
        this.Diskon = Diskon;
    }
    
    public String getTotalHarga() {
        return this.Total_harga;
    }
    
    public void setTotalHarga(String Total_Harga) {
        this.Total_harga = Total_Harga;
    }
    
    public String getBayar() {
        return this.Bayar;
    }
    
    public void setBayar(String Bayar) {
        this.Bayar = Bayar;
    }
    
    public String getKembalian() {
        return this.Kembalian;
    }
    
    public void setKembalian(String Kembalian) {
        this.Kembalian = Kembalian;
    }
    
    public void Stok() {
        int Stok = 100;
    }
}

public class FormKasir extends javax.swing.JInternalFrame {

    private DefaultTableModel tableModel;
    private void formattabel() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Kode Barang");
        tableModel.addColumn("Nama Barang");
        tableModel.addColumn("Harga Barang");
        tableModel.addColumn("QTY");
        tableModel.addColumn("Total Item");
        jTable2.setModel(tableModel);
        JTableHeader header = jTable2.getTableHeader();
        // Mendapatkan renderer header default dari JTable
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        
        // Mengatur tata letak teks header menjadi terpusat
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    public FormKasir() {
        initComponents();
        formattabel();
        Tampil_Tanggal();
        Tampil_Jam();
        Tampil_Kasir();
    }
    
    public void Tampil_Jam(){
        ActionListener taskPerformer = new ActionListener() {
 
        @Override
            public void actionPerformed(ActionEvent evt) {
            String nol_jam = "", nol_menit = "",nol_detik = "";
 
            java.util.Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            int nilai_detik = dateTime.getSeconds();
 
            if(nilai_jam <= 9) nol_jam= "0";
            if(nilai_menit <= 9) nol_menit= "0";
            if(nilai_detik <= 9) nol_detik= "0";
 
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);
 
            jLabel9_Jam.setText(jam+":"+menit+":"+detik+"");
            }
        };
        new Timer(1000, taskPerformer).start();
    }
    
    public void Tampil_Tanggal() {
        java.util.Date tglsekarang = new java.util.Date();
        SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MMMMMMMMM yyyy", Locale.getDefault());
        String tanggal = smpdtfmt.format(tglsekarang);
        jLabel1_Tanggal.setText(tanggal);
    }
    
    public void Tampil_Kasir() {
        String kasir = "Doni Wahyono";
        jLabel_Kasir.setText(kasir);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHargaSatuan = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        Button_Simpan = new javax.swing.JButton();
        Button_Reset = new javax.swing.JButton();
        Button_InputBaru = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1_Tanggal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_Kasir = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Button_Bayar = new javax.swing.JButton();
        jLabel9_Jam = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(66, 139, 202));
        setClosable(true);
        setMaximizable(true);
        setTitle("Kasir");

        jPanel1.setBackground(new java.awt.Color(243, 244, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga Barang"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Sub Total : Rp");

        txtSubTotal.setEditable(false);

        jLabel13.setText("Diskon : Rp");

        txtDiskon.setEditable(false);

        jLabel14.setText("Total Harga : Rp");

        txtTotalHarga.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtDiskon))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalHarga)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel15.setText("Bayar         : ");

        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBayarKeyPressed(evt);
            }
        });

        jLabel16.setText("Kembalian : ");

        txtKembalian.setEditable(false);

        jPanel5.setBackground(new java.awt.Color(66, 139, 202));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kode Barang");

        txtKodeBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKodeBarangKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(66, 139, 202));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Barang");

        txtNamaBarang.setEditable(false);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Harga Barang");

        txtHargaSatuan.setEditable(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QTY");

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        Button_Simpan.setBackground(new java.awt.Color(0, 204, 0));
        Button_Simpan.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Button_Simpan.setForeground(new java.awt.Color(255, 255, 255));
        Button_Simpan.setText("Simpan Item");
        Button_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SimpanActionPerformed(evt);
            }
        });

        Button_Reset.setBackground(new java.awt.Color(217, 83, 79));
        Button_Reset.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Button_Reset.setForeground(new java.awt.Color(255, 255, 255));
        Button_Reset.setText("Hapus Item");
        Button_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_Simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(Button_Simpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Reset))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        Button_InputBaru.setBackground(new java.awt.Color(66, 139, 202));
        Button_InputBaru.setForeground(new java.awt.Color(255, 255, 255));
        Button_InputBaru.setText("+ Penjualan");
        Button_InputBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_InputBaruActionPerformed(evt);
            }
        });

        jLabel3.setText("Tanggal :");

        jLabel1_Tanggal.setText("jLabel1");

        jLabel4.setText("Kasir      :");

        jLabel_Kasir.setText("jLabel8");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/keranjang-transaksi.png"))); // NOI18N

        Button_Bayar.setBackground(new java.awt.Color(0, 204, 0));
        Button_Bayar.setForeground(new java.awt.Color(255, 255, 255));
        Button_Bayar.setText("Bayar");
        Button_Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BayarActionPerformed(evt);
            }
        });

        jLabel9_Jam.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1_Tanggal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9_Jam))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Kasir))
                            .addComponent(Button_InputBaru))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_Bayar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1_Tanggal)
                            .addComponent(jLabel9_Jam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel_Kasir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_InputBaru))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Bayar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Toko Kelontong Dondon");

        jLabel2.setText("Jl. Semua cinta blok No 1 Bandung");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)))
                .addGap(278, 278, 278))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_InputBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_InputBaruActionPerformed
        // TODO add your handling code here:
        txtKodeBarang.setEnabled(true);
        txtKodeBarang.requestFocus();
        Button_InputBaru.setEnabled(false);
        Button_Bayar.setEnabled(false);
        Button_Simpan.setEnabled(false);
        Button_Reset.setEnabled(false);
    }//GEN-LAST:event_Button_InputBaruActionPerformed

    private void Button_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ResetActionPerformed
        // TODO add your handling code here:
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
            txtSubTotal.setText("");
            txtDiskon.setText("");
            txtTotalHarga.setText("");
            txtBayar.setText("");
            txtKembalian.setText("");
        }
        
        Button_Reset.setEnabled(false);
    }//GEN-LAST:event_Button_ResetActionPerformed

    private void txtKodeBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeBarangKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // membaca inputan dari Keyboard
            
            // Mengecek inputan kosong
            if (txtKodeBarang.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kode Barang Tidak Boleh Kosong", "warning", JOptionPane.WARNING_MESSAGE);
            } else {
                txtKodeBarang.setEnabled(false);
                txtJumlah.setEnabled(true);
                txtJumlah.requestFocus();
                
                // mengecek kode barang
                String tkodeBarang = txtKodeBarang.getText().toUpperCase();
                
                if (tkodeBarang.equals("ATK1")) {
                    txtNamaBarang.setText("Buku Tulis");
                    txtHargaSatuan.setText("5000");
                } else if (tkodeBarang.equals("ATK2")) {
                    txtNamaBarang.setText("Pulpen");
                    txtHargaSatuan.setText("4000");
                } else if (tkodeBarang.equals("ATK3")) {
                    txtNamaBarang.setText("Pensil");
                    txtHargaSatuan.setText("3000");
                } else {
                    JOptionPane.showMessageDialog(null, "Kode Barang Tidak Ada", "warning", JOptionPane.WARNING_MESSAGE);
                    txtKodeBarang.setText("");
                    txtKodeBarang.requestFocus();
                    txtKodeBarang.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_txtKodeBarangKeyPressed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
        Button_Simpan.setEnabled(true);
        Button_Reset.setEnabled(false);
        Button_InputBaru.setEnabled(false);
        txtJumlah.setEnabled(false);
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void Button_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SimpanActionPerformed
        // TODO add your handling code here:
        // ambil data dari form
        Transaksi transaksi = new Transaksi();
        transaksi.setKodeBarang(txtKodeBarang.getText());
        transaksi.setNama(txtNamaBarang.getText());
        transaksi.setHargaSatuan(txtHargaSatuan.getText());
        transaksi.setQtyJual(txtJumlah.getText());
                
        // ambil nilai dari inputan
        double hargaSatuan = Double.parseDouble(txtHargaSatuan.getText());
        int jumlah = Integer.parseInt(txtJumlah.getText());
        
        // hitung total item
        double totalHarga = hargaSatuan * jumlah;
        NumberFormat formatTotalHarga = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String hasilTotalHarga = formatTotalHarga.format(totalHarga);
        txtSubTotal.setText(String.valueOf(hasilTotalHarga));
        transaksi.setTotalHarga(txtSubTotal.getText());

        double totalHargaSemua = hargaSatuan * jumlah;

        // Iterasi setiap baris pada tabel
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            // Ambil nilai harga satuan dan jumlah dari setiap baris
            double hargaSatuanBaris = Double.parseDouble(tableModel.getValueAt(i, 2).toString());
            int jumlahBaris = Integer.parseInt(tableModel.getValueAt(i, 3).toString());

            // Hitung total harga dari setiap baris
            double totalHargaBaris = hargaSatuanBaris * jumlahBaris;

            // Tambahkan total harga dari setiap baris ke total harga semua
            totalHargaSemua += totalHargaBaris;
        }
        
        // hitung sub total
        txtSubTotal.setText(String.valueOf(totalHargaSemua));
        
        // hitung diskon
        if (totalHargaSemua >= 100000) {
            txtDiskon.setText("3000");
        } else if (totalHargaSemua >= 50000) {
            txtDiskon.setText("2000");
        } else if (totalHargaSemua >= 30000) {
            txtDiskon.setText("1000");
        } else {
            txtDiskon.setText("0");
        }
        
        // Ambil nilai dari txtSubTotal dan txtDiskon
        double subTotal = Double.parseDouble(txtSubTotal.getText());
        double diskon = Double.parseDouble(txtDiskon.getText());

        // Hitung total akhir
        double totalAkhir = subTotal - diskon;

        // Tampilkan total akhir
        txtTotalHarga.setText(String.valueOf(totalAkhir));       
        
        // memasukan data ke tabel
        tableModel.addRow(new Object[] {
            transaksi.getKodeBarang(),
            transaksi.getNama(),
            transaksi.getHargaSatuan(),
            transaksi.getQtyJual(),
            transaksi.getTotalHarga()
        });
        
        // mengaktifkan kembali tombol input baru dan tombol bayar
        Button_InputBaru.setEnabled(true);
        Button_Bayar.setEnabled(true);
        Button_Reset.setEnabled(true);
        
        // hapus isi JText
        txtKodeBarang.setText("");
        txtNamaBarang.setText("");
        txtHargaSatuan.setText("");
        txtJumlah.setText("");
        
        // matikan tombol simpan
        Button_Simpan.setEnabled(false);
    }//GEN-LAST:event_Button_SimpanActionPerformed

    private void txtBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarKeyPressed

    private void Button_BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BayarActionPerformed
        // TODO add your handling code here:
        // mengecek kosong
        if (txtBayar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selesaikan Pembayaran", "warning", JOptionPane.WARNING_MESSAGE);
            txtBayar.requestFocus();
            return; // Keluar dari method jika input kosong
        } 

        // Ambil nilai dari JTextField txtBayar
        double totalAkhir = Double.parseDouble(txtTotalHarga.getText());
        double bayar = Double.parseDouble(txtBayar.getText());

        if (bayar <= 0) {
            JOptionPane.showMessageDialog(null, "Minimun Bayar Rp. 1000");
            txtBayar.requestFocus();
            return; // Keluar dari method jika nilai bayar tidak valid
        } 

        if (bayar < totalAkhir) {
            JOptionPane.showMessageDialog(null, "Uang Anda Kurang", "warning", JOptionPane.WARNING_MESSAGE);
            txtBayar.requestFocus();
            return; // Keluar dari method jika uang kurang
        } 

        // Hitung kembalian dan merubah format menjadi rupiah
        double kembalian = bayar - totalAkhir;
        NumberFormat formatKembalian = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String hasilFormatKembalian = formatKembalian.format(kembalian);

        // Tampilkan kembalian di JTextField kembalian
        txtKembalian.setText(String.valueOf(hasilFormatKembalian));

        // menampilkan alert pembayaran
        JOptionPane.showMessageDialog(null, "Pembayaran Sukses", "sukses", JOptionPane.INFORMATION_MESSAGE);

        // Menonaktifkan tombol bayar setelah pembayaran berhasil
        Button_Bayar.setEnabled(false);
        txtBayar.setEnabled(false);
    }//GEN-LAST:event_Button_BayarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Bayar;
    private javax.swing.JButton Button_InputBaru;
    private javax.swing.JButton Button_Reset;
    private javax.swing.JButton Button_Simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel1_Tanggal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9_Jam;
    private javax.swing.JLabel jLabel_Kasir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JFormattedTextField txtHargaSatuan;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
