<?php

class Person
{
    const AUTHOR = "Andreas Marcelino Andriawan";

    var string $name;
    var ?string $address = null;
    var string $country = "Unknown";

    function sayHello(?string $name)
    {
        if(is_null($name))
        {
            echo "Hi, my name is $this->name" . PHP_EOL;
        }else{
            echo "Hello $name, my name is $this->name" . PHP_EOL;
        }
    }

    function info()
    {
        echo "author : " . self::AUTHOR . PHP_EOL;
    }

}

//Jika ingin type datanya bisa null maka harus di tambah tanda ? sebelum type declaration