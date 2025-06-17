/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasrepeticao;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class EstruturaRepeticaoFor {
    public static void main(String[] args) {
        
        
        //for -> quantidade de repetição 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe um número para "
                + "calculo de tabuada: ");
        int valorInformado = sc.nextInt();
        
        
        for (int i = 1; i < 11; i++) {
        System.out.println(valorInformado + " x " + i + " = " + (valorInformado * i) );   
        }
    }
}
