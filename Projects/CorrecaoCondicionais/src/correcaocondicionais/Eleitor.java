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
public class Eleitor {

    public static void main(String[] args) {
//O programa deve pedir a idade do usuário e informar:
//
//"Voto obrigatório" se tiver entre 18 e 70 anos
//
//"Voto facultativo" se tiver 16-17 ou acima de 70
//
//"Não vota" se tiver menos de 16 anos

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, informe sua idade: ");
        int idade = sc.nextInt();
        
        if (idade <= 70 && idade >= 18) {
            System.out.println("O voto é obrigatório!");
        } else if (idade < 18 && idade >= 16 || idade > 70) {
            System.out.println("O voto é facultativo");
        } else {
            System.out.println("O voto é proibido!");
        }
    }
}
