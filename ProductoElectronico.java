/**

 Esta es una clase abstracta que representa un producto electrónico.
 Contiene atributos y métodos comunes a todos los productos electrónicos.
 */
package com.example;
public abstract class ProductoElectronico {// Atributos
    private String nombre; // El nombre del producto electrónico.
    private double precio; // El precio del producto electrónico.
    private int garantia; // La duración de la garantía en meses.

// Constructor

    /**
     * Crea un nuevo producto electrónico con el nombre, precio y garantía especificados.
     *
     * @param nombre   El nombre del producto electrónico.
     * @param precio   El precio del producto electrónico.
     * @param garantia La duración de la garantía en meses.
     */
    public ProductoElectronico(String nombre, double precio, int garantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

// Getters y Setters

    /**
     * Obtiene el nombre del producto electrónico.
     *
     * @return El nombre del producto electrónico.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto electrónico.
     *
     * @param nombre El nombre del producto electrónico.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto electrónico.
     *
     * @return El precio del producto electrónico.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto electrónico.
     *
     * @param precio El precio del producto electrónico.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la duración de la garantía del producto electrónico.
     *
     * @return La duración de la garantía en meses.
     */
    public int getGarantia() {
        return garantia;
    }

    /**
     * Establece la duración de la garantía del producto electrónico.
     *
     * @param garantia La duración de la garantía en meses.
     */
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

// Métodos

    /**
     * Método abstracto para cargar el producto electrónico con una carga inicial.
     *
     * @param cargaInicial La carga inicial del producto electrónico.
     * @return Un mensaje indicando el estado de la carga.
     */
    public abstract String cargar(double cargaInicial);

    /**
     * Devuelve una representación en forma de cadena de caracteres del producto electrónico.
     *
     * @return La representación en forma de cadena de caracteres del producto electrónico.
     */
    public abstract String toString();
}