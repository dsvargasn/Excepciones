/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el numero de error que desea ver:");
        System.out.println("1. Aithmetic.");
        System.out.println("2. Array.");
        System.out.println("3. Number.");
        System.out.println("4. NullPointer.");
        System.out.println("5. InputMismatch.");
        System.out.println("6. NegativeArraySize.");
        System.out.println("7. Runtime.");
        System.out.println("8. ClassCast.");
        System.out.println("9. ArrayIndexOutOfBounds.");
        System.out.println("10.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                Arithmetic a = new Arithmetic();
                a.error();
                break;
            case 2:
                ArrayStore e = new ArrayStore();
                e.error();
                break;
            case 3:
                NumberFormat n = new NumberFormat();
                n.error();
                break;
            case 4:
                NullPointer u = new NullPointer();
                u.error();
                break;
            case 5:
                InputMismatch i = new InputMismatch();
                i.Suma();
                break; 
            case 6:
                NegativeArraySize ne = new NegativeArraySize();
                ne.error();
                break;
            case 7:
                Runtime r = new Runtime();
                r.error();
                break;
            case 8:
                ClassCast c = new ClassCast();
                c.error();
                break;
            case 9:
                ArrayIndexOutOfBounds ar = new ArrayIndexOutOfBounds();
                ar.error();
                break;
            case 10:
                System.out.println("No lo hicimos. :(");
                break;
        }
        
    }
    
}
