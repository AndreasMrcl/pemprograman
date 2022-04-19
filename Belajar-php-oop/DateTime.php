<?php

$dateTime = new DateTime();
$dateTime->setDate(1999, 03, 27);
$dateTime->setTime(12, 12, 12, 00);

$dateTime->add(new DateInterval("P3Y"));

$minusOneMonth = new DateInterval("P1M");
$minusOneMonth->invert = true;
$dateTime->add($minusOneMonth);

var_dump($dateTime);

$now = new DateTime();
var_dump($now);

$now->setTimezone(new DateTimeZone("Europe/Berlin"));
var_dump($now);

// https://www.php.net/manual/en/datetime.format.php
$string = $now->format("Y-m-d H:i:s");
echo "Waktu saat ini : $string" . PHP_EOL;

$date = DateTime::createFromFormat("Y-m-d H:i:s", "2022-12-12 10:10:10", new DateTimeZone("Asia/Jakarta"));
if ($date) {
    var_dump($date);
} else {
    echo "Foramt Salah" . PHP_EOL;
}