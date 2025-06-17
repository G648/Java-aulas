package correcaoexerciciosrepeticao;

import java.util.Scanner;

public class NumPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Entre com um numero ");
//        int num = scan.nextInt();
//        for (int i = 2; i <= num; i++) {
//            boolean primo = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    primo = false;
//                }
//            }
//            if (primo) {
//                System.out.println(i);
//            }
//        }


        System.out.println("Informe um numero para verificar se é primo: ");
        int numero = sc.nextInt();
        
        boolean primo = true;
        
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    
                    break;
                }
            }
        }
        
        if (primo) {
            System.out.println(numero + " E um numero primo");
        } else {
            System.out.println(numero + " Nao e um numero primo");
        }
    }
}
