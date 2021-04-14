<?php 

	$array_1 = array(0,1,5,12,62,35,40, "Andre", "Augusto", "Gomes");
	$array_2 = array(3,7,35,20,5,40,4, "Andre", "Aguiar", "Gomes");

	$match = [];

	for($i = 0; $i < count($array_1); $i++){
		for($j = 0; $j < count($array_2); $j++){
			if($array_1[$i] === $array_2[$j]){
				$match[] = $array_1[$i];
			}
		}
	}

	foreach($match as $key=>$value){
		echo $value;
		echo "<br>";
	}

	$match = array_intersect($array_1, $array_2);
	

	foreach($match as $key=>$value){
		echo $value;
		echo "<br>";
	}

?>