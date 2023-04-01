/* Hacer un programa que calcule el área, perímetro y diámetro de un círculo; y perímetro, hipotenusa y altura de un triángulo rectangulo*/
#include <iostream>
#include <cmath>

using namespace std;

// Definición de la clase Circle
class Circle {
    private:
        float radius;
    public:
        Circle(float r) {
            radius = r;
        }
        float getArea() {
            return M_PI * radius * radius;
        }
        float getPerimeter() {
            return 2 * M_PI * radius;
        }
        float getDiameter() {
            return 2 * radius;
        }
};

// Definición de la clase RightTriangle
class RightTriangle {
    private:
        float base, height;
    public:
        RightTriangle(float b, float h) {
            base = b;
            height = h;
        }
        float getPerimeter() {
            return base + height + sqrt(base*base + height*height);
        }
        float getHypotenuse() {
            return sqrt(base*base + height*height);
        }
        float getHeight() {
            return height;
        }
};

// Función principal
int main() {
    // Creación de un objeto Circle con radio 5
    Circle c(5);
    // Impresión de resultados para el círculo
    cout << "Circle:" << endl;
    cout << "Area: " << c.getArea() << endl;
    cout << "Perimeter: " << c.getPerimeter() << endl;
    cout << "Diameter: " << c.getDiameter() << endl;
    
    // Creación de un objeto RightTriangle con base 3 y altura 4
    RightTriangle t(3, 4);
    // Impresión de resultados para el triángulo rectángulo
    cout << "Right Triangle:" << endl;
    cout << "Perimeter: " << t.getPerimeter() << endl;
    cout << "Hypotenuse: " << t.getHypotenuse() << endl;
    cout << "Height: " << t.getHeight() << endl;
    
    return 0;
}
