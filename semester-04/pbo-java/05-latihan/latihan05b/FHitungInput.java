package latihan05b;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("unused")
public class FHitungInput extends JFrame implements ActionListener {
    private JPanel pPgw = new JPanel();
    private JLabel lNilai1 = new JLabel("Nilai 1        "),
            lNilai2 = new JLabel("Nilai 2        "),
            lHasil = new JLabel("Hasil        "),
            lcreate = new JLabel("nama");

    private JTextField fNilai1 = new JTextField(),
            fNilai2 = new JTextField(),
            fHasil = new JTextField();

    private JButton btnTambah = new JButton(),
            btnKurang = new JButton(),
            btnKali = new JButton(),
            btnBagi = new JButton(),
            btnBersih = new JButton(),
            btnSelesai = new JButton();

    public FHitungInput() {
        setPreferredSize(new Dimension(450, 280));
        setTitle("Form Hitung");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane pPgw = new JDesktopPane();

        lNilai1.setBounds(15, 20, 100, 25);
        lNilai2.setBounds(15, 55, 100, 25);
        lHasil.setBounds(15, 90, 100, 25);
        lcreate.setBounds(160, 210, 300, 25);
        lcreate.setText("Created by Andreas Marcelino A12.2020.06492");

        fNilai1.setBounds(115, 20, 125, 25);
        fNilai2.setBounds(115, 55, 125, 25);
        fHasil.setBounds(115, 90, 125, 25);
        fNilai1.setToolTipText("Isi nilai dengan Angka!");

        btnTambah.setBounds(40, 145, 85, 25);
        btnTambah.setText("Tambah");
        btnKurang.setBounds(140, 145, 85, 25);
        btnKurang.setText("Kurang");
        btnKali.setBounds(240, 145, 85, 25);
        btnKali.setText("Kali");
        btnBagi.setBounds(340, 145, 85, 25);
        btnBagi.setText("Bagi");
        btnBersih.setBackground(Color.red);
        btnBersih.setForeground(Color.getHSBColor(50, 0, 55));
        btnBersih.setBounds(40, 185, 85, 25);
        btnBersih.setText("Bersih");
        btnSelesai.setBounds(140, 185, 85, 25);
        btnSelesai.setText("Selesai");
        btnSelesai.setToolTipText("Mengakhiri Program!");

        btnTambah.setEnabled(true);
        btnSelesai.setEnabled(true);

        btnTambah.addActionListener(this);
        btnKurang.addActionListener(this);
        btnKali.addActionListener(this);
        btnBagi.addActionListener(this);
        btnBersih.addActionListener(this);
        btnSelesai.addActionListener(this);

        pPgw.add(lNilai1);
        pPgw.add(fNilai1);
        pPgw.add(lNilai2);
        pPgw.add(fNilai2);
        pPgw.add(lHasil);
        pPgw.add(fHasil);
        pPgw.add(lcreate);
        pPgw.add(btnKurang);
        pPgw.add(btnTambah);
        pPgw.add(btnKali);
        pPgw.add(btnBagi);
        pPgw.add(btnBersih);
        pPgw.add(btnSelesai);

        getContentPane().add(pPgw).setBackground(Color.getHSBColor(250, 0, 255));

        pack();
    }

    public static void main(String[] args) {
        new FHitungInput().setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();

        if (obj == btnTambah) {
            methodTambah();
        }
        if (obj == btnKurang) {
            methodKurang();
        }
        if (obj == btnKali) {
            methodKali();
        }
        if (obj == btnBagi) {
            methodBagi();
        }
        if (obj == btnBersih) {
            kosong();
        }
        if (obj == btnSelesai) {
            System.exit(0);
        }
    }

    void methodTambah() {
        int xhasil = Integer.parseInt(fNilai1.getText()) + Integer.parseInt(fNilai2.getText());
        fHasil.setText(Integer.toString(xhasil));
    }

    void methodKurang() {
        int xhasil = Integer.parseInt(fNilai1.getText()) - Integer.parseInt(fNilai2.getText());
        fHasil.setText(Integer.toString(xhasil));
    }

    void methodKali() {
        int xhasil = Integer.parseInt(fNilai1.getText()) * Integer.parseInt(fNilai2.getText());
        fHasil.setText(Integer.toString(xhasil));
    }

    void methodBagi() {
        int xhasil = Integer.parseInt(fNilai1.getText()) / Integer.parseInt(fNilai2.getText());
        fHasil.setText(Integer.toString(xhasil));
    }

    void kosong() {
        fNilai1.setText("");
        fNilai2.setText("");
        fHasil.setText("");
        fNilai1.requestFocus();
    }
}
