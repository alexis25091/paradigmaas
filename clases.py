import math
#inicio con las del hexagono
class Hexagono:
    def __init__(self, color, lado):
        self._color = color
        self._lado = lado

    def get_color(self):
        return self._color

    def get_area(self):
        return self.calcular_area()

    def get_perimetro(self):
        return self.calcular_perimetro()

    def calcular_area(self):
        return 3 * math.sqrt(3) * self._lado ** 2 / 2

    def calcular_perimetro(self):
        return 6 * self._lado

#a partir de aqui las del rombo

class Rombo:
    def __init__(self, color, diagonal_mayor, diagonal_menor):
        self._color = color
        self._diagonal_mayor = diagonal_mayor
        self._diagonal_menor = diagonal_menor

    def get_color(self):
        return self._color

    def get_area(self):
        return self.calcular_area()

    def get_perimetro(self):
        return self.calcular_perimetro()

    def calcular_area(self):
        return (self._diagonal_mayor * self._diagonal_menor) / 2

    def calcular_perimetro(self):
        return 4 * math.sqrt((self._diagonal_mayor / 2) ** 2 + (self._diagonal_menor / 2) ** 2)

#a partir de aqui las del trapecio

class Trapecio:
    def __init__(self, color, base_mayor, base_menor, altura):
        self._color = color
        self._base_mayor = base_mayor
        self._base_menor = base_menor
        self._altura = altura

    def get_color(self):
        return self._color

    def get_area(self):
        return self.calcular_area()

    def get_perimetro(self):
        return self.calcular_perimetro()

    def calcular_area(self):
        return ((self._base_mayor + self._base_menor) * self._altura) / 2

    def calcular_perimetro(self):
        lado1 = math.sqrt((self._altura ** 2) + ((self._base_mayor - self._base_menor) / 2) ** 2)
        lado2 = math.sqrt((self._altura ** 2) + ((self._base_mayor + self._base_menor) / 2) ** 2)
        return self._base_mayor + self._base_menor + lado1 + lado2
