<?php 
	
	$array = array("Andre","Gomes","Aguiar","Andre","Andre","Gomes","Andre","Aguiar","Gomes","Augusto","Aguiar","Gomes","Andre","Gomes","Augusto");
	$repeated = array();

	for($i=0; $i < count($array); $i++){
		$currentValue = $array[$i];

		if(!isset($repeated[$currentValue])){
			$repeated[$currentValue] = 0;

		}else{
			$repeated[$currentValue]++;
		}
	}

	foreach($repeated as $key => $value){
		echo $key;
		echo $value;
		echo "<br>";
	}
?>