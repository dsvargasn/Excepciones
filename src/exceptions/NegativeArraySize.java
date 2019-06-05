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
public class NegativeArraySize {
    
    public void error() {
        
        try {   
                
            int[] Array = new int[-4];
            
        } catch (NegativeArraySizeException e) {
            
            System.out.println("El tamaño del vector es negativo.");
            
        }
        
    }
    
}
