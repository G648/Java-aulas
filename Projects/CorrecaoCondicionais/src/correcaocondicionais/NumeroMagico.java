/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaocondicionais;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class NumeroMagico {

    public static void main(String[] args) {
//        Peça que o programa sorteie um número entre 1 e 10 (usando Random) e o usuário tente adivinhar.
//Se acertar, mostre "Parabéns!", senão diga se o número digitado é maior ou menor que o sorteado.

        //import random
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        //random int
        int numeroAleatorio = rd.nextInt(1, 10);

        System.out.println(numeroAleatorio);

        //entrada de dados
        System.out.println("Informe um número entre 1 e 10 para tentar adiinhar: ");
        int numeroUsuario = sc.nextInt();

        //processamento
        if (numeroAleatorio == numeroUsuario) {
            System.out.println("Bingo! Parabéns!!!! " + numeroAleatorio);
        } else if (numeroUsuario < numeroAleatorio) {
            System.out.println("O numero que o usuario digitou e menor que o numero sortido! " + numeroAleatorio);
        } else {
            System.out.println("O numero que o usuario digitou e maior que o numero sortido! " + numeroAleatorio);
        }
    }
}
