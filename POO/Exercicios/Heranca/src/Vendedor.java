public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(double comissao, String nomeFuncionario, double salarioFuncionario) {
        super(nomeFuncionario, salarioFuncionario);
        this.comissao = comissao;
    }
}
