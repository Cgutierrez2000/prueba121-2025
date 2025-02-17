import math

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def set_x(self, x):
        self.x = x

    def set_y(self, y):
        self.y = y

    # Método para obtener el radio (r)
    def get_radio(self):
        return math.sqrt(self.x ** 2 + self.y ** 2)

    # Método para obtener el ángulo θ en radianes
    def get_angulo(self):
        return math.atan2(self.y, self.x)

    # Método para convertir de coordenadas polares a cartesianas
    def set_coordenadas_polares(self, r, theta):
        self.x = r * math.cos(theta)
        self.y = r * math.sin(theta)

    def mostrar(self):
        print(f"Cartesianas: ({self.x}, {self.y})")
        print(f"Polares: (r = {self.get_radio()}, θ = {math.degrees(self.get_angulo())}°)")

if __name__ == "__main__":
    p1 = Punto(3, 4)
    p1.mostrar()

    p2 = Punto(0, 0)
    p2.set_coordenadas_polares(5, math.radians(53.13)) # 53.13° en radianes
    p2.mostrar()
