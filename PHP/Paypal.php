<?php
require_once('Payment.php');

class Paypal extends Pyments {
  public $email;

  public function __construct($id, $email) {
    parent::__construct($id);
    $this->email = $email;
  }
}