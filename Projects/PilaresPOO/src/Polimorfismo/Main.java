package Polimorfismo;

import POO.heranca.*;

public class Main {

    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor(100.00, "Guilherme", 1250.00);
        System.out.println(vendedor.exibirDados());
        System.out.println(vendedor.bonusFuncionarios());

//        Funcionario gerente = new Gerente("T.I", "Rodrigo", 23.876);
//        System.out.println(gerente.exibirDados());
    }
}
