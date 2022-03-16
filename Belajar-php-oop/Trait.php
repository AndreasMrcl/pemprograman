<?php

require_once "data/SayGoodBye.php";

use Data\Traits\{Person, SayHello, SayGoodBye};

$person = new Person();
$person->hello("Andreas");
$person->goodBye(null);

$person->name = "Andreas";
var_dump($person);

$person->run();