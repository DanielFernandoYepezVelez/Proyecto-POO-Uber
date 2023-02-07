/* POO ORIENTADA A PROTOTIPOS (IGUAL)
var car = new Car("AWW233", new Account("Andres Felipe", 12334443));
car.passenger = 4;
car.printDataCar(); */

// POO NUEVO ESTANDAR ECMASCRIPT 6 (IGUAL)
var car = new Car("AWW233", new Account("Andres Felipe", 12334443));
console.log(car.passenger = 4);
car.printDataCar();

var uber = new UberX("RT34333", new Account("Daniel Danielito", 555555), "Mustang", "Camarito");
uber.printDataCar();

var tarjeta = new Card(56, 34567899, 4433, "31/01/2019");
tarjeta.printDataId();
tarjeta.printDatos();

var tajeton = new Paypal(23, "danipez.02@hotmmd.....");
console.log(tajeton.id);
tajeton.printDataId();
console.log(tajeton.email);