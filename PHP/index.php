<?php
require_once("Car.php");
require_once("UberX.php");
require_once('UberPool.php');
require_once("Account.php");
require_once("Payment.php");
require_once('Card.php');
require_once('User.php');

/* $uberX = new UberX("JILDDF", new Account("Daniel fernando", 111111), "Chevrolet", "SparK GT");
$uberX->printDataCar();

// echo '<br/>';
$uberPool = new UberPool("ESCO234", new Account("CALISTO FERNANDES", 2332233), "Chevrolet", "SparK Emotion");
$uberPool->printDataCar();

// echo '<br/>';
$tarjeteando = new Card(10, 4567444444, 1234, "31/01/2019");
$tarjeteando->printDataId();
$tarjeteando->Datos();  */

$usuario = new User(1000, "SOY Usuario", 101756899, "danieeelodd.@gmail.com", "ert54678");
$usuario->Data();