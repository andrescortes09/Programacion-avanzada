/**
 Esta es una clase que representa una computadora, la cual es un tipo de producto electrónico.
 Hereda atributos y métodos de la clase abstracta ProductoElectronico.
 */
package com.example;
public class Computadora extends ProductoElectronico {
    private String marca; // La marca de la computadora.
    private String sistemaOperativo; // El sistema operativo instalado en la computadora.
    private int ram; // La cantidad de memoria RAM en la computadora.


// Constructor

    /**
     * Crea una nueva computadora con el nombre, precio, garantía, sistema operativo, RAM y marca especificados.
     *
     * @param nombre           El nombre de la computadora.
     * @param precio           El precio de la computadora.
     * @param garantia         La duración de la garantía en meses.
     * @param sistemaOperativo El sistema operativo instalado en la computadora.
     * @param ram              La cantidad de memoria RAM en la computadora.
     * @param marca            La marca de la computadora.
     */
    public Computadora(String nombre, double precio, int garantia, String sistemaOperativo, int ram,
                       String marca) {
        super(nombre, precio, garantia); // Llama al constructor de la clase padre ProductoElectronico.
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
        this.marca = marca;
    }

// Getters y Setters

    /**
     * Obtiene el sistema operativo instalado en la computadora.
     *
     * @return El sistema operativo instalado en la computadora.
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * Establece el sistema operativo instalado en la computadora.
     *
     * @param sistemaOperativo El sistema operativo instalado en la computadora.
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * Obtiene la cantidad de memoria RAM en la computadora.
     *
     * @return La cantidad de memoria RAM en la computadora.
     */
    public int getRam() {
        return ram;
    }

    /**
     * Establece la cantidad de memoria RAM en la computadora.
     *
     * @param ram La cantidad de memoria RAM en la computadora.
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * Obtiene la marca de la computadora.
     *
     * @return La marca de la computadora.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca de la computadora.
     *
     * @param marca La marca de la computadora.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

// Métodos

    /**
     * Carga la computadora con una carga inicial y devuelve un mensaje indicando el tiempo de carga.
     *
     * @param cargaInicial La carga inicial de la computadora.
     * @return Un mensaje indicando el tiempo de carga de la computadora.
     */
    @Override
    public String cargar(double cargaInicial) {

        // El tiempo de carga se calcula con la fórmula: (cargaInicial * 12 horas) / 100
        double tiempoCarga = (cargaInicial * 12) / 100;

        // Formatear los números a dos decimales
        String cargaInicialString = String.format("%.2f", cargaInicial);
        String tiempoString = String.format("%.2f", tiempoCarga);

        return "Con una carga inicial de " + cargaInicialString + ", el tiempo de carga de la Computadora " + getNombre() + " es de " + tiempoString + " horas";
    }

    /**
     * Devuelve una representación en forma de cadena de caracteres de la computadora.
     *
     * @return La representación en forma de cadena de caracteres de la computadora.
     */
    @Override
    public String toString() {
        String texto = "";
        texto += "COMPUTADORA\n";
        texto += "Nombre: " + getNombre() + "\n";
        texto += "Marca: " + getMarca() + "\n";
        texto += "Precio: " + getPrecio() + "\n";
        texto += "Garantia en días: " + getGarantia() + "\n";
        texto += "Sistema Operativo: " + getSistemaOperativo() + "\n";
        texto += "Memoria RAM: " + getRam() + "\n";
        return texto;
    }
}