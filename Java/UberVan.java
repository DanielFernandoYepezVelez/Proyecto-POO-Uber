
import java.util.Map;
import java.util.List;

class UberVan extends Car {
  Integer passenger;
  List<String> seatsMaterial;
  Map<String, Map<String, Integer>> typeCarAccepted; 

public UberVan(String license, Account driver) {
  super(license, driver);
}

public UberVan(String license, Account driver, 
               Map<String, Map<String, Integer>> typeCarAccepted,
               List<String> seatsMaterial
              ) {
    super(license, driver);
    this.seatsMaterial = seatsMaterial;
    this.typeCarAccepted = typeCarAccepted;
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