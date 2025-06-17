/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoexercicios;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class CalculoNumeros {
    public static void main(String[] args) {
//        2. Faça um programa que leia dois números inteiros e exiba a soma entre eles.

        Scanner sc = new Scanner(System.in);
        //entrada de dados
        System.out.println("Informe o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        int num2 = sc.nextInt();
        
        //processamento de dados
        int soma = num1 + num2;
        
        //saída de dados
        System.out.println("A soma de " + num1 + " + " + num2 + " e de: " + soma);        
    }
}
