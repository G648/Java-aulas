package correcaoexerciciosrepeticao;

import java.util.Scanner;

public class CorrecaoExerciciosRepeticao {

    public static void main(String[] args) {

    //Solicitar ao usuário números até que ele digite um número negativo. 
    //Ao final, exibir a soma de todos os positivos.

        Scanner sc = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        
        System.out.println("Digite numeros positivos (infome um numero negativo para sair)");
        
        do {      
            numero = sc.nextInt();
            System.out.println("Digite o proximo numero: ");
            
            if (numero >= 0) {
                soma += numero;
            }
            
        } while (numero >= 0 );
        
        System.out.println("A soma dos numeros positivos é de: " + soma);
        
    }
    

}
