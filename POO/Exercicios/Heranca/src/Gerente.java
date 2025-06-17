public class Gerente extends Funcionario{
    private String setorGerente;

    public Gerente(String setor, String nomeFuncionario, double salarioFuncionario){
        super(nomeFuncionario, salarioFuncionario);
        this.setorGerente = setor;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Setor: " + setorGerente;
    }
}
