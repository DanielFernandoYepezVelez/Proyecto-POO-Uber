from account import Account
"""LO DIFERENTE ES QUE CAMBIAMOS EL TIPO DE DATO DRIVER,
AHORA ES DE TIPO ACCOUNT, Y COMO VES ESTA SOLICITANDO
LOS DOS DATOS OBLIGATORIOS PARA INSTANCIAR UN OBJETO DE
ESTE TIPO"""
class Car:
  id            = int
  license       = str 
  driver        = Account("","")
  passengenger  = int

  def __init__(self, license, driver):
    self.license = license
    self.driver = driver