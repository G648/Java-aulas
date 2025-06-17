package com.mycompany.sistemalivros;

//Classe livros que vai representar o nosso objeto do mundo real (Livro)
//Essa classe vai receber atributos, construtores e métodos 
public class Livro {

    //Atributos privados da classe: só podem ser acessados
    //por métodos da própria classe
    private String nomeLivro, autorLivro, descricaoLivro;

    //Construtor da classe: chamado quando um novo objeto Livro é criado
    //Ele inicializa os atributos com os valores passados como parâmetros
    public Livro(String nome, String autor, String descricao) {
        this.nomeLivro = nome;
        this.autorLivro = autor;
        this.descricaoLivro = descricao;
        //this.atributo => refere-se ao atributo privado da classe
    }

    //Métodos acessores Getters -> permitir ler um valor
    //de um atributo de forma segura
    public String getNome() {
        return nomeLivro;
    }

    public String getAutor() {
        return autorLivro;
    }

    public String getDescricao() {
        return descricaoLivro;
    }

    //Métodos Setters -> permitem alterar (atualizar) os valores dos atributos
    public void setNome(String nome) {
        this.nomeLivro = nome;
    }

    public void setAutor(String autor) {
        this.autorLivro = autor;
    }

    public void setDescricao(String descricao) {
        this.descricaoLivro = descricao;
    }

    // Método toString Sobrescrito: define como o objeto (Livro) será 
    //Representado em forma de texto
    //útil para imprimir o objeto diretamente(system.out.println(Livro))
    @Override
    public String toString() {
        return " Livro ["
                + "Nome Livro = " + nomeLivro + " | "
                + "Autor Livro = " + autorLivro + " | "
                + "Descrição Livro = " + descricaoLivro
                + "]";
    }

}
