
package com.mycompany.inventario;

/**
 *
 * @author isaac
 */

public class EntidadInventario {

    private String nombreArticulo;
    private double precioUnitario;
    private int cantidadStock;

    // Constructor
    public EntidadInventario(String nombre, double precio, int stock) {
        this.nombreArticulo = nombre;
        this.precioUnitario = precio;
        this.cantidadStock = stock;
    }

    // Getters
    public String obtenerNombre() {
        return nombreArticulo;
    }

    public double obtenerPrecio() {
        return precioUnitario;
    }

    public int obtenerStock() {
        return cantidadStock;
    }

    // Método para actualizar el stock
    public void actualizarStock(int nuevaCantidad) {
        this.cantidadStock = nuevaCantidad;
    }
}