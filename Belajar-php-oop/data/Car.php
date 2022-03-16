<?php

namespace Data;

interface HasBrand
{
    function getBrand();
}

interface IsMaintenance
{
    function isMaintenance();
}

interface Car extends HasBrand
{
    function drive(): void;

    function getTire(): int;
}

class Avanza implements Car, IsMaintenance
{
    public function drive(): void
    {
        echo "Drive Avanza" . PHP_EOL;
    }

    public function getTire(): int
    {
        return 4;   
    }

    public function getBrand()
    {
        return "Toyota";
    }

    public function isMaintenance()
    {
        return false;
    }
}

