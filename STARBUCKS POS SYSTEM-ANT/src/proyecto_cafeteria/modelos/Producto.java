/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_cafeteria.modelos;

/**
 *
 * @author Ei7Gr
 */
public class Producto {
    private String Nombre;
    private float Precio;
    private int Stock;

    public Producto() {
    }

    public Producto(String Nombre, float Precio, int Stock) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
}
    