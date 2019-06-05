/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Estudiantes
 */
public class ArrayStore {
    public void error(){
        
        try{
    Object a[] = new String[10];
     a[1] = new Integer(1);
        }
        catch(ArrayStoreException e){
          System.out.println("El dato tiene diferente tipo.");  
        }
}
}