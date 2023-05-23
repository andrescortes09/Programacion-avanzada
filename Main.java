import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnalizadorDeDatos analizador = new AnalizadorDeDatos(); // Crear una instancia de AnalizadorDeDatos
        Scanner scanner = new Scanner(System.in); // Crear una instancia de Scanner para leer la entrada del usuario

        int opcion; // Variable para almacenar la opción elegida por el usuario
        do {
            System.out.println("----- MENÚ -----"); // Mostrar el menú
            System.out.println("1. Añadir conjunto de datos");
            System.out.println("2. Eliminar conjunto de datos");
            System.out.println("3. Ver lista de conjuntos de datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario
            scanner.nextLine();  // Limpiar el búfer del escáner

            switch (opcion) {
                case 1:
                    System.out.println("----- Añadir Conjunto de Datos -----"); // Mostrar el encabezado para añadir un conjunto de datos
                    Object conjuntoDeDatos = null; // Variable para almacenar el conjunto de datos (inicializada como null)
                    analizador.añadirConjuntoDeDatos((ConjuntoDeDatos) null); // Llamar al método añadirConjuntoDeDatos de AnalizadorDeDatos con el conjunto de datos null
                    System.out.println("------------------------------------");
                    break;

                case 2:
                    System.out.println("----- Eliminar Conjunto de Datos -----"); // Mostrar el encabezado para eliminar un conjunto de datos
                    System.out.print("Ingrese el nombre del conjunto de datos a eliminar: ");
                    String nombreEliminar = scanner.nextLine(); // Leer el nombre del conjunto de datos a eliminar
                    analizador.eliminarConjuntoDeDatos(nombreEliminar); // Llamar al método eliminarConjuntoDeDatos de AnalizadorDeDatos con el nombre del conjunto de datos a eliminar
                    System.out.println("--------------------------------------");
                    break;

                case 3:
                    System.out.println("/n ----- Lista de Conjuntos de Datos -----"); // Mostrar el encabezado para ver la lista de conjuntos de datos
                    ArrayList<String> descripciones = analizador.describirConjuntosDeDatos(); // Obtener las descripciones de los conjuntos de datos utilizando el método describirConjuntosDeDatos de AnalizadorDeDatos
                    for (String descripcion : descripciones) { // Iterar sobre cada descripción en la lista de descripciones
                        System.out.println(descripcion); // Mostrar la descripción del conjunto de datos
                        System.out.println("--------------------------------------");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa..."); // Mostrar un mensaje de salida
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida."); // Mostrar un mensaje de opción inválida
            }
        } while (opcion != 4); // Continuar ejecutando el programa mientras la opción no sea 4 (Salir)
    }
}
