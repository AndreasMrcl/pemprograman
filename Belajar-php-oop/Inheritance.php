<?php

require_once "data/Manager.php";

$manager = new Manager ();
$manager->name = "Andreas";
$manager->sayHello("Eko");

$vp = new VicePresident ();
$vp->name = "Andreas";
$vp->sayHello("Marcelino");