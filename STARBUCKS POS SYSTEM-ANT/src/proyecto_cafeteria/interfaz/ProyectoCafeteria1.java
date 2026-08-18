/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package proyecto_cafeteria.interfaz;

import proyecto_cafeteria.modelos.Producto;

/**
 *
 * @author Cristel
 */
public class ProyectoCafeteria1 {

    private static final Producto producto1 = new Producto("Café", 1500, 10);
    private static final Producto producto2 = new Producto("Reposteria", 1200, 30);
    private static final Producto producto3 = new Producto("Refresco", 1500, 35);
    private static final Producto producto4 = new Producto("Retail", 8900, 15);

    static final Producto[] productos = {producto1, producto2, producto3, producto4};

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
