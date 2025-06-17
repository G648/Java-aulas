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
public class MediaNotas {
    public static void main(String[] args) {
//        3. Leia duas notas e exiba a média.
    
    Scanner sc = new Scanner(System.in);
    
        //declaração de variáveis
        double nota1, nota2, media; 
        
        System.out.println("Seja bem vindo. informe a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("informe a segunda nota: ");
        nota2 = sc.nextDouble();
        
        //processamento
        media = (nota1 + nota2) / 2;
        
        //saída de dados
        System.out.format("%.2f", media);
    }
}
