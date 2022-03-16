<?php

require_once "data/Person.php";

$andreas = new Person();
$andreas->name = "Andreas";
$andreas->sayHello("Budi");

$eko = new Person();
$eko->name = "Eko";
$eko->sayHello(null);

$andreas->info();
$eko->info();