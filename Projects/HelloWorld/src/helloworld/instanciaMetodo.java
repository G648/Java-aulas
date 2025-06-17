/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author Guilherme Amorim
 */
public class instanciaMetodo {
    public static void main(String[] args) {
        
        //usar o método estático diretamente pela classe
        int soma = testeMetodo.soma(15, 15);
        System.out.println(soma);
        
        
//      cria um objeto para usar os métodos não estáticos
        testeMetodo multiplicacao = new testeMetodo();
        int multi = multiplicacao.multiplicacao(2, 5);
        System.out.println(multi);
    }
}
