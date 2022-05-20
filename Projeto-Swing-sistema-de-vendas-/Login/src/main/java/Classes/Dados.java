/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Pichau
 */
public class Dados {

    public boolean validarUsuarios(String usuario, String senha) {
        if (usuario.equals("admin") && senha.equals("admin1")) {
            return true;
        } else {
            return false;
        }
    }
}
