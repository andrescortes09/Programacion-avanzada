// Crear un programa con un menú que tenga las siguientes opciones:
// - Salir del programa
// - Crear un arreglo (con número aleatorios del 0 al 20), preguntar el tamaño, que de el npumero más alto y el tamaño
// - Mostrar un histograma con los datos y posiciones del vector

#include <cstdlib>
#include <iostream>

using namespace std;

//Se crea la estructura de datos
struct resultados{
  int max_valor;
  int size_array;
  int *int_array;
};

//Función para rellenar
resultados generarArrayAleatorio();
//Función principal
int main(){ 
//declaración de variables
resultados valores_principal; //valores a pasar entre func.
int op, i, j, a;
bool flag = true;

// Binevenida y Menú
  cout << "************************" << endl;
  cout << "****** BIENVENIDO ******" << endl;
  cout << "************************" << endl;
  cout << endl;
  cout << "********* MENÚ *********" << endl;
  cout << "Digite 0: Si desea salir del programa" << endl;
  cout << "Digite 1: Si desea crear un vector aleatorio" << endl;
  cout << "Digite 2: Si desea imprimir la matriz histograma" << endl;
//cuerpo del programa
 while(flag){
  cin >> op;
  switch(op){
    case 0:
      cout << "Salió del programa" << endl;
      return 0;
    break;
    case 1:
      valores_principal = generarArrayAleatorio(); //Se ejecuta la función
      valores_principal.max_valor = valores_principal.int_array[0]; //Se recorre desde la posición 0
      for(i = 0; i < valores_principal.size_array; i++){ //Se halla el máximo
        if(valores_principal.max_valor < valores_principal.int_array[i]){
          valores_principal.max_valor = valores_principal.int_array[i];
        }
      }
      cout << "\nMax: " << valores_principal.max_valor << endl; //máximo
      cout << "Size: " << valores_principal.size_array << endl; //tamaño
     break;
    case 2:
      cout << "No \tDato \t \t Histograma\n";
          for(i = 0; i < valores_principal.size_array;           i++){
                cout << i; //posición
                cout << "\t";
                cout << valores_principal.int_array[i] <<" \t"; //Valor
                cout << " \t";
            for(a = 1; a <= valores_principal.int_array[i]; a++){
              cout << "*"; //histograma
            }
                cout << endl;
            }
     break;
    //Opción de reserva en caso de entrada de datos errónea
    default:
    cout <<"Ingrese opcion valida"<<endl;
    break;
    }
  }
  return 0;
 }


resultados generarArrayAleatorio(){ //función que recibe el tamaño del vector y lo crea con números aleatorios
    resultados res;
  cout << "Ingrese el tamaño del vector: ";
  cin >> res.size_array;
  res.int_array = new int [res.size_array];
  for (int i = 0; i<res.size_array; i++){
    *(res.int_array+i) = (rand() % 21);
    cout << *(res.int_array+i) << " ";
  }
  return res;
  
}
