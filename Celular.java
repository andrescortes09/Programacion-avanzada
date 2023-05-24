/**

 Esta es una clase que representa un celular, el cual es un tipo de producto electrónico.
 Hereda atributos y métodos de la clase abstracta ProductoElectronico.
 */
package com.example;
public class Celular extends ProductoElectronico {
    private String marca; // La marca del celular.
    private String operador; // El operador de telefonía móvil del celular.
    private String resistenciaAgua; // El nivel de resistencia al agua del celular.


    /**
     * Crea un nuevo celular con el nombre, precio, garantía, operador, resistencia al agua y marca especificados.
     *
     * @param nombre          El nombre del celular.
     * @param precio          El precio del celular.
     * @param garantia        La duración de la garantía en meses.
     * @param operador        El operador de telefonía móvil del celular.
     * @param resistenciaAgua El nivel de resistencia al agua del celular.
     * @param marca           La marca del celular.
     */
    public Celular(String nombre, double precio, int garantia, String operador, String resistenciaAgua,
                   String marca) {
        super(nombre, precio, garantia); // Llama al constructor de la clase padre ProductoElectronico.
        this.operador = operador;
        this.resistenciaAgua = resistenciaAgua;
        this.marca = marca;
    }

// Getters y Setters

    /**
     * Obtiene el operador de telefonía móvil del celular.
     *
     * @return El operador de telefonía móvil del celular.
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Establece el operador de telefonía móvil del celular.
     *
     * @param operador El operador de telefonía móvil del celular.
     */
    public void setOperador(String operador) {
        this.operador = operador;
    }

    /**
     * Obtiene el nivel de resistencia al agua del celular.
     *
     * @return El nivel de resistencia al agua del celular.
     */
    public String getResistenciaAgua() {
        return resistenciaAgua;
    }

    /**
     * Establece el nivel de resistencia al agua del celular.
     *
     * @param resistenciaAgua El nivel de resistencia al agua del celular.
     */
    public void setResistenciaAgua(String resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }

    /**
     * Obtiene la marca del celular.
     *
     * @return La marca del celular.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del celular.
     *
     * @param marca La marca del celular.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }


// Métodos

    /**
     * Carga el celular con una carga inicial y devuelve un mensaje indicando el tiempo de carga.
     *
     * @param cargaInicial La carga inicial del celular.
     * @return Un mensaje indicando el tiempo de carga del celular.
     */
    @Override
    public String cargar(double cargaInicial) {
        double tiempoCarga = (cargaInicial * 2) / 100;

        String cargaInicialString = String.format("%.2f", cargaInicial);
        String tiempoString = String.format("%.2f", tiempoCarga);

        return "Con " + cargaInicialString + " de batería, el celular " + getNombre() + " demora: " + tiempoString + " horas en cargar";
    }

    /**
     * Devuelve una representación en forma de cadena de caracteres del celular.
     *
     * @return La representación en forma de cadena de caracteres del celular.
     */
    @Override
    public String toString() {
        String texto = "";
        texto += "CELULAR\n";
        texto += "Nombre: " + getNombre() + "\n";
        texto += "Marca: " + getMarca() + "\n";
        texto += "Precio: " + getPrecio() + "\n";
        texto += "Garantia en meses: " + getGarantia() + "\n";
        texto += "Operador: " + getOperador() + "\n";
        texto += "Resistencia al agua: " + getResistenciaAgua() + "IPX \n";
        return texto;
    }
}