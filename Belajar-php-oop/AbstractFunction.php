<?php

require_once "data/Animal.php";

use Data\{Animal, Cat, Dog};

$cat = new Cat();
$cat->name = "Sagan";
$cat->run();

$dog = new Dog();
$dog->name = "Lycan";
$dog->run();