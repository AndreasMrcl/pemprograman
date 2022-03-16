<?php

require_once "data/Programmer.php";

$company = new Company();
$company->programmer = new Programmer("Andreas");
var_dump($company);

$company->programmer = new BackendProgrammer("Andreas");
var_dump($company);

$company->programmer = new FrontendProgrammer("Andreas");
var_dump($company);

sayHelloProgrammer(new Programmer("Andreas"));
sayHelloProgrammer(new BackendProgrammer("Andreas"));
sayHelloProgrammer(new FrontendProgrammer("Andreas"));