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
public class ClassCast {
    
    public void error() {
        
        try {
        
            Object x = new Integer(0);
            System.out.println((String)x);
           
        } catch (ClassCastException e) {
            
            System.out.println("El código ha intentado convertir un objeto en una subclase de la que no es una instancia.");
            
        }
        
        
    }
    
}
