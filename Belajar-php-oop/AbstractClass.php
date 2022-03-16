<?php

require_once "data/Location.php";

use Data\{Location, City, Province, Country};

// $location = new Location(); 
// Akan error karena abstract

$city = new City();
$province = new Province();
$country = new Country();