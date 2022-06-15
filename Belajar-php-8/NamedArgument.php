<?php

function sayHello(string $first, string $middle="", string $last) {
    echo "Hello $first $middle $last". PHP_EOL;
}

// tanpa named argument
sayHello("Andreas", "Marcelino", "Andriawan");
// sayHello("Andreas", "Andriawan"); akan error 

// dengan named argument
sayHello(middle:"Marcelino", last:"Andriawan", first:"Andreas");
sayHello(first:"Andreas", last:"Andriawan");