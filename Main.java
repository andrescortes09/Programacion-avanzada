/**

 Esta es la clase principal del programa que permite interactuar con la creación y gestión de productos electrónicos.
 */
package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que inicia la ejecución del programa.
     */
    public static void main(String[] args) {
        // Crear lista de productos
        ArrayList<ProductoElectronico> productosElectronicos = new ArrayList<ProductoElectronico>();

        int opcion = 0;
        while (opcion != 5) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    Celular nuevoCel = crearCelular();
                    productosElectronicos.add(nuevoCel);
                    break;
                case 2:
                    Computadora nuevaComp = crearComputadora();
                    productosElectronicos.add(nuevaComp);
                    break;
                case 3:
                    imprimirProductos(productosElectronicos);
                    break;
                case 4:
                    cargarProductos(productosElectronicos);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    /**
     * Muestra el menú de opciones y lee la opción seleccionada por el usuario.
     *
     * @return La opción seleccionada por el usuario.
     */
    public static int menu() {
        System.out.println("MENU");
        System.out.println("1. Crear celular");
        System.out.println("2. Crear computadora");
        System.out.println("3. Imprimir info de productos");
        System.out.println("4. Cargar productos");
        System.out.println("5. Salir");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    /**
     * Crea un nuevo celular solicitando los datos al usuario.
     *
     * @return El celular creado.
     */
    public static Celular crearCelular() {
        // Solicitar datos
        System.out.println("CREAR CELULAR");
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese los meses de garantia:");
        int garantia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el operador: ");
        String operador = scanner.nextLine();
        System.out.println("Ingrese el nivel de resistencia al agua: ");
        String resistenciaAgua = scanner.nextLine();
        System.out.println("Ingrese la marca: ");
        String marca = scanner.nextLine();

        //Crear celular
        Celular celular = new Celular(nombre, precio, garantia, operador, resistenciaAgua, marca);
        System.out.println("Celular creado exitosamente");
        return celular;
    }

    /**
     * Crea una nueva computadora solicitando los datos al usuario.
     *
     * @return La computadora creada.
     */
    public static Computadora crearComputadora() {
        // Solicitar datos
        System.out.println("CREAR COMPUTADORA");
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de meses de garantia: ");
        int garantia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el sistema operativo: ");
        String sistemaOperativo = scanner.nextLine();
        System.out.println("Ingrese la capacidad de RAM: ");
        int ram = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la marca: ");
        String marca = scanner.nextLine();

        //Crear computadora
        Computadora computadora = new Computadora(nombre, precio, garantia, sistemaOperativo, ram, marca);
        System.out.println("Computadora creada exitosamente");
        return computadora;
    }

    /**
     * Imprime la información de los productos electrónicos almacenados en la lista.
     *
     * @param productosElectronicos La lista de productos electrónicos.
     */
    public static void imprimirProductos(ArrayList<ProductoElectronico> productosElectronicos) {
        System.out.println("LISTA DE PRODUCTOS");
        for (ProductoElectronico producto : productosElectronicos) {
            System.out.println(producto.toString());
            System.out.println();
        }
    }

    /**
     * Carga los productos electrónicos de la lista, mostrando el tiempo de carga para cada uno.
     *
     * @param productosElectronicos La lista de productos electrónicos.
     */
    public static void cargarProductos(ArrayList<ProductoElectronico> productosElectronicos) {
        System.out.println("CARGAR PRODUCTOS");
        for (ProductoElectronico producto : productosElectronicos) {
            // Generar un número aleatorio entre 1 y 60
            double cargaInicial = (double) (Math.random() * 60 + 1);
            System.out.println(producto.cargar(cargaInicial));
            System.out.println();
        }
    }
}