package estruturasrepeticao;

import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args) {
        //FOR - WHILE - DO WHILE

        //WHILE - enquanto ???? condição for verdade
//        int contador = 1;
//        
//        while (contador <= 5) {            
//            System.out.println("Contador: " + contador);
//            
//            //incremento
//            contador++;
//        }
        //Crie um programa que imprima os números de 1 a 10 usando while
//        int aux = 1;
//        
//        while (aux <= 10) {            
//            System.out.println("Numero: " + aux);
//            
//            aux++;
//        }

        String email, senha;
        String emailUsuario = "admin";
        String senhaUsuario = "admin";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Informe o seu email para login: ");
            email = sc.next();

            System.out.println("Informe sua senha para login: ");
            senha = sc.next();
        } while (!emailUsuario.equals(email) || !senhaUsuario.equals(senha));

        //           False                        False
//        while (!emailUsuario.equals(email) || !senhaUsuario.equals(senha)) {
//            System.out.println("Usuário ou senha incorretos! Tente novamente!");
//
//            System.out.println("Informe o seu email para login: ");
//            email = sc.next();
//
//            System.out.println("Informe sua senha para login: ");
//            senha = sc.next();
//        }
        System.out.println("Acabou o programa!");
    }

}
