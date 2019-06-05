/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class InputMismatch {

    public void Suma() {

        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            Scanner scan = new Scanner(System.in);
            int b = scan.nextInt();
            int resultado = a + b;
            System.out.println(resultado);
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un numero valido");
        }

    }

}
