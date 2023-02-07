
class Main {
  public static void main(String[] args) {

    // creando un contructor dentro de otro constructor
    // para el driver, ya que el es de tipo account, es decir
    // hereda de la clase account.
    Car car1 = new Car("AMD122", new Account("Andres Felipe Obrador", "2334455"));

    // car1.passengenger = 4;
    car1.setPassenger(4);

  /* System.out.println("Car License: " + car1.license +
    // HASH DEL METODO 'TO STRING' POR ENDE APLICO ATRIBUTO A DRIVER.
    "\n" + "Driver: " + car1.driver.name + "\n" + "Passenger: "
    + /*car1.passengenger car1.getPassenger() + "\n"); */
    car1.printDataCar();

    Car car2 = new Car("INT456", new Account("Camila Restrepo Quiroz", "123455"));

    // car2.passengenger = 3;
    car2.setPassenger(4);

    /*System.out.println("Car License: " + car2.license + "\n"
    + "Driver: " + car2.driver.name + "\n" + "Passenger: " + car2.getPassenger()
    /*car2.passengenger + "\n"); */
    car2.printDataCar();

    Car car3 = new Car("I555", new Account("El Tercero Del Paseo", "33333333"));

    // car3.passengenger = 1;
    car3.setPassenger(14);

    car3.printDataCar();

    Card tarjeta = new Card(3, 234567, 4454, "31/01/2019");

    tarjeta.printDataId();
    tarjeta.Datos();

    UberX uberX = new UberX("GGER45", new Account("Camilo", "33432"), "Chevrolet", "REY camaro");
    uberX.setPassenger(4);
    uberX.printDataCar();

    UberVan uberVan = new UberVan("MKDIR345", new Account("Yepez Velez Daniel", "456789"));
    uberVan.setPassenger(6);
    uberVan.printDataCar();
  }
}