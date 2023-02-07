/*POO ORIENTADO A PROTOTIPOS
function Payment() {
  this.id;
} */

// POO NUEVO ESTANDAR ECMASCRIPT 6
class Payment {
  constructor(id) {
    this.id = id;
  }

  printDataId() {
    console.log("EL ID ES: " + this.id);
  }
}