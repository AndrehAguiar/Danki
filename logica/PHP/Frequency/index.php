<?php
	
	$arr = [];

	for($i = 0; $i < 5; $i++){
		$arr[$i] = rand(1, 20);
		
		while(inArrayCustom($i, $arr[$i], $arr)){
			$arr[$i] = rand(1,20);
		}
	}
	print_r($arr);
	function inArrayCustom($indice, $value, $arr){
		for($i = 0; $i < count($arr); $i++){
			if($arr[$i] == $value && $i != $indice){
				echo $value.=" repeated<br>";
				return true;
			}
		}
		return false;
	}
?>