import java.util.ArrayList;
import java.util.Scanner;

// Clase que representa un analizador de datos
class AnalizadorDeDatos {
    private ArrayList<ConjuntoDeDatos> conjuntosDeDatos; // Lista de conjuntos de datos

    // Constructor de la clase
    public AnalizadorDeDatos() {
        conjuntosDeDatos = new ArrayList<>(); // Inicializar la lista de conjuntos de datos
    }

    // Método para añadir un conjunto de datos dependiendo del tipo que el usuario seleccione
    public void añadirConjuntoDeDatos(ConjuntoDeDatos conjuntoDeDatos) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto de tipo Scanner para leer la entrada del usuario
        System.out.println("¿Qué tipo de conjunto de datos desea añadir?");
        System.out.println("1. Tabular");
        System.out.println("2. Imagen");
        int opcion = scanner.nextInt(); // Leer la opción seleccionada por el usuario
        scanner.nextLine(); // Limpiar el búfer del escáner

        if (opcion == 1) { // Si se selecciona la opción 1 (Tabular)
            System.out.println("Ingrese el nombre del conjunto de datos:");
            String nombre = scanner.nextLine(); // Leer el nombre del conjunto de datos
            System.out.println("Ingrese el tamaño del conjunto de datos:");
            int tamaño = scanner.nextInt(); // Leer el tamaño del conjunto de datos
            System.out.println("Ingrese el número de filas del conjunto de datos:");
            int numeroDeFilas = scanner.nextInt(); // Leer el número de filas del conjunto de datos
            System.out.println("Ingrese el número de columnas del conjunto de datos:");
            int numeroDeColumnas = scanner.nextInt(); // Leer el número de columnas del conjunto de datos
            ConjuntoDeDatosTabular conjuntoTabular = new ConjuntoDeDatosTabular(nombre, tamaño, numeroDeFilas, numeroDeColumnas); // Crear un objeto ConjuntoDeDatosTabular con los datos ingresados
            conjuntosDeDatos.add(conjuntoTabular); // Añadir el conjunto de datos a la lista
        } else if (opcion == 2) { // Si se selecciona la opción 2 (Imagen)
            System.out.println("Ingrese el nombre del conjunto de datos:");
            String nombre = scanner.nextLine(); // Leer el nombre del conjunto de datos
            System.out.println("Ingrese el tamaño del conjunto de datos:");
            int tamaño = scanner.nextInt(); // Leer el tamaño del conjunto de datos
            System.out.println("Ingrese el ancho del conjunto de datos:");
            int ancho = scanner.nextInt(); // Leer el ancho del conjunto de datos
            System.out.println("Ingrese el alto del conjunto de datos:");
            int alto = scanner.nextInt(); // Leer el alto del conjunto de datos
            ConjuntoDeDatosImagen conjuntoImagen = new ConjuntoDeDatosImagen(nombre, tamaño, ancho, alto); // Crear un objeto ConjuntoDeDatosImagen con los datos ingresados
            conjuntosDeDatos.add(conjuntoImagen); // Añadir el conjunto de datos a la lista
        } else { // Si se selecciona una opción inválida
            System.out.println("Opción inválida.");
        }
    }

    // Método para eliminar un conjunto de datos por su nombre
    public void eliminarConjuntoDeDatos(String nombre) {
        ConjuntoDeDatos conjuntoAEliminar = null; // Variable para almacenar el conjunto de datos a eliminar
        for (ConjuntoDeDatos conjunto : conjuntosDeDatos) { // Recorrer la lista de conjuntos de datos
            if (conjunto.nombre.equals(nombre)) { // Si el nombre del conjunto actual coincide con el nombre proporcionado
                conjuntoAEliminar = conjunto; // Asignar el conjunto actual como el conjunto a eliminar
                break; // Salir del bucle
            }
        }
        if (conjuntoAEliminar != null) { // Si se encontró un conjunto de datos para eliminar
            conjuntosDeDatos.remove(conjuntoAEliminar); // Eliminar el conjunto de datos de la lista
            System.out.println("El conjunto de datos '" + nombre + "' ha sido eliminado.");
        } else { // Si no se encontró ningún conjunto de datos con el nombre proporcionado
            System.out.println("No se encontró ningún conjunto de datos con el nombre '" + nombre + "'.");
        }
    }

    // Método para describir todos los conjuntos de datos
    public ArrayList<String> describirConjuntosDeDatos() {
        ArrayList<String> descripciones = new ArrayList<>(); // Lista para almacenar las descripciones de los conjuntos de datos
        for (ConjuntoDeDatos conjunto : conjuntosDeDatos) { // Recorrer la lista de conjuntos de datos
            descripciones.add(conjunto.describir()); // Obtener la descripción del conjunto actual y añadirla a la lista de descripciones
        }
        return descripciones; // Devolver la lista de descripciones de los conjuntos de datos
    }

}
