/* POO ORIENTADO A PROTOTIPOS
function Car(license, driver) {
  this.id;
  this.license = license;
  this.driver = driver;
  this.passenger;
}

Car.prototype.printDataCae = function () {
  console.log(this.driver);
  console.log(this.driver.name);
  console.log(this.driver.document)
} */

// POO NUEVO ESTANDAR ECMASCRIPT 6
class Car {
  constructor(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
  }

  printDataCar() {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
  }
}