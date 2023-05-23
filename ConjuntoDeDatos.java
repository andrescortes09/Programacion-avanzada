// Clase abstracta que representa un conjunto de datos
abstract class ConjuntoDeDatos {
    protected String nombre; // Nombre del conjunto de datos
    protected int tamaño; // Tamaño del conjunto de datos

    // Constructor de la clase
    public ConjuntoDeDatos(String nombre, int tamaño) {
        this.nombre = nombre; // Asignar el nombre proporcionado al nombre del conjunto
        this.tamaño = tamaño; // Asignar el tamaño proporcionado al tamaño del conjunto
    }

    // Método abstracto para describir el conjunto de datos
    public abstract String describir();

}
