<?php 
	$bdd = mysqli_connect("localhost", "root", "root", "mobilite");

	$id = $_POST["ID"];
	$nom = $_POST["Nom"];
	$prenom = $_POST["Prénom"];
	$age = $_POST["Age"];
	$ville = $_POST["Ville"];
	$photo = $_POST["Photo"];
	$sexe = $_POST["Sexe"];


	$statement = mysqli_prepare($con, "INSERT INTO users (ID, Nom, Prénom, Age, Ville, Photo, Sexe) VALUES (?, ?, ?, ?, ?, ?, ? ) ");

	mysqli_stmt_bind_param($statement, "siss", $id, $nom, $prenom, $age, $ville, $photo, $sexe);
	mysqli_stmt_execute($statement);

	mysqli_close($bdd);

?>