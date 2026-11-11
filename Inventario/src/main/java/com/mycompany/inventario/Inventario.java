
package com.mycompany.inventario;

/**
 *
 * @author isaac
 */
public class Inventario {

    public static void main(String[] args) {
        
        // 1. Crear el artículo
        EntidadInventario articulo =
                new EntidadInventario("Laptop Pro", 12500.0, 8);

        // 2. Calcular el total con descuento
        double totalFinal =
                CalculadoraInventario.calcularTotalConDescuento(
                        articulo.obtenerPrecio(),
                        articulo.obtenerStock(),
                        10.0
                );

        // 3. Mostrar el reporte
        PresentadorConsola.mostrarReporte(
            articulo.obtenerNombre(),
            articulo.obtenerStock(),
            totalFinal
        );

        // 4. Actualizar el stock
        articulo.actualizarStock(5);

        System.out.println("\nStock actualizado: "
                + articulo.obtenerStock());
    }
}