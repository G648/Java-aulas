//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente(1001, 500.00);
        Conta contaPoupanca = new ContaPoupanca(1002, 800.00);

        contaCorrente.depositar(200.00);
        contaPoupanca.depositar(300.00);

        contaPoupanca.sacarDinheiro(100.00);

        System.out.println("conta Corrente:");
        System.out.println("Saldo atual: R$" + contaCorrente.getSaldoConta());
        System.out.println("Rendimento atual: R$" + contaCorrente.calcularRendimentoConta());

        System.out.println("Conta Poupança: ");
        System.out.println("Saldo atual: R$" + contaPoupanca.getSaldoConta());
        System.out.println("Rendimento atual: R$" + contaPoupanca.calcularRendimentoConta());
    }
}