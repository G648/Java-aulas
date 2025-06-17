/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoexerciciosrepeticao;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class VerificaNumPar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, informe um numero: ");
        int numUsuario = sc.nextInt();
        
        System.out.println("Numeros pares até: " + numUsuario + ":");
        
        for (int i = 1; i <= numUsuario; i++) {
            if (i % 2 == 0) {
                System.out.println("Numeros pares: " + i);
            } 
        }
        
        System.out.println();
    }
}
