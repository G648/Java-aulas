package Polimorfismo;

//Crie uma classe chamada funcionario ✅

import POO.heranca.*;
//Crie uma classe chamada funcionario ✅
//Crie atributos nome e salario ✅
//depois crie: 
//  gerente -> herda de funcionário e tem atributo adicional setor ✅
//  vendedor -> herda de funcionário e tem atributo comissao ✅



//Crie um metodo calcularBonus() na mesma 
//hierarquia de funcionario

//Em funcionario, retorna 5% do salário
//em gerente, sobrescreva para retornar 10% de bonus
//em vendedor, sobrescreva para retornar 7% + a comissão

public class Funcionario {
    protected String nomeFuncionario;
    protected double salarioFuncionario;
    protected double bonusFuncionario;

    //construtor da classe
    public Funcionario(String nomeFuncionario, double salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }
    
    //Método para visualizar dados
    public String exibirDados() {
        return "Nome: " + nomeFuncionario + ", Salario: " + salarioFuncionario;
    }
    
    public double bonusFuncionarios() {
        return this.salarioFuncionario * 1.05;
    }
}
