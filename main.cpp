#include <iostream>
#include <fstream>

using namespace std;

// Estructura de datos para los clientes
struct Cliente {
    string nombre;
    string direccion;
    string localidad;
    long int telefono;
};

int main() {
    // Crear un puntero a la estructura de datos
  Cliente *miCliente = new Cliente;

    // Capturar los datos del cliente
    cout << "\n Ingrese el nombre del cliente: ";
    getline(cin, miCliente->nombre);

    cout << "\n Ingrese la direccion del cliente: ";
    getline(cin, miCliente->direccion);

    cout << "\n Ingrese la localidad del cliente: ";
    getline(cin, miCliente->localidad);
  
    cout << "\n Ingrese el telefono del cliente: ";
    cin >> miCliente->telefono;

    // Abrir el archivo de texto para imprimir la factura
    ofstream archivoFactura("factura.txt");

    // Imprimir la factura en el archivo de texto
    archivoFactura << "FACTURA" << endl;
    archivoFactura << "Nombre: " << miCliente->nombre << endl;
    archivoFactura << "Direccion: " << miCliente->direccion << endl;
    archivoFactura << "Localidad: " << miCliente->localidad << endl;
    archivoFactura << "Telefono: " << miCliente->telefono << endl;

    // Cerrar el archivo de texto y liberar la memoria del puntero
    archivoFactura.close();
    delete miCliente;
  
    return 0;
}
