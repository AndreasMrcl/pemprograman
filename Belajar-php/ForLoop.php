<?php

for ($counter = 1 ; $counter <= 10 ; $counter++) {
    echo "Ini adalah for loop ke-$counter" . PHP_EOL;
}

for ($counter = 10 ; $counter >= 1 ; $counter--) {
    echo "Ini adalah for loop ke-$counter" . PHP_EOL;
}

//Syntax Alternatif For Loop
for ($counter = 1 ; $counter <= 10 ; $counter++) :
    echo "Ini adalah for loop ke-$counter" . PHP_EOL;
endfor;