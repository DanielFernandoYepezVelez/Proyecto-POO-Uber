class Card extends Payment {
  constructor(id, number, cvv, date) {
    super(id);
    this.number = number;
    this.cvv = cvv;
    this.date = date;
  }

  printDatos() {
    console.log("NUMBER: " + this.number + "\n" +
    "CVV: " + this.cvv + "\n" + "DATE: " + this.date);
  }
}