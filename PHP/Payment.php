<?php

class Payment {
  public $id;

  public function __construct($id) {
    $this->id = $id;
  }

  public function printDataId() {
    echo " EL ID ES:".$this->id;
  }
}