/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        System.out.println("Hello world!");
        System.out.println("Guilherme");
        
        // operadores aritméticos -> +, -, /, *, **, %, //
        
        //soma simples
        System.out.println("A soma e: " + (10 + 10));
        
        //Subtração simples
        System.out.println("A subtracao e: " + (10 - 10));
        
        //Divisão simples
        System.out.println("A divisao e: " + (10 / 10));
        
        //multiplicação
        System.out.println("A multiplicacao e: " + (10 * 10));
        
        */
        //----------------------------------------------//
        /*
        //Criação de variáveis
        
        //idade
        int idade = 22;
        
        //sexo
        char sexo = 'M';
        
        //nome
        String nome =- "Guilherme";
        
        //estudante ? true - false
        boolean estudante = true;
        
        System.out.println("Ola, o meu nome e: " + nome + 
                ",\n a minha idade e de: " + idade + " anos. \n Meu sexo e: " + sexo + 
                ", \n e meu status de studante e: " + estudante);
        
        */
        
        /*
        // biblioteca para entrada de dados
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Boa tarde, usuario! Informe seu primeiro nome: ");
        //Método da biblioteca scanner para entrada de dados
        String nome = sc.nextLine();
        
        System.out.println("Seja bem vindo ao meu programa, " + nome);
        
        // --------------------------------------------
        
        //programa para soma de dois números - entrada de dados
        System.out.println("Digite o primeiro numero: ");
        int numA = sc.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int numB = sc.nextInt();
        
        //processamento de dados 
        int resultadoSoma = numA + numB;
        
        //saída de dados
        System.out.println("A soma de: " + numA + " + " + numB + " = " + resultadoSoma);
        */
        //Receba do usuário 3 números e realize a média dos 3 números informados
        
        //Entrada de dados
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe o segundo numero: ");
        double n2 = sc.nextDouble();
        
        System.out.println("Informe o terceiro numero: ");
        double n3 = sc.nextDouble();
        
        //processamento de dados
        //pemdas 
        double media = (n1 + n2 + n3) / 3;
        
        //saída de dados
        System.out.print("A media das notas e: ");
        System.out.format("%.2f", media);
    }
}