/*Crear 3 clases (Persona, Profesor, estudiante), que se pueden presentar. El estudiante que curse 9no o superior, puede inscribirse en el curso de programación. En el programa principal, se presentan los 3 objetos, y si el estudiante puede o no hacer el curso de programación.

Los datos miembros necesarios de la clase, son definidos por el programador

La cantidad de métodos de cada clase, son definidos por el programador*/

#include <iostream>
#include <string>

using namespace std;

// Clase Persona
class Persona {
private:
    string nombre;
    int edad;

public:
    Persona(string nombre, int edad) {
        this->nombre = nombre;
        this->edad = edad;
    }

    string getNombre() {
        return nombre;
    }

    int getEdad() {
        return edad;
    }
};

// Clase Estudiante, que hereda de Persona
class Estudiante : public Persona {
private:
    int grado;

public:
    Estudiante(string nombre, int edad, int grado) : Persona(nombre, edad) {
        this->grado = grado;
    }

    int getGrado() {
        return grado;
    }

    bool puedeInscribirse() {
        return grado >= 9;
    }
};

// Clase Profesor, que hereda de Persona
class Profesor : public Persona {
private:
    string materia;

public:
    Profesor(string nombre, int edad, string materia) : Persona(nombre, edad) {
        this->materia = materia;
    }

    string getMateria() {
        return materia;
    }
};

int main() {
    // Crear objetos
    Persona persona("Juan", 35);
    Estudiante estudiante("Maria", 15, 9);
    Profesor profesor("Pedro", 50, "Programacion");

    // Mostrar información
    cout << "Nombre de la persona: " << persona.getNombre() << endl;
    cout << "Edad de la persona: " << persona.getEdad() << endl;
    cout << "Nombre del estudiante: " << estudiante.getNombre() << endl;
    cout << "Edad del estudiante: " << estudiante.getEdad() << endl;
    cout << "Grado del estudiante: " << estudiante.getGrado() << endl;
    cout << "¿Puede inscribirse en programacion? " << (estudiante.puedeInscribirse() ? "Si" : "No") << endl;
    cout << "Nombre del profesor: " << profesor.getNombre() << endl;
    cout << "Edad del profesor: " << profesor.getEdad() << endl;
    cout << "Materia del profesor: " << profesor.getMateria() << endl;

    return 0;
}
