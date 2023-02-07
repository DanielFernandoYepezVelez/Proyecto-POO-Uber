<?php
require_once("Account.php");

class User extends Account {

  public function __construct($id, $name, $document, $email, $password) {
    parent::__construct($id, $name, $document, $email, $password);
  }

  public function Data() {
    echo " Id:".$this->id ." Name:".$this->name ." Document:".$this->document ." Email: ".$this->email ." Password: ".$this->password;
  }
}