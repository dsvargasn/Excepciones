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
public class NumberFormat {
        public void error(){
    String a = "B";
    int num;
       try{
    num=Integer.parseInt(a);
    }
    catch(NumberFormatException e) {
            System.out.println("No es un numero.");
            }
}
}
