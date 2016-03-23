<?php

$db = new PDO(mysqli_connect("mysql:host=localhost;dbname=users","root","root"));
$results["error"] = false;
$results["message"] = [];

if(isset($_POST)){
	if(!empty($_POST['ID']) &&!empty($_POST['Nom']) && !empty($_POST['Prenom']) && !empty($_POST['Age']) && !empty($_POST['Ville']) && !empty($_POST['Mail']) && !empty($_POST['Sexe']) && !empty($_POST['Password'])){

	$id = $_POST["ID"];
	$Name = $_POST["Nom"];
	$Username = $_POST["Prénom"];
	$Age = $_POST["Age"];
	$Ville = $_POST["Ville"];
	$Mail = $_POST["Mail"];
	$Sexe = $_POST["Sexe"];
	$Password = $_POST["Password"];

	if(strlen($Name) < 2 || !preg_match("/^[a-zA-Z]+$/", $Name) || strlen($Name) > 30){
		$results['error'] = true;
		$results['message']['Nom'] = "Nom invalide";
	}else{
		//vérifiez que le nom n'existe pas
	}

	if(!filter_var($Mail, FILTER_VALIDATE_EMAIL)){
		$results["error"] = true;
		$results['message']['Mail'] = "Mail Invalide"
	}else{
		//Verifiez que le mail n'existe pas 
	}

	if($results["error"] === false){
		$sql = $db->prepare("INSERT INTO users(ID, Nom, Prénom, Age, Ville, Mail, Sexe, Password") VALUES(":id",":Name",":Userame",":Age",":Ville",":Mail",":Sexe",":Password");
	}
	}else{
		$results["error"] = true;
		$results["message"] = "Veuillez remplir tous les champs";
	}
}