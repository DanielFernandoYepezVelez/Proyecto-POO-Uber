
class Car {
  private Integer id;
  private String license;
  private Account driver; //DRIVER ES DE TIPO ACCOUNT (OJO!!!).
  private Integer passenger;

  // CONSTRUCTOR DE CAR
  public Car(String license, Account driver) {
    this.license = license;
    this.driver = driver;
  }

  // METODO GETTER
  public Integer getPassenger() {
    return passenger;
  }

  //METODO SETTER
  public void setPassenger(Integer passenger) {
    if(passenger == 4) {
      this.passenger = passenger;
    } else {
      System.out.println("DEBES TENER 4 PASAJEROS");
    }
  }

  void printDataCar() {
    if(this.passenger == null) {
      System.out.println("LOS PASAJEROS DEBEN SER 4");
    }else {
      System.out.println("Car License: " + license + "\n"
      + "Driver: " + driver.name + "\n" + "Passenger: " + 
      passenger + "\n");
    }
  }

  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return the license
   */
  public String getLicense() {
    return license;
  }

  /**
   * @param license the license to set
   */
  public void setLicense(String license) {
    this.license = license;
  }

  /**
   * @return the driver
   */
  public Account getDriver() {
    return driver;
  }

  /**
   * @param driver the driver to set
   */
  public void setDriver(Account driver) {
    this.driver = driver;
  }
}