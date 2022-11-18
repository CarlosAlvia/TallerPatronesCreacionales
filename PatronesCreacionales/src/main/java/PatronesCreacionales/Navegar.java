/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PatronesCreacionales;

import Factory_Method.Producto;
import java.util.ArrayList;

/**
 *
 * @author Jorge Daniel
 */
public interface Navegar {
    
    //Se debe llamar a un objeto de tipo creador para poder mostar la consulta que quiere hacer el cliente luego de 
    public ArrayList<Producto> consultarProducto();
}
