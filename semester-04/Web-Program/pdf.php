<?php

require_once __DIR__ . '/vendor/autoload.php';
require 'util/function.php';

$barang = query("SELECT * FROM barang");

$mpdf = new \Mpdf\Mpdf();

$html = '<h1>Daftar Barang</h1>
    <table class="table" border="2" cellpadding="10" cellspacing="0">
        <tbody>
            <tr>
                <th>No</th>
                <th>Kode</th>
                <th>Nama</th>
                <th>Harga</th>
                <th>Gambar</th>
            </tr>';

$i = 1;
foreach ($barang as $row) {
    $html .= '<tr>
                <td>' . $i++ . '</td>
                <td>' . $row["kdbrg"] . '</td>
                <td>' . $row["nmbrg"] . '</td>
                <td>' . $row["hrgbrg"] . '</td>
                <td>
                <img width="100px" src="item/imgs/' . $row["filegbr"] . '" alt="' . $row["filegbr"] . '">
                </td>
            </tr>';
}
$html .= '</table>';

$mpdf->WriteHTML($html);
$mpdf->Output();
