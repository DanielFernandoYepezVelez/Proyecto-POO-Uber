from car import Car
from account import Account
from uberX import UberX
from uberPool import UberPool
from uberBlack import UberBlack

if __name__ == "__main__":
  #print("Hola Mundo De Nuevo")

  car1 = Car("ADF345", Account("Camilo Andres", "555555"))
  print(vars(car1))
  print(vars(car1.driver))

  car2 = Car("JJJ234", Account("Daniel Camilo", "33333333"))
  car2.passengenger = 10
  print(vars(car2))
  print(vars(car2.driver))

  uber = UberX("ABCD", Account("Hernan Martinez", "9999999"), "Chevrolet", "Camaro Plateado")
  print(vars(uber), vars(uber.driver))