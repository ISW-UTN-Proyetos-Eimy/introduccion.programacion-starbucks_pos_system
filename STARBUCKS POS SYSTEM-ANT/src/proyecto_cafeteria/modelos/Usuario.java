/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_cafeteria.modelos;

/**
 *
 * @author Ei7Gr
 */
public final class Usuario {

    private static Usuario INSTANCE;

    private String NombreUsuario;

    public static Usuario getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Usuario();
        }

        return INSTANCE;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }
}
