class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer + " " + self.model + " " + "has started moving")
    def stop(self):
        print(self.manufacturer + " " + self.model + " " + "has stopped moving")

car1 = Car("Vovo", "Cs6", "2022", "AMT", "Blue")
car2 = Car("Kia", "seltos", "2019", "Amt", "Black")
car3 = Car("Mercedes", "Maybach", "2022", "AMT", "silver")

car1.accelerate()
car1.stop()
