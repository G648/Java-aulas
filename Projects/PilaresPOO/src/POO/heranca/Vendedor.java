package POO.heranca;

public class Vendedor extends Funcionario{
    private double comissaoVendedor;

    //construtor
    public Vendedor(double comissaoVendedor, String nomeFuncionario, double salarioFuncionario) {
        super(nomeFuncionario, salarioFuncionario);
        this.comissaoVendedor = comissaoVendedor;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Comissao: " + comissaoVendedor;
    }
}
