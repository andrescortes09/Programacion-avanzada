// Clase que representa un conjunto de datos de tipo imagen, derivada de la clase ConjuntoDeDatos
class ConjuntoDeDatosImagen extends ConjuntoDeDatos {
    private int ancho; // Ancho de la imagen
    private int alto; // Alto de la imagen

    // Constructor de la clase
    public ConjuntoDeDatosImagen(String nombre, int tamaño, int ancho, int alto) {
        super(nombre, tamaño); // Llamar al constructor de la clase base (ConjuntoDeDatos) para inicializar el nombre y el tamaño
        this.ancho = ancho; // Asignar el ancho proporcionado al ancho de la imagen
        this.alto = alto; // Asignar el alto proporcionado al alto de la imagen
    }

    // Método para describir el conjunto de datos de imagen
    @Override
    public String describir() {
        String descripcion = "Nombre: " + nombre + "\n" +
                "Tamaño: " + tamaño + "\n" +
                "Tipo: Imagen" + "\n" +
                "Ancho: " + ancho + "\n" +
                "Alto: " + alto;
        return descripcion; // Devolver la descripción del conjunto de datos de imagen
    }

}
