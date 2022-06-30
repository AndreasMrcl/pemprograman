import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("unused")
public class FJual06492 extends JFrame implements ActionListener, FocusListener {
	private JPanel pBrg = new JPanel();
	private JLabel labelNoTransaksi = new JLabel("No. Transaksi "),
			labelKodeBarang = new JLabel("Kode "),
			labelNamaBarang = new JLabel("Nama"),
			labelHargaBarang = new JLabel("Harga  "),
			labelJumlahBarang = new JLabel("Jumlah "),
			labelTotal = new JLabel("Total  "),
			labelBayar = new JLabel("Bayar  "),
			labelKembalian = new JLabel("Kembali  "),
			lToko1 = new JLabel("Andreas Marcelino"),
			lToko2 = new JLabel("A12.2020.06492");

	private JTextField fieldNoTransaksi = new JTextField(),
			fieldKodeBarang = new JTextField(),
			fieldNamaBarang = new JTextField(),
			fieldHargaBarang = new JTextField(),
			fieldJumlahBarang = new JTextField(),
			fieldTotal = new JTextField(),
			fieldBayar = new JTextField(),
			fieldKembalian = new JTextField();
	private JButton btnJual = new JButton("Jual"),
			btnHapus = new JButton("Hapus"),
			btnCari = new JButton("Cari"),
			btnKeluar = new JButton("Keluar");

	// private ResultSet rs;
	String[] header = { "Kode", "Nama", "Harga", "Jumlah", "Total" };

	DefaultTableModel tabMode01;
	JTable tabel = new JTable();
	JScrollPane skrTabel = new JScrollPane();
	float total = 0, bayar = 0, kembalian = 0;
	int xjumlah = 0;

	public FJual06492() {
		setPreferredSize(new Dimension(580, 600));
		setTitle("Transaksi Penjualan");

		new BorderLayout();
		JDesktopPane desktopPaneBarang = new JDesktopPane();
		add(desktopPaneBarang, BorderLayout.CENTER);

		/* Mengatur letak objek Label Di container */
		lToko1.setBounds(15, 28, 450, 40);
		lToko1.setFont(new Font("Dialog", 1, 36));
		lToko2.setBounds(15, 58, 450, 40);
		lToko2.setFont(new Font("Dialog", 1, 18));
		lToko1.setForeground(Color.BLUE);

		labelNoTransaksi.setBounds(15, 100, 120, 20);
		labelKodeBarang.setBounds(15, 400, 60, 20);
		labelHargaBarang.setBounds(15, 425, 60, 20);
		labelJumlahBarang.setBounds(15, 450, 60, 20);
		labelBayar.setBounds(350, 425, 60, 20);
		labelKembalian.setBounds(350, 450, 60, 20);

		/* Mengatur letak objek Text Di Container */
		fieldNoTransaksi.setBounds(15, 125, 100, 20);
		fieldKodeBarang.setBounds(75, 400, 100, 20);
		fieldNamaBarang.setBounds(180, 400, 205, 20);
		fieldTotal.setBounds(400, 400, 150, 20);
		fieldHargaBarang.setBounds(75, 425, 100, 20);
		fieldBayar.setBounds(400, 425, 150, 20);
		fieldKembalian.setBounds(400, 450, 150, 20);
		fieldJumlahBarang.setBounds(75, 450, 100, 20);

		/* Mengatur letak objek Button di Container */
		btnJual.setBounds(165, 500, 85, 25);
		btnHapus.setBounds(265, 500, 85, 25);
		btnCari.setBounds(365, 500, 85, 25);
		btnKeluar.setBounds(465, 500, 85, 25);

		// membuat tabel
		tabMode01 = new DefaultTableModel(null, header);
		tabel.setModel(tabMode01);
		tabel.setBackground(Color.orange);
		skrTabel.getViewport().add(tabel);
		tabel.setEnabled(true);
		skrTabel.setBounds(15, 160, 540, 220);

		/* Mengatur Perataan teks di Text */
		// fHarga.setHorizontalAlignment(JTextField.LEFT);
		// fJumlah.setHorizontalAlignment(JTextField.LEFT);
		// fBayar.setHorizontalAlignment(JTextField.LEFT);
		// fKembali.setHorizontalAlignment(JTextField.LEFT);
		// fTotal.setHorizontalAlignment(JTextField.LEFT);

		/* Objek Button di Non Aktifkan dan di aktifkan */
		btnJual.setEnabled(true);
		btnHapus.setEnabled(false);
		btnKeluar.setEnabled(true);

		/* Mengatur objek untuk dapat berinteraksi */
		fieldKodeBarang.addFocusListener(this);
		fieldJumlahBarang.addFocusListener(this);
		fieldKembalian.addFocusListener(this);
		btnJual.addActionListener(this);
		btnHapus.addActionListener(this);
		btnCari.addActionListener(this);
		btnKeluar.addActionListener(this);
		// tabel.TampungMouseListener(this);

		// Meletakkan seluruh kontrol pada objek panel */
		desktopPaneBarang.add(skrTabel);
		desktopPaneBarang.add(lToko1);
		desktopPaneBarang.add(lToko2);
		desktopPaneBarang.add(labelNoTransaksi);
		desktopPaneBarang.add(fieldNoTransaksi);
		desktopPaneBarang.add(labelKodeBarang);
		desktopPaneBarang.add(fieldKodeBarang);
		desktopPaneBarang.add(labelNamaBarang);
		desktopPaneBarang.add(fieldNamaBarang);
		desktopPaneBarang.add(labelHargaBarang);
		desktopPaneBarang.add(fieldHargaBarang);
		desktopPaneBarang.add(labelJumlahBarang);
		desktopPaneBarang.add(fieldJumlahBarang);
		desktopPaneBarang.add(labelTotal);
		desktopPaneBarang.add(fieldTotal);
		desktopPaneBarang.add(labelBayar);
		desktopPaneBarang.add(fieldBayar);
		desktopPaneBarang.add(labelKembalian);
		desktopPaneBarang.add(fieldKembalian);
		desktopPaneBarang.add(btnJual);
		desktopPaneBarang.add(btnHapus);
		desktopPaneBarang.add(btnCari);
		desktopPaneBarang.add(btnKeluar);

		/* Menambahkan objek panel (pBrg) ke container frame */
		getContentPane().add(desktopPaneBarang);

		/* Menampilkan frame ke layar monitor */
		pack();
		setLocationRelativeTo(null);

		cariNoTransaksi();
		// tampiltabel();
		setVisible(true);
	}

	public static void main(String[] args) {
		new FJual06492().setVisible(true);
	}

	/* Fungsi untuk memeriksa kursor saat meninggalkan objek txtKode_Barang */
	public void focusGained(FocusEvent fe) {
		if (fieldBayar.getText().equals("")) {
		} else
			Bayar();
	}

	public void focusLost(FocusEvent fe) {
		if (fieldKodeBarang.getText().equals("")) {
		} else {
			Cari();
			fieldJumlahBarang.requestFocus();
		}

		if ((fieldJumlahBarang.getText().equals(""))) {
		} else {
			int stat = CekJumlah();
			if (stat == 1) {
				fieldJumlahBarang.requestFocus();
			}

			else {
				tampiltabel();
				Kosong();
			}
		}
	}

	/* Fungsi jika user melakukan action penekanan tombol Button */
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		if (obj == btnJual) {
			SimpanJual();
			bersihtabel();
			total = 0;
			fieldTotal.setText("");
			Kosong();
			cariNoTransaksi();
		}
		if (obj == btnHapus) {
			bersihtabel();
			Kosong();
		}
		if (obj == btnCari) {
			Cari();
		}
		if (obj == btnKeluar) {
			this.dispose();
		}
	}

	// Fungsi untuk mencari Kode_Barang ke tabel barang
	void cariNoTransaksi() {
		try {
			KoneksiDBMS CnPenjualan = new KoneksiDBMS();
			Connection con = CnPenjualan.BukaCn();
			Statement stat = con.createStatement();

			String sql1 = "SELECT * FROM jual6492";
			ResultSet rs1 = stat.executeQuery(sql1);

			if (rs1.next()) {
				// rs1.last();
				// Jika Kode Barang Ditemukan Di Tabel Barang
				int xno = rs1.getInt("notransaksi");
				fieldNoTransaksi.setText(String.valueOf(xno + 1));
				btnJual.setEnabled(false);
				fieldKodeBarang.requestFocus();
			} else {
				// Jika Kode Barang Tidak ketemu di Tabel Barang ..
				fieldNoTransaksi.setText("21001");
				fieldKodeBarang.setText("");

				fieldKodeBarang.requestFocus();
			}
			rs1.close();
			con.close();
		} catch (SQLException e) {
		}
	}

	// Fungsi untuk mencari data Barang di tabel barang ........
	void Cari() {
		try {
			KoneksiDBMS CnPenjualan = new KoneksiDBMS();
			Connection con = CnPenjualan.BukaCn();
			Statement stat = con.createStatement();

			String sql1 = "SELECT * FROM barang WHERE kode ='" + fieldKodeBarang.getText() + "'";
			ResultSet rs1 = stat.executeQuery(sql1);
			if (rs1.next()) {
				// Jika Kode Barang Ditemukan Di Tabel Barang
				fieldKodeBarang.setText(rs1.getString("kode"));
				fieldNamaBarang.setText(rs1.getString("nama"));
				fieldHargaBarang.setText(rs1.getString("hrgjual"));
				xjumlah = Integer.parseInt(rs1.getString("jumlah"));
				btnJual.setEnabled(false);
				btnHapus.setEnabled(true);
				fieldNamaBarang.requestFocus();

			} else {
				// Jika Kode Barang Tidak ketemu di Tabel Barang ..
				fieldKodeBarang.setText("");

				JOptionPane.showMessageDialog(this, "Kode barang tidak ditemukan !!");
				fieldKodeBarang.requestFocus();
			}
			rs1.close();
			con.close();
		} catch (SQLException e) {
		}
	}

	// Fungsi untuk mencari Kode_Barang ke tabel barang
	int CekJumlah() {
		int x = 0;
		try {

			if (xjumlah < Integer.parseInt(fieldJumlahBarang.getText())) {
				fieldJumlahBarang.setText("");
				JOptionPane.showMessageDialog(this, "Jumlah Barang : " + xjumlah);
				x = 1;
			}
		} catch (Exception e) {
		}
		return x;
	}

	// Simpan Data...........................
	void SimpanJual() {
		try {
			KoneksiDBMS CnPenjualan = new KoneksiDBMS();
			Connection con = CnPenjualan.BukaCn();
			Statement stat = con.createStatement();

			int brs = tabMode01.getRowCount();
			for (int i = 0; i < brs; i++) {
				int vnojual = Integer.parseInt(fieldNoTransaksi.getText());
				String vkode = String.valueOf(tabel.getValueAt(i, 0));
				String vharga = String.valueOf(tabel.getValueAt(i, 2));
				String vjumlah = String.valueOf(tabel.getValueAt(i, 3));

				String strsql = "insert into jual6492(notransaksi, kode, harga, jumlah) " +
						" values ('" + vnojual + "', '" + vkode + "', '" + vharga + "', '" + vjumlah + "')";

				int stsproses = stat.executeUpdate(strsql);

				// update data barang................................
				String strsqlupdate = "update barang set jumlah = jumlah - '" + vjumlah + "' " +
						" where kode = '" + vkode + "'";

				int stsprosesupdate = stat.executeUpdate(strsqlupdate);
			}
			con.close();
		}

		catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Ada Kesalahan !!!");
		}

	}

	// menghitung jumlah total pesanan yang harus dibayar
	void Bayar() {
		try {
			fieldBayar.requestFocus();
			kembalian = Float.parseFloat(fieldBayar.getText()) -
					Float.parseFloat(fieldTotal.getText());
			fieldKembalian.setText(String.valueOf(kembalian));

		} catch (Exception se) {
			System.err.println("Pesan Salah : " + se.getMessage());
		}
	}

	// menampilkan tabel yang sudah diinputkan
	void tampiltabel() {
		try {

			String Kode = fieldKodeBarang.getText();
			String Nama = fieldNamaBarang.getText();
			String Harga = fieldHargaBarang.getText();
			String Jumlah = fieldJumlahBarang.getText();
			String Total = String.valueOf(Float.parseFloat(fieldHargaBarang.getText()) *
					Float.parseFloat(fieldJumlahBarang.getText()));
			String[] data = { Kode, Nama, Harga, Jumlah, Total };
			tabMode01.addRow(data);

			// masukkan ke total........
			total = total + Float.parseFloat(Total);
			fieldTotal.setText(String.valueOf(total));

		} catch (Exception se) {
			System.err.println("Pesan Salah : " + se.getMessage());
		}
	}

	// membersihkan tabel
	void bersihtabel() {
		int brs = tabMode01.getRowCount();
		for (int i = 0; i < brs; i++) {
			tabMode01.removeRow(0);
		}
	}

	// Fungsi untuk mengkosongkan Objek masukan
	void Kosong() {
		fieldKodeBarang.setText("");
		fieldNamaBarang.setText("");
		fieldHargaBarang.setText("");
		fieldJumlahBarang.setText("");
		fieldBayar.setText("");
		fieldKembalian.setText("");

		btnJual.setEnabled(true);
		btnHapus.setEnabled(false);
		fieldKodeBarang.requestFocus();
	}
}
