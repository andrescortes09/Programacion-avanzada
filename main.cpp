#include <cstdlib>
#include <iostream>
#include <fstream>

using namespace std;

struct empleado{
  long int codigo;
  string nombres;
  string apellidos;
  long int celular;
};



void menu ();
empleado registrar ();
empleado agregar ();

int main () {
  int op;
  bool flag = true;
  menu ();
  while(flag){
    cin >> op;
  switch(op){
    case 0:
      cout << "Salió del programa" << endl;
      return 0;
    break;
    case 1:
      cout << "REGISTRO DE EMPLEADO" << endl;
      registrar ();
      return 0;
    break;
    case 2:
      cout << "AGREGAR NUEVO EMPLEADO" << endl;
      agregar ();
      return 0;
    break;
    default:
      cout <<"Ingrese opcion valida"<<endl;
    break;
    }
    }
  return 0;
}

void menu (){
  //empleado emp;
  cout << "****************************************************************" << endl;
  cout << "****** SISTEMA DE REGISTRO DE EMPLEADOS  MINOSAURIOS TECH ******" << endl;
  cout << "****************************************************************" << endl;
  cout << endl;
  cout << "********* MENÚ *********" << endl;
  cout << endl;
  cout << "Digite 0: Si desea salir del programa" << endl;
  cout << "Digite 1: Si desea registrar un empleado" << endl;
  cout << "Digite 2: Si desea agregar un nuevo empleado" << endl;
  cout << "Digite 3: Si desea mostrar los empleados registrados" << endl;
  cout << "Digite 4: Si desea cambiar el número de celular empleado" << endl;
  cout << "Digite 5: Si desea despedir un empleado" << endl;
  cout << "Digite 6: Si desea mostrar los empleados que han sido despedidos" << endl;
 // return emp;
}

empleado registrar(){
    int a, i;
    cout << "Cuántos empleados desea agregar: ";
    cin >> a;
    cout << a <<endl;
  empleado miEmpleado;
 
  ofstream archivoEmpleados("empleados.bin",ios::binary);
   
    archivoEmpleados.open("empleados.bin",ios::binary);
    if(false==archivoEmpleados.is_open())
    {
      cout<<"Error en el archivo";
      }
 
 
      for (i = 0; i < a ; i++)
      {
       
            fflush(stdin);
 
        cout << "Ingrese nombre(s) del empleado: ";
        getline(cin, miEmpleado.nombres);

        cout << "\nIngrese apellidos del empleado: ";
        getline(cin, miEmpleado.apellidos);
 
        cout << "Ingrese número celular del empleado: ";
        cin >> miEmpleado.celular;
       
        cout << "Ingrese código numérico del empleado "<<i+1<<": ";
        cin >> miEmpleado.codigo;

   
            archivoEmpleados.write((char*)&miEmpleado,sizeof(empleado));
   
       
        fflush(stdin);
   
      }
     archivoEmpleados.close();
    //delete miEmpleado;

}

empleado agregar(){
 
}