/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaocondicionais;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class IMC {

    public static void main(String[] args) {
//        Solicite ao aluno que crie um programa que receba peso (kg) e altura (m) e calcule o IMC:
//IMC = peso / (altura * altura)
//Com base no resultado, exiba uma classificação:
//
//Abaixo do peso
//
//Peso normal
//
//Sobrepeso
//
//Obesidade

        double altura, peso, imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura, 2);

        //classificação
        if (imc <= 18.5) {
            System.out.println("A pessoa esta abaixo do peso! " + imc);
        } else if (imc < 25) {
            System.out.println("A pessoa esta com o peso normal! " + imc);
        } else if (imc < 30) {
            System.out.println("A pessoa esta com sobrepreso! " + imc);
        } else {
            System.out.println("A pessoa esta com obesidade! " + imc);
        }
    }
}
