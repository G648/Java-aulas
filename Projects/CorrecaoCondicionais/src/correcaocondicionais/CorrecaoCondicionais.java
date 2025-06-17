/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correcaocondicionais;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class CorrecaoCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Peça ao aluno que crie um programa que receba 3 lados e 
//verifique se é possível formar um triângulo.
//Se sim, o programa deve indicar o tipo de triângulo:
//
//Equilátero (todos iguais)
//
//Isósceles (dois iguais)
//
//Escaleno (todos diferentes)
        Scanner sc = new Scanner(System.in);

        //ENTRADA DE DADOS
        double ladoA, ladoB, ladoC;

        System.out.println("Informe o primeiro lado: ");
        ladoA = sc.nextDouble();

        System.out.println("Informe o segundo lado: ");
        ladoB = sc.nextDouble();

        System.out.println("Informe o terceiro lado: ");
        ladoC = sc.nextDouble();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Equilatero");
        }
        else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Escaleno");
        }
    }

}
