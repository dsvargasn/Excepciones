/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author santi
 */
public class ArrayIndexOutOfBounds {
    
    public void error() {
        
        try {
            
            int[] Array = {1,2,3,4,5};
        
            System.out.println(Array[6]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("La posición del arreglo que trata de indicar no existe.");
            
        }
        
        
        
    }
    
}
