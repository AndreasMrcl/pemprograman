<?php

class SocialMedia
{
    public string $name;
}

final class Facebook extends SocialMedia
{
    final public function login(string $username, string $password): bool
    {
        return true;
    }
}

// class dibawah akan error karena class Facebook adalah final class
// function login juga tidak bisa dioverride karena final function
// class FakeFacebook extends Facebook
// {
//    public function login(string $username, string $password): bool
//    {
//        return false;
//    }
// }