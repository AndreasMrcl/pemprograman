<?php

function sayHello($name) 
{
    echo "Hello $name" . PHP_EOL;
}

sayHello("Eko");
sayHello("Budi");

function sum(int $first, int $last)
{
    $total = $first + $last;
    echo "Total $first + $last = $total" . PHP_EOL;
}

sum(100, 100);
sum("100", "100");
sum(True, False);

function sumAll(...$values)
{
    $total = 0;
    foreach ($values as $value)
    {
        $total += $value;
    }
    echo "Total " . implode(",", $values) . "= $total" . PHP_EOL;
}

$values = [1,2,3,4,5];

sumAll(1, 2, 3, 4, 5);
sumAll(...$values);