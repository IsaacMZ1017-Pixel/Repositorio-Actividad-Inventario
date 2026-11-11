
package com.mycompany.inventario;

/**
 *
 * @author isaac
 */

public class PresentadorConsola {

    // Método para mostrar el reporte
    public static void mostrarReporte(
            String nombre,
            int stock,
            double totalValorizado) {

        System.out.println("Articulo: " + nombre
                + " | Stock: " + stock);

        System.out.printf(
                "Total inventario valorizado: $%.2f%n",
                totalValorizado
        );
    }
}