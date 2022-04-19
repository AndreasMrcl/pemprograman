<?php

use Data\CatShelter;

require_once "data/Animal.php";
require_once "data/AnimalShelter.php";

$catShelter = new \Data\CatShelter();
$cat = $catShelter->adopt("Sagan");
$cat->eat(new \data\AnimalFood());

$dogShelter = new \Data\DogShelter();
$dog = $dogShelter->adopt("Lycan");
$dog->eat(new \data\Food());