<?php 
session_start();

if(!isset($_SESSION['id'])){
  header("location: login.php");
  exit();
}
?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />
    <title>Biografi</title>
  </head>
  <body>
    <header class=" container text-center">
      <h1>My Website</h1>
    </header>
    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
      <div class="container">
        <a class="navbar-brand" href="#">Biografi</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Help</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container my-4">
      <div class="row align-item-center">
        <div class="col-md-4 text-center">
          <img src="../Web-Program/Images/img-1.jpeg" alt="My photo" class="img-thumbnail" />
        </div>
        <div class="col-md-8 mt-3">
          <table class="table">
            <tbody>
              <tr>
                <th scope="row">NIM</th>
                <td>:</td>
                <td>A12.2020.06492</td>
              </tr>
              <tr>
                <th scope="row">Nama</th>
                <td>:</td>
                <td>Andreas Marcelino Andriawan</td>
              </tr>
              <tr>
                <th scope="row">Alamat</th>
                <td>:</td>
                <td>Graha Pesona Jatisari B1-16</td>
              </tr>
              <tr>
                <th scope="row">Jenis Kelamin</th>
                <td>:</td>
                <td>Laki-laki</td>
              </tr>
              <tr>
                <th scope="row">Tempat, Tanggal Lahir</th>
                <td>:</td>
                <td>Semarang, 27 Maret 2002</td>
              </tr>
              <tr>
                <th scope="row">Asal Sekolah</th>
                <td>:</td>
                <td>SMAN 10 Semarang</td>
              </tr>
              <tr>
                <th scope="row">Email</th>
                <td>:</td>
                <td>112202006492@gmail.com</td>
              </tr>
            </tbody>
          </table>
        </div>
	  <div>
        <a href="logout.php" class="btn btn-primary text-center">Logout</a>
      </div>
    </div>
    <footer class="bg-dark text-center text-light">
      <hr />
      <p>&copy;Pemrograman Web</p>
      <hr />
    </footer>
  </body>
</html>