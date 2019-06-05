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
public  class Arithmetic {
    
    public void error(){
     int num1=10;
     int num2=0;
     
        System.out.println("La division es: ");
        try{
            
      int div =num1/num2;
}
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
        }
}
