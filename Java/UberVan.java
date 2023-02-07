import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
  Map<String, Map<String, Integer>> typeCarAccepted; 
  ArrayList<String> seatsMaterial;
  Integer passenger;

/*public UberVan(String license, Account driver, Map<String, ArrayList<String, Integer>> typeCarAccepted,
  ArrayList<String> seatsMaterial) {
    super(license, driver);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  } */

public UberVan(String license, Account driver) {
  super(license, driver);
}

public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
  ArrayList<String> seatsMaterial) {
    super(license, driver);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  } 

@Override
public void setPassenger(Integer passenger) {
  if(passenger == 6) {
    this.passenger = passenger;
    } else {
      System.out.println("DEBES TENER 6 PASAJEROS");
    }
  }

  @Override
  void printDataCar() {
    if(passenger == null) {
      System.out.println("LOS PASAJEROS DEBEN SER 6");
    }else {
      System.out.println("Car License: " + getLicense() + "\n"
      + "Driver: " + getDriver().name + "\n" + "Passenger: " + 
       this.passenger + "\n");
    }
  }
}