package POO.heranca;

public class Main {

    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor(250.00, "Guilherme", 30.000);
        System.out.println(vendedor.exibirDados());

        Funcionario gerente = new Gerente("T.I", "Rodrigo", 23.876);
        System.out.println(gerente.exibirDados());

    }
}
