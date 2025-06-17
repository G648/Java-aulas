package com.mycompany.condandoperators;

import java.util.Scanner;

/**
 *
 * @author Guilherme Amorim
 */
public class Conditional {
        public static void main(String[] args) {
            System.out.println("Operadores");
            
            
            //Operadores Relacionais (comparação)
            // >, <, >=, <=, != , ==
//            int idadePessoa01 = 14;
//            int idadePessoa02 = 14;
//            
//            System.out.println(idadePessoa01 != idadePessoa02); 
//            System.out.println(idadePessoa01 < idadePessoa02); 
//            System.out.println(idadePessoa01 <= idadePessoa02); 
//            System.out.println(idadePessoa01 >= idadePessoa02);
            
            //Operadores lógicos
            // && - And
            // || - Or
            // !  - Not
            
//            int idade = 15; 
//            boolean rg = false;
//            
//            //                   False            False
//            //                  15 >= 18   or  false == true
//            System.out.println(idade >= 18 || rg == true);
            
            
            //Condicionais
            //if - else - else if 
            
            Scanner sc = new Scanner(System.in);
            
//            System.out.println("Olá usuario! Informe um número qualquer: ");
//            int numero = sc.nextInt();
//            
//            //if - simples
//            if (true) {
//                
//            }

//            //if - composto
//             if (numero % 2 == 0) {
//                //bloco de código SE a expressão for verdadeira
//                System.out.println("O número é par!");
//            } else {
//                System.out.println("O número é impar!");
//            }
             
//            String semaforo = "VEMELHO";
//            System.out.println(semaforo.toLowerCase());
//            //if - encadeado
//            if ("verde".equals(semaforo.toLowerCase())) {
//                System.out.println("Pode passar!");
//            } else if ("amarelo".equals(semaforo.toLowerCase())) {
//                System.out.println("Tenha cuidado!");
//            } else if ("vemelho".equals(semaforo.toLowerCase())) {
//                System.out.println("Parar e esperar");
//            } else {
//                System.out.println("nenhuma condição foi atendida!");
//            }
            

//            String emailUsuario = "gui@gui";
//            String senhaUsuario = "batatinha02";
//            
//            if (emailUsuario == "gui@gui" || senhaUsuario == "batatinha03") {
//                System.out.println("Seja bem vindo ao sistema de compras!");
//            } else {
//                System.out.println("E-mail ou senha incorretos! Tente novamente");
//            }


              int dia = 8; //segunda-feira
            
              switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Nenhuma opção foi atendida");
            }
    }
}
