<?php

goto a;
echo "Hello Wolrd" . PHP_EOL;

a:
echo "Hello A" . PHP_EOL;

//GoTo pada Loop
$counter = 1;

while (true) {
    echo "Ini adalah Break perulangan ke-$counter" . PHP_EOL;
    $counter++;

    if ($counter >10) {
        goto end;
    }
}

end:
echo "End Loop";