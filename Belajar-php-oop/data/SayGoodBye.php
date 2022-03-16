<?php

namespace Data\Traits;

trait SayGoodBye
{
    public function goodBye(?string $name): void
    {
        if(is_null($name))
        {
            echo "Good Bye" . PHP_EOL;
        }else
        {
            echo "Good Bye $name" . PHP_EOL;
        }
    }
}

trait SayHello
{
    public function hello(?string $name): void
    {
        if(is_null($name))
        {
            echo "Hello" . PHP_EOL;
        }else
        {
            echo "Hello $name" . PHP_EOL;
        }
    }
}

trait HasNamme
{
    public string $name;
}

trait CanRun
{
    public abstract function run(): void;
}

class ParentPerson
{
    public function goodBye(?string $name): void
    {
       echo "Good Bye in Person" . PHP_EOL;
    }

    public function hello(?string $name): void
    {
       echo "Hello in Person" . PHP_EOL;
    }
}

trait All
{
    use SayGoodBye, SayHello, HasNamme, CanRun
    {
        // bisa meng-override visibility
        // goodBye as private;
        // hello as private;
    }
}

class Person extends ParentPerson
{
    use All;
    
    public function run(): void
    {
        echo "Person $this->name is running" . PHP_EOL;
    }

    // function yang ada di class parent akan ter-override oleh function yang ada di trait
    // function dibawah ini akan meng-override fucntion yang ada di trait
    // public function goodBye(?string $name): void
    // {
    //    echo "Good Bye in Person" . PHP_EOL;
    // }

    // public function hello(?string $name): void
    // {
    //    echo "Hello in Person" . PHP_EOL;
    // }
}