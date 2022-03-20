<?php

$array = [
    "firstName" => "Andreas",
    "middleName" => "Marcelino",
    "lastName" => "Andriawan"
];

$object = (object) $array;

var_dump($object);

echo "First Name $object->firstName" . PHP_EOL;
echo "Middle Name $object->middleName" . PHP_EOL;
echo "Last Name $object->lastName" . PHP_EOL;

$arrayLagi = (array) $object;

var_dump($arrayLagi);

require_once "data/Person2.php";

$person = new Person2("Andreas", "Semarang");
var_dump($person);

$arrayPerson = (array) $person;
var_dump($arrayPerson);