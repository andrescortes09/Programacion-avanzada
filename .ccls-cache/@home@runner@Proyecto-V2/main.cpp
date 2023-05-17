/************************************************************************************************************************
Fecha: 15/03/2023
Autores: Daniel Alejandro Suarez, Juan Esteban Rincón y Andrés Felipe Cortés

Crear un programa para el registro de empleados de la empresa MINOSAURIOS TECH
que cumpla con:
1. Una función de registro de empleados que guarde: código, nombres, apellidos y celular de cada empleado; guardandolo
en un archivo binario de nombre Empleados.bin
2. Una función que agregue un empleado verificando por el código si ya existe
3. Una función que muestre el registro de empleados
4. Una función que permita cambiar el numero de celular de un empleado pidiendo su respectivo código
5. Una función que despida a un empleado, lo envíe a un vector de empleados despedidos y genere una Carta de despido
con su nombre (en un archivo de texto)
6. Una función que muestre los empleados que han sido despedidos

*************************************************************************************************************************/

#include <iostream>
#include <fstream>
#include <cstring>
#include <string>
#include <vector>
#include <algorithm>


using namespace std;

struct Empleado { //Estructura para almacenar los datos de cada empleado: código, nombre, apellidos, celular
	int codigo;
	string nombres;
	string apellidos;
	string celular;
};

void guardarbin(vector<Empleado>& empleados) { //Esta función me permite guardar los datos en el archivo binario

	const char* nombreArchivo = "Empleados.bin"; //Nombre archivo //Crear archivo
	ofstream archivo(nombreArchivo, ios::trunc| ios::binary);


	if (archivo.is_open()) {
		// Escribir los datos de los empleados en el archivo binario
		for (auto& empleado : empleados) {
			archivo.write((char*)&empleado, sizeof(Empleado));
		}
		cout << "Datos de los empleados escritos en el archivo binario." << endl;
	}
	else {
		cout << "Error al abrir el archivo binario para escritura." << endl;
	}
	archivo.close();



}

bool compararApellidosNombres(const Empleado& a, const Empleado& b) { //Esta función permite comparar los apellidos y nombres de los empleados
    if (a.apellidos == b.apellidos) {
        return a.nombres < b.nombres;
    }
    return a.apellidos < b.apellidos;
}

void mostrarempleados(const string& nombreArchivo) { //Esta función permite leer los empleados del archivo binario e imprimirlos alfabéticamente
    ifstream archivo(nombreArchivo, ios::binary);
    if (!archivo) {
        cout << "No se pudo abrir el archivo " << nombreArchivo << '\n';
        return;
    }

    Empleado empleado;
    vector<Empleado> empleados;
    while (archivo.read(reinterpret_cast<char*>(&empleado), sizeof(Empleado))) {
        empleados.push_back(empleado);
    }

    archivo.close();

    sort(empleados.begin(), empleados.end(), compararApellidosNombres);

    cout << "CODIGO" << '\t' << "APELLIDOS" << ", " << "NOMBRES" << '\t' << "CELULAR" << '\n';

    for (const auto& e : empleados) {
        cout << e.codigo << '\t' << e.apellidos << ", " << e.nombres << '\t' <<"        " << e.celular << '\n';
    }
}

bool validarid(int num, vector<Empleado>& empleados) { //Esta función valida si el código suministrado existe

	for (int i = 0;i < empleados.size();i++) {
		if (empleados[i].codigo == num) {
			return true;
		}
	}
	return false;
}

void agregarEmpleado(vector<Empleado>& empleados) { //Esta función me permite agregar empleados
	Empleado empleado;
	//Registro de datos de cada empleado comparando si el código dado ya existe
	cout << "Ingrese el codigo del empleado: ";
	cin >> empleado.codigo;
	if (!validarid(empleado.codigo, empleados)) {
		cout << "Ingrese los nombres del empleado: ";
		cin.ignore();
		getline(cin, empleado.nombres);
		cout << "Ingrese los apellidos del empleado: ";
		getline(cin, empleado.apellidos);
		cout << "Ingrese el celular del empleado: ";
		cin >> empleado.celular;
		cout << endl;
		empleados.push_back(empleado);
	}
	else {
		cout << "El codigo corresponde a un empleado ya registrado" << endl;
		cout << endl;
	}

}

void registrarEmpleado(vector<Empleado>& empleados) {//Esta función permite que el usuario continue registrando empleados si lo desea
	char opc = 's';
	do {
		cout << endl;
		agregarEmpleado(empleados);
		cout << "Desea seguir insertando empleados (s/n)" << endl;
		cin >> opc;
	} while (opc != 'n');
	cout << "--------------------------------------------------------------------" << endl;
}

void cambiar(vector<Empleado>& empleados) {//Esta función me permite cambiar el celular del empleado que el usuario desee
	int codigo, j;
	string numero;
	bool encontrado = false;
    // Pedir el código del empleado a modificar
	cout << "Ingrese el codigo del empleado al que le desea modificar el numero de telefono: ";
	cin >> codigo;
	for (int i = 0; i < empleados.size(); i++) { //Recorrer los códigos existentes
		if (empleados[i].codigo == codigo) {
			encontrado = true;
			j = i;
		}
	}
	if (encontrado)
	{
		cout << "Ingrese el nuevo numero de telefono del empleado: ";
		cin >> numero;
		empleados[j].celular = numero; //Asignar nuevo número
		cout << "Se cambio el numero de telefono exitosamente " << endl;
	}
	else {
		cout << "No se encontro el codigo" << endl;
	}

}

void despedir(vector<Empleado>& empleados, vector<Empleado>& empleadosDespedidos) { //Esta función me permite despedir a un empleado, crear su carta de despido y agregarlo un registro de empleados despedidos
	int codigoEmpleadoADespedir;
	cout << "Ingrese el codigo del empleado a despedir: ";
	cin >> codigoEmpleadoADespedir;

	bool encontrado = false;
	int j;
	for (int i = 0; i < empleados.size(); i++) {
		if (empleados[i].codigo == codigoEmpleadoADespedir) {
			encontrado = true;
			j = i;
			break;
		}
	}

	if (encontrado) {
        cout <<"Empleado despedido, eliminado de la lista de empleados y enviado a la lista de empleados despedidos."<<endl;
        cout <<"Carta de despido del empleado creada."<<endl;
		Empleado empleadoDespedir;
		empleadoDespedir = empleados[j];
		empleadosDespedidos.push_back(empleados[j]); //Agregar a los empleados despedidos
		empleados.erase(empleados.begin() + j); //Borrar del registro de empleados
		string nombreArchivo = "Carta_Despido_" + empleadoDespedir.nombres + ".txt"; //Carta de despido de cada empleado
		ofstream archivo(nombreArchivo);
		archivo << "Estimado/a " << empleadoDespedir.nombres << " " << empleadoDespedir.apellidos << ":" << endl;
		archivo << "Indentificado/a con el código: " << empleadoDespedir.codigo << endl;
		archivo << "Lamentamos informarle que a partir de la fecha ha sido despedido/a de la empresa." << endl;
		archivo << "Le deseamos la mejor de las suertes en sus futuros emprendimientos." << endl;
		archivo.close();
	}
	else
	{
		cout << "No se encontro el empleado para despedirlo" << endl;
	}



}

void mostarDespidos(vector<Empleado>& empleadosDespedidos) {//Esta función me muestra los empleados despedidos con sus respectivos datos

	cout << "Empleados despedidos:" << endl;
	for (int i = 0; i < empleadosDespedidos.size(); i++) {
		cout << "Codigo: " << empleadosDespedidos[i].codigo << endl;
		cout << "Nombres: " << empleadosDespedidos[i].nombres << endl;
		cout << "Apellidos: " << empleadosDespedidos[i].apellidos << endl;
		cout << "Celular: " << empleadosDespedidos[i].celular << endl;
	}

}

int main() {
	vector<Empleado> empleados;
	vector<Empleado> empleadosDespedidos;
	int opcion = 0;
	while (opcion != 7) {
        //Interfaz y menú de la aplicación
        cout << endl;
        cout << "****************************************************************" << endl;
        cout << "****** SISTEMA DE REGISTRO DE EMPLEADOS  MINOSAURIOS TECH ******" << endl;
        cout << "****************************************************************" << endl;
        cout << endl;
        cout << "***************************** MENU  ****************************"<< endl;
        cout << endl;
        cout << "Digite 1: Si desea registrar un empleado" << endl;
        cout << "Digite 2: Si desea agregar un nuevo empleado" << endl;
        cout << "Digite 3: Si desea mostrar los empleados registrados" << endl;
        cout << "Digite 4: Si desea cambiar el numero de celular empleado" << endl;
        cout << "Digite 5: Si desea despedir un empleado" << endl;
        cout << "Digite 6: Si desea mostrar los empleados que han sido despedidos" << endl;
        cout << "Digite 7: Si desea salir del programa" << endl;
		cout << "Opcion: ";
		cin >> opcion;
		cout << endl;
		switch (opcion) {
		//Llamado de funciones según el caso
		case 1:
			cout << "REGISTRAR EMPLEADOS" << endl;
			registrarEmpleado(empleados);
			guardarbin(empleados);
			cout << endl;
			break;
		case 2:
			cout << "AGREGAR UN NUEVO EMPLEADO" << endl;
			cout << endl;
			agregarEmpleado(empleados);
			guardarbin(empleados);
			cout << endl;
			break;
		case 3:
			cout << "MOSTRAR EMPLEADOS REGISTRADOS" << endl;
			cout << endl;
			mostrarempleados("empleados.bin");
			break;
		case 4:
			cout << "CAMBIAR NUMERO DE TELEFONO DE UN EMPLEADO" << endl;
			cout << endl;
			cambiar(empleados);
			guardarbin(empleados);
			cout << endl;
			break;
		case 5:
			cout << "DESPEDIR A UN EMPLEADO Y CREAR CARTA DE DESPIDO" << endl;
			cout << endl;
			despedir(empleados, empleadosDespedidos);
			guardarbin(empleados);
			cout << endl;
			break;
		case 6:
			cout << "MOSTRAR LISTA DE EMPLEADOS DESPEDIDOS" << endl;
			cout << endl;
			mostarDespidos(empleadosDespedidos);
			break;
		case 7:
			cout << "SALIO DEL PROGRAMA" << endl;
			break;
		default:
			cout << "OPCION NO VALIDA" << endl;
		}
	}
	return 0;
}