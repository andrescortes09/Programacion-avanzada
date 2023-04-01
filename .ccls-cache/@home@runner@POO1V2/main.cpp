/* Autor: Andrés Cortés
Fecha: 29 de marzo/2023
Crear un programa utilizando 2 clases (una para círculo y otra para triángulo rectángulo), cada una con sus respectivos atributos y los siguientes métodos:
- Para círculo: calculo del área, perímetro y diámetro
- Para triángulo: Perímetro, Hipotenusa y Altura */

#include <iostream>
#include <cmath>

using namespace std;

// Definición de la clase Circulo
class Circulo {
    private:
        float radio; //Su único atributo será el radio
    public: //Se crea el constructor
        Circulo(float r) {
            radio = r;
        }
        float Area() { //Se calcula el área con la fórmula R^2*pi
            return M_PI * radio * radio;
        }
        float Perimetro() { //Se calcula el perímetro con la fórmula 2*pi*radio
            return 2 * M_PI * radio;
        }
        float Diametro() { //Se calcula el diámetro que es el doble del radio
            return 2 * radio;
        }
};

// Definición de la clase TrianguloR
class TrianguloR {
    private:
        float base, altura; //Sus atributos serán base y altura
    public: //Se crea el constructor
        TrianguloR(float b, float h) {
            base = b;
            altura = h;
        }
        float Perimetro() { //Se calcula el perímetro con  la suma de sus lados (base y altura) más el cálculo de su hipotenusa por la teoría de Pitágoras
            return base + altura + sqrt(base*base + altura*altura);
        }
        float Hipotenusa() { //Se calcula la Hipotenusa por el teorema de Pitágoras
            return sqrt(base*base + altura*altura);
        }
        float Altura() { //Se muestra la altura
            return altura;
        }
};

// Función principal
int main() {
    // Creación de un objeto Circulo con radio 5
    Circulo c(10);
    // Impresión de resultados para el círculo
    cout << "Circulo:" << endl;
    cout << "Area: " << c.Area() << endl;
    cout << "Perimetro: " << c.Perimetro() << endl;
    cout << "Diametro: " << c.Diametro() << endl;
    
    // Creación de un objeto TrianguloR con base 3 y altura 4
    TrianguloR t(4, 5);
    // Impresión de resultados para el triángulo rectángulo
    cout << "Triangulo Rectangulo:" << endl;
    cout << "Perimetro: " << t.Perimetro() << endl;
    cout << "Hipotenusa: " << t.Hipotenusa() << endl;
    cout << "Altura: " << t.Altura() << endl;
    
    return 0;
}
