-- Masuk ke SQL
-- mysql - u root

-- Database: dbandreas6492
CREATE DATABASE dbandreas6492;
-- Menggunakan database
USE dbandreas6492;

-- --------------------------------------------------------

--
-- Struktur dari tabel barang
--

CREATE TABLE barang (
  kode varchar(30) NOT NULL,
  nama varchar(50) DEFAULT NULL,
  hrgbeli int(12) DEFAULT NULL,
  hrgjual int(12) DEFAULT NULL,
  jumlah int(8) DEFAULT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Struktur dari tabel jual06492
--

CREATE TABLE jual06492 (
  notransaksi int(5) DEFAULT NULL,
  kode varchar(5) DEFAULT NULL,
  harga int(12) DEFAULT NULL,
  jumlah int(8) DEFAULT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Struktur dari tabel pegawai
--

CREATE TABLE pegawai (
  nip varchar(30) NOT NULL,
  nama varchar(50) NOT NULL,
  bagian varchar(30) NOT NULL,
  jeniskelamin varchar(15) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB;

--
-- Dumping data untuk tabel pegawai
--

INSERT INTO pegawai 
  (`nip`, `nama`, `bagian`, `jeniskelamin`, `password`) 
VALUES
  ('11111', 'andreas', 'administrasi', 'pria', '123');
COMMIT;
