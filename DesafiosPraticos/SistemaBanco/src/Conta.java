public abstract class Conta {

//    🎯 Objetivo:
//
//    Criar um sistema bancário simples com regras diferentes para conta corrente e conta poupança, utilizando os pilares da POO.

    private int numeroConta;
    private double saldoConta;

    //Criação do construtor
    public Conta(int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        setSaldoConta(saldoConta);
    }

    //metodos acessores getters
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldoConta() {
        return this.saldoConta;
    }

    //metodos acessores setters
    public void setNumeroConta(int numeroContaUser) {
        this.numeroConta = numeroContaUser;
    }

    public void setSaldoConta(double saldoValor) {
            if (saldoValor < 0) {
                throw new IllegalArgumentException("O saldo não pode ser negativo");
            }else {
                this.saldoConta = saldoValor;
            }
    }


    //Criação dos métodos
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoConta += valor;
        } else {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
    }

    //método abstrato para sacar dinheiro
    public abstract double sacarDinheiro(double valorSaque);

    //método abstrato para retornar o rendimento da conta
    public abstract double calcularRendimentoConta();

}
