class Account {
  Integer id;
  String name;
  String document;
  String email;
  String password;

  // CONSTRUCTOR DE LA CLASE ACCOUNT (QUE LE DA VIDA AL 
  // OBJETO DE TIPO DRIVER). POR QUE EN EL DIGRAMA
  // DE CLASES DRIVER HEREDA DE ACCOUNT.
  public Account(String name, String document) {
    this.name = name;
    this.document = document;
  }
}