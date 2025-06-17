/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correcaoexercicios;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class CorrecaoExercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        1. Escreva um programa que peça o nome do usuário e exiba uma saudação.
        
           System.out.println("Ola! Seja bem vindo ao meu programa. Por gentileza, informe seu melhor nome: ");
           
//          entrada de dados
            Scanner sc = new Scanner(System.in);
            String nome = sc.nextLine();
            
//           Saída de dados
            System.out.println("Seja bem vindo, " + nome);
    }
    
}
