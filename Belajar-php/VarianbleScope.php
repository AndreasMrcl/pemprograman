<?php

$name = "Eko Kurniawan"; //global scope

function sayName()
{
    global $name; //global keyword
    echo $name . PHP_EOL;

    echo $GLOBALS["name"] . PHP_EOL;
}

echo sayName(); 

function increment()
{
    static $counter = 1; //static scope jika tanpa "static" maka akan menjadi local scope
    echo "counter = $counter" . PHP_EOL;
    $counter++;
}

increment();
increment();
increment();