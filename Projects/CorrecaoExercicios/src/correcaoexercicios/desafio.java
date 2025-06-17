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
public class desafio {
    public static void main(String[] args) {
//        5. DESAFIO: Leia o nome, idade e altura de uma pessoa e exiba no formato:
//          "Nome: Ana | Idade: 20 anos | Altura: 1.65 m"

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Boa tarde, informe seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("informe sua idade: ");
        int idade = sc.nextInt();
        
        System.out.println("informe sua altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("Nome: " + nome + " | " + "Idade: " + idade + " | " + " Altura: " + altura + "m");
    }
}
