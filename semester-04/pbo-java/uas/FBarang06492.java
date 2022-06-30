import java.awt.*;
import java.awt.event.*;
// import java.io.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings({ "unused", "deprecated" })
public class FBarang06492 extends JFrame implements ActionListener, MouseListener {
    private JPanel pBrg = new JPanel();
    private JLabel lKode = new JLabel("Kode        "),
            lNama = new JLabel("Nama Barang "),
            lHrgBeli = new JLabel("Harga Beli  "),
            lHrgJual = new JLabel("Harga Jual  "),
            lJumlah = new JLabel("Jumlah      "),
            lcreate = new JLabel("Andreas Marcelino"),
            lTitle = new JLabel("Masukan Data Pegawai");

    private JTextField fKode = new JTextField(),
            fNama = new JTextField(),
            fHrgBeli = new JTextField(),
            fHrgJual = new JTextField(),
            fJumlah = new JTextField();
    private JButton btnAdd = new JButton(),
            btnCari = new JButton(),
            btnKoreksi = new JButton(),
            btnHapus = new JButton(),
            btnSelesai = new JButton();

    private ResultSet rs;
    String[] header = { "Kode", "Nama", "Harga Beli", "Harga Jual", "Jumlah" };
    // Integer[] lebarklm = {30, 85, 42, 42, 42};
    Integer[] lebarklm = { 75, 200, 100, 100, 100 };

    DefaultTableModel tabMode01;
    JTable tabel = new JTable();
    JScrollPane skrTabel = new JScrollPane();

    public FBarang06492() {
        setPreferredSize(new Dimension(800, 500));
        setTitle("Data Barang");

        new BorderLayout();
        JDesktopPane pBrg = new JDesktopPane();
        add(pBrg, BorderLayout.CENTER);

        /* Mengatur letak objek Label Di container */
        lKode.setBounds(20, 55, 100, 25);
        lNama.setBounds(20, 90, 100, 25);
        lHrgBeli.setBounds(380, 55, 100, 25);
        lHrgJual.setBounds(380, 90, 100, 25);
        lJumlah.setBounds(20, 125, 100, 25);

        lTitle.setBounds(20, 15, 300, 25);
        lTitle.setText("Masukan Data Pegawai");
        lTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lcreate.setBounds(490, 425, 300, 25);
        lcreate.setText("Create by Andreas Marcelino | A12.2020.06492");

        /* Mengatur letak objek Text Di Container */
        fKode.setBounds(115, 55, 110, 25);
        fNama.setBounds(115, 90, 235, 25);
        fHrgBeli.setBounds(475, 55, 130, 25);
        fHrgJual.setBounds(475, 90, 130, 25);
        fJumlah.setBounds(115, 125, 110, 25);

        /* Mengatur letak objek Button di Container */
        btnAdd.setBounds(20, 165, 85, 25);
        btnAdd.setLabel("Add");
        btnAdd.setBackground(Color.green);
        btnAdd.setForeground(Color.getHSBColor(0, 0, 0));
        btnCari.setBounds(120, 165, 85, 25);
        btnCari.setLabel("Cari");
        btnKoreksi.setBounds(220, 165, 85, 25);
        btnKoreksi.setLabel("Koreksi");
        btnHapus.setBounds(320, 165, 85, 25);
        btnHapus.setLabel("Hapus");
        btnSelesai.setBounds(665, 385, 85, 25);
        btnSelesai.setLabel("Selesai");
        btnSelesai.setToolTipText("Mengakhiri Program");

        /* Objek Button di Non Aktifkan dan di aktifkan */
        btnAdd.setEnabled(true);
        btnSelesai.setEnabled(true);

        // Mengatur objek untuk dapat berinteraksi
        btnAdd.addActionListener(this);
        btnCari.addActionListener(this);
        btnKoreksi.addActionListener(this);
        btnHapus.addActionListener(this);
        btnSelesai.addActionListener(this);
        tabel.addMouseListener(this);

        tabMode01 = new DefaultTableModel(null, header);
        tabel.setModel(tabMode01);
        tabel.setBackground(Color.orange);

        // getViewport() menampilkan isi tabel
        skrTabel.getViewport().add(tabel);

        tabel.setEnabled(true);
        skrTabel.setBounds(20, 205, 730, 170);

        tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tabel.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabel.getColumnModel().getColumn(1).setPreferredWidth(270);
        tabel.getColumnModel().getColumn(2).setPreferredWidth(141);
        tabel.getColumnModel().getColumn(3).setPreferredWidth(141);

        /* Mengatur Perataan teks di Text */
        fHrgBeli.setHorizontalAlignment(JTextField.LEFT);
        fHrgJual.setHorizontalAlignment(JTextField.LEFT);
        fJumlah.setHorizontalAlignment(JTextField.LEFT);

        // Meletakkan seluruh kontrol pada objek panel */
        pBrg.add(skrTabel);
        pBrg.add(lKode);
        pBrg.add(fKode);
        pBrg.add(lNama);
        pBrg.add(fNama);
        pBrg.add(lHrgBeli);
        pBrg.add(fHrgBeli);
        pBrg.add(lHrgJual);
        pBrg.add(fHrgJual);
        pBrg.add(lJumlah);
        pBrg.add(fJumlah);
        pBrg.add(lcreate);
        pBrg.add(lTitle);
        pBrg.add(btnAdd);
        pBrg.add(btnKoreksi);
        pBrg.add(btnHapus);
        pBrg.add(btnCari);
        pBrg.add(btnSelesai);

        /* Menambahkan objek panel (pBrg) ke container frame */
        getContentPane().add(pBrg).setBackground(Color.getHSBColor(110, 110, 110));

        /* Menampilkan frame ke layar monitor */
        pack();
        setLocationRelativeTo(null);
        tampiltabel();
        setVisible(true);

        Kosong();
        // settombol(1, 0, 0, 0, 1);
        setisian(0, 0, 0, 0, 0);

        // setting setelah di tekan enter kursor dari Kode menuju ke masukan Nama
        fKode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fNama.requestFocus();
            }
        });

        // setting setelah di tekan enter kursor dari Nama menuju ke masukan HrgBeli
        fNama.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fHrgBeli.requestFocus();
            }
        });

        // setting setelah di tekan enter kursor dari HrgBeli menuju ke masukan HrgJual
        fHrgBeli.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fHrgJual.requestFocus();
            }
        });

        // setting setelah di tekan enter kursor dari HrgJual menuju ke masukan Jumlah
        fHrgJual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fJumlah.requestFocus();
            }
        });

        // setting setelah di tekan enter kursor dari Jumlah menuju ke masukan btnAdd
        fJumlah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnAdd.requestFocus();
            }
        });
    }

    public static void main(String[] args) {

        new FBarang06492().setVisible(true);
    }

    /* Fungsi jika user melakukan action penekanan tombol Button */
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();

        if (obj == btnAdd) {

            setisian(1, 1, 1, 1, 1);
            settombol(1, 1, 1, 1, 1);

            if (btnAdd.getText() == "Simpan") {

                String xnip = fKode.getText();
                if (xnip.length() != 0)
                    Add();
                else
                    JOptionPane.showMessageDialog(this, "Kode kosong !");

                btnAdd.setText("Add");
                Kosong();
                tampiltabel();
                // settombol(1, 1, 0, 0, 1);
            } else {
                Kosong();
                // settombol(1, 0, 0, 0, 1);
                btnAdd.setText("Simpan");
                btnAdd.setForeground(Color.getHSBColor(100, 10, 0));
                btnAdd.setBackground(Color.getHSBColor(200, 100, 100));
            }
        }

        if (obj == btnCari) {
            String xcari = JOptionPane.showInputDialog(this, "Masukkan kode !");
            if (xcari != null) {
                fKode.setText(xcari);
                int xx = Cari();
                if (xx == 1)
                    settombol(1, 1, 1, 1, 1);
                setisian(1, 1, 1, 1, 1);

            } else
                JOptionPane.showMessageDialog(this, "Kode kosong !");
        }

        if (obj == btnKoreksi) {
            if (btnKoreksi.getText() == "Simpan") {
                if (fKode.getText() != "")
                    Koreksi();
                btnKoreksi.setText("Koreksi");
                tampiltabel();
                Kosong();
                settombol(1, 1, 0, 0, 1);
            } else {
                btnKoreksi.setText("Simpan");
                settombol(0, 0, 1, 0, 1);
                fNama.requestFocus();
            }
        }

        if (obj == btnHapus) {
            int stt = JOptionPane.showConfirmDialog(this, "Yakin dihapus ?");
            System.out.print(stt);

            if (stt == 0) {
                Hapus();
                tampiltabel();
                Kosong();
            }
        }

        if (obj == btnSelesai) {
            // System.exit(0);
            this.dispose();
        }
    }

    private void tampil() {
        try {
            String vkode = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), 0));
            String vnama = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), 1));

            fKode.setText(vkode);
            fNama.setText(vnama);
            // yg lain silahkan tambahkan................ !
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ada Kesalahan!!!");
        }
    }

    // pendefinisian method dari interface mouselistener..........
    public void mouseClicked(MouseEvent me) {
        try {
            String vkode = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), 0));
            String vnama = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), 1));
            fKode.setText(vkode);
            fNama.setText(vnama);
            // yg lain silahkan tambahkan................ !
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ada Kesalahan !!!");
        }
    }

    public void mouseExited(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    // Fungsi untuk menambahkan data ke tabel barang
    void Add() {
        try {
            settombol(1, 0, 0, 0, 1);
            KoneksiDBMS CnPenjualan = new KoneksiDBMS();
            Connection con = CnPenjualan.BukaCn();
            Statement stat = con.createStatement();

            String strsqlcr = "SELECT * FROM barang WHERE kode ='" + fKode.getText() + "'";
            ResultSet rs = stat.executeQuery(strsqlcr);

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Kode Sudah Ada !");
                return;
            }

            String strsql = "insert into barang(kode, nama, hrgbeli, hrgjual, jumlah) values " +
                    "('" + fKode.getText() + "','" + fNama.getText() + "','" + fHrgBeli.getText() + "','"
                    + fHrgJual.getText() + "','"
                    + fJumlah.getText() + "')";
            int stsproses = stat.executeUpdate(strsql);

            if (stsproses == 1)
                JOptionPane.showMessageDialog(this, "Sukses Di Tambahkan!!!");
            settombol(1, 1, 1, 1, 1);
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Penambahan Gagal!!!");
            System.err.println("Kesalahan perintah SQL : " + e.getMessage());
        }
    }

    // Fungsi untuk mencari Kode_Barang ke tabel barang
    int Cari() {
        int x = 0;
        try {

            KoneksiDBMS CnPenjualan = new KoneksiDBMS();
            Connection con = CnPenjualan.BukaCn();
            Statement stat = con.createStatement();

            String strsql = "SELECT * FROM barang WHERE kode ='" + fKode.getText() + "'";
            ResultSet rs = stat.executeQuery(strsql);

            if (rs.next()) {
                // Jika kode Ditemukan Di Tabel barang

                fKode.setText(rs.getString("kode"));
                fNama.setText(rs.getString("nama"));
                fHrgBeli.setText(rs.getString("hrgbeli"));
                fHrgJual.setText(rs.getString("hrgjual"));
                fJumlah.setText(rs.getString("jumlah"));

                x = 1;
            } else {
                // Jika kode tidak ditemukan
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan !");
                fKode.requestFocus();
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
        }
        return x;
    }

    // Fungsi untuk menambahkan data ke tabel barang
    void Koreksi() {
        try {
            KoneksiDBMS CnPenjualan = new KoneksiDBMS();
            Connection con = CnPenjualan.BukaCn();
            Statement stat = con.createStatement();

            String strsql = "update barang set nama='" + fNama.getText() +
                    "',hrgbeli='" + fHrgBeli.getText() +
                    "',hrgjual='" + fHrgJual.getText() +
                    "',jumlah='" + fJumlah.getText() +
                    "' where kode='" + fKode.getText() + "' ";
            int stsproses = stat.executeUpdate(strsql);

            if (stsproses == 1)
                JOptionPane.showMessageDialog(this, "Sukses Di Edit!");
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Koreksi Gagal !");
            System.err.println("Kesalahan perintah SQL : " + e.getMessage());
        }
    }

    // Fungsi untuk menambahkan data ke tabel barang
    void Hapus() {
        try {
            KoneksiDBMS CnPenjualan = new KoneksiDBMS();
            Connection con = CnPenjualan.BukaCn();
            Statement stat = con.createStatement();

            String strsql = "delete from barang where kode='" + fKode.getText() + "' ";
            int stsproses = stat.executeUpdate(strsql);

            if (stsproses == 1)
                JOptionPane.showMessageDialog(this, "Data Terhapus !");
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Penghapusan Gagal!!!");
            System.err.println("Kesalahan perintah SQL : " + e.getMessage());
        }
    }

    void tampiltabel() {
        try {
            bersihtabel();
            KoneksiDBMS CnPenjualan = new KoneksiDBMS();
            Connection con = CnPenjualan.BukaCn();
            Statement stat = con.createStatement();
            String strsql = "select * from barang";
            ResultSet rs = stat.executeQuery(strsql);
            ResultSetMetaData meta = rs.getMetaData();

            // rs.beforeFirst();
            while (rs.next()) {
                String Kode = rs.getString("kode");
                String Nama = rs.getString("nama");
                String hargaBeli = rs.getString("hrgbeli");
                String hargaJual = rs.getString("hrgjual");
                String Jumlah = rs.getString("jumlah");
                String[] data = { Kode, Nama, hargaBeli, hargaJual, Jumlah };
                tabMode01.addRow(data);
            }
            stat.close();
            rs.close();
            con.close();

        } catch (SQLException se) {
            System.err.println("Kesalahan perintah SQL : " + se.getMessage());
        }
    }

    void bersihtabel() {
        int brs = tabMode01.getRowCount();
        for (int i = 0; i < brs; i++) {
            tabMode01.removeRow(0);
        }
    }

    // Fungsi untuk mengkosongkan Objek masukan
    void Kosong() {
        fKode.setText("");
        fNama.setText("");
        fHrgBeli.setText("");
        fHrgJual.setText("");
        fJumlah.setText("");
        fKode.requestFocus();
    }

    void setisian(int a, int b, int c, int d, int e) {
        fKode.setEnabled(a >= 1 ? true : false);
        fNama.setEnabled(b >= 1 ? true : false);
        fHrgBeli.setEnabled(c >= 1 ? true : false);
        fHrgJual.setEnabled(c >= 1 ? true : false);
        fJumlah.setEnabled(d >= 1 ? true : false);
    }

    void settombol(int a, int b, int c, int d, int e) {
        btnAdd.setEnabled(a >= 1 ? true : false);
        btnCari.setEnabled(b >= 1 ? true : false);
        btnKoreksi.setEnabled(c >= 1 ? true : false);
        btnHapus.setEnabled(d >= 1 ? true : false);
        btnSelesai.setEnabled(e >= 1 ? true : false);
    }
}
