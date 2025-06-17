public class Funcionario {

    protected String nomeFuncionario;
    protected double salarioFuncionario;

    //construtor da classe
    public Funcionario(String nome, double salario) {
        this.nomeFuncionario = nome;
        this.salarioFuncionario = salario;
    }

    //criação dos métodos
    public String exibirDados() {
            return  "Nome: " + nomeFuncionario + ", salário: " + salarioFuncionario;
    }

}
