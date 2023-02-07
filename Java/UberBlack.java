
import java.util.Map;
import java.util.List;

class UberBlack extends Car {
  List<String> seatsMaterial;
  Map<String, Map<String, Integer>> typeCarAccepted;

  public UberBlack(String license, Account driver, 
                   Map<String, Map<String, Integer>> typeCarAccepted,
                   List<String> seatsMaterial
                  ) {
    super(license, driver);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }
}