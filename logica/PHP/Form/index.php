<?php 
if(isset($_POST['action'])){

 $name = $_POST['name'];
 $number = $_POST['number'];
 $email = $_POST['email'];

 if(strlen($name) >= 5){
 	echo $name.="<br> O nome tem 5 ou mais caracteres<br>";
 }
 if (is_numeric($number)){
 	echo $number.="<br> É um número<br>";
 }
 if(strstr($email, "@") != ""){
	echo $email.="<br> Tem @";	
 	if(strstr($email, "gmail") != ""){
 		echo "E é gmail";
 	}
 }
}?>

<form method="post">
	<input type="text" name="name">
	<input type="number" name="number">
	<input type="email" name="email">
	<button type="submit" name="action">Submit</button>
</form>