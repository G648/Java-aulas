public class ContaPoupanca extends Conta{
    private static final double rendimentoMensal = 0.005;

    public ContaPoupanca(int numeroConta, double saldoConta) {
        super(numeroConta, saldoConta);
    }

    @Override
    public double sacarDinheiro(double valorSaque) {
        if (valorSaque > 0 && getSaldoConta() >= valorSaque) {
             setSaldoConta(getSaldoConta() - valorSaque);
             return getSaldoConta();
        } else {
            throw new IllegalArgumentException("Saldo insuficiente ou valor inválido para saque!");
        }
    }

    @Override
    public double calcularRendimentoConta() {
        return getSaldoConta() * rendimentoMensal;
    }
}
