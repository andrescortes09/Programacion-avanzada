/************************************************************************
* Fecha: 15/02/23
* Autor: Andrés Cortés
* Temas: Arrays, clase vector, aleatoriedad, funciones
*
* Problema:
*     Crear una forma para generar un conjunto de números aleatorios,
      tal que, se pueda contar la frecuencia y poder graficar tipo
      histograma.
*     Se recomienda usar funciones, array y la Clase Vector de STL.
*     Para generar el conjunto de aletorios se deberá preguntar
*     La cantidad de elementos al usuario
*     Se recomienda también hacer un menú
************************************************************************/

#include <ctime>
#include <iostream>
#include <vector>
using namespace std;

struct valores {
  int max_arry;
  int size_array;
  int *puntero_array;
};
// Se hace función para generar array aleatorio
valores genrar_array_aleatorio(){
    //Declaración variables
    valores valor_funcion;
    valor_funcion.array_aleatorio=0;
    valor_funcion.array_aleatorio=0;
}

// Se hace función para generar histograma
int main() {
  // Declaración de variables
  int i, j, k;
  int size_conjunto;
  int array_conjunto_aleatorio[] = {};
  bool bandera = true;

  // Menú presentación de opciones al usuario
  while (bandera) {
    cout << "****************************" << endl;
    cout << "****** Menú principal ******" << endl;
    cout << "****************************" << endl;
    cout << "Seleccione opción: " << endl;
    cout << "0: Generar conjunto de valores aleatorios" << endl;
    cout << "1: Generar histograma del conjunto de valores aleatorios" << endl;
    cout << "2: Salir de la aplicación" << endl;
    cin >> k;
    switch (k) {
    case 0:
      valor_funcion.max_array=0;
      cout << "Ingrese el tamaño para generar el conjunto aleatorio: ";
      cin >> valor_funcion.size_array;
      //Se crea el array del tamaño valor_funcion.size_array
      int *array_v = new int[valor_funcion.size_array];
      //Se crea y se presenta el conjunto de aleatorios
      strand(time(0)); //Semilla para aleatoriedad
      for(int i=0; i <valor_funcion.size_array; i++){
        *(array_v+i) = (rand()%20);
        cout
      }
    }
  }
  return 0;
}