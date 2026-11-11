
package com.mycompany.inventario;

/**
 *
 * @author isaac
 */

public class CalculadoraInventario {

    // Método para calcular el total con descuento
    public static double calcularTotalConDescuento(
            double precio,
            int cantidad,
            double porcentajeDescuento) {

        double subtotal = precio * cantidad;

        double montoDescuento =
                subtotal * (porcentajeDescuento / 100.0);

        return subtotal - montoDescuento;
    }
}