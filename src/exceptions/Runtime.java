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
public class Runtime {
    
    public void error() {
        
        try {
            
            Interface in = new Interface();
            
        } catch (RuntimeException e) {
            
            System.out.println("Problema al crear una clase con una interface");
        }
 
    } 
    
}
