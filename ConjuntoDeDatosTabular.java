// Clase que representa un conjunto de datos de tipo tabular, derivada de la clase ConjuntoDeDatos
class ConjuntoDeDatosTabular extends ConjuntoDeDatos {
    private int numeroDeColumnas; // Número de columnas del conjunto tabular
    private int numeroDeFilas; // Número de filas del conjunto tabular

    // Constructor de la clase
    public ConjuntoDeDatosTabular(String nombre, int tamaño, int numeroDeFilas, int numeroDeColumnas) {
        super(nombre, tamaño); // Llamar al constructor de la clase base (ConjuntoDeDatos) para inicializar el nombre y el tamaño
        this.numeroDeFilas = numeroDeFilas; // Asignar el número de filas proporcionado al número de filas del conjunto tabular
        this.numeroDeColumnas = numeroDeColumnas; // Asignar el número de columnas proporcionado al número de columnas del conjunto tabular
    }

    // Método para describir el conjunto de datos tabular
    @Override
    public String describir() {
        String descripcion = "Nombre: " + nombre + "\n" +
                "Tamaño: " + tamaño + "\n" +
                "Tipo: Tabular" + "\n" +
                "Filas: " + numeroDeFilas + "\n" +
                "Columnas: " + numeroDeColumnas;
        return descripcion; // Devolver la descripción del conjunto de datos tabular
    }

}
