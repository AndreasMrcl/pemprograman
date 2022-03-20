<?php

class Data
{
    var string $first = "First";
    public string $second = "Second";
    private string $third = "third";
    protected string $fourth = "fourth";
}

$data = new Data();

foreach ($data as $property => $value){
    echo "$property : $value" . PHP_EOL;
}