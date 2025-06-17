package POO.heranca;

//Crie uma classe chamada funcionario ✅
//Crie atributos nome e salario
//depois crie:
//  gerente -> herda de funcionário e tem atributo adicional setor
//  vendedor -> herda de funcionário e tem atributo comissao

public class Funcionario {
    protected String nomeFuncionario;
    protected double salarioFuncionario;

    //construtor da classe
    public Funcionario(String nomeFuncionario, double salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }
    
    //Método para visualizar dados
    public String exibirDados() {
        return "Nome: " + nomeFuncionario + ", Salario: " + salarioFuncionario;
    }
}
