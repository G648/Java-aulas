/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condandoperators;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class CondAndOperators {

    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao meu código. Por gentileza, informe sua idade: ");
        
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        String message = (idade < 18) ? "Você é menor de idade" : "Você é maior de idade!";
        
        System.out.println(message);
        
        sc.close(); // boa prática para encerrar o Scanner
    }
}
