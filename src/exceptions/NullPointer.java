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
public class NullPointer {

    public void error() {

        Object a[] = new String[10];
        

        try {
            a[1].toString();
            System.out.println(a[4]);
        } catch (NullPointerException e) {
            System.out.println("Los espacios de los arreglos están nulos");
        }

    }
}
