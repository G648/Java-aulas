package POO.heranca;

public class Gerente extends Funcionario{
    private String setorGerente;

    //construtor
    public Gerente(String setorGerente, String nomeFuncionario, double salarioFuncionario) {
        super(nomeFuncionario, salarioFuncionario);
        this.setorGerente = setorGerente;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", setor: " + setorGerente;
    }
}
