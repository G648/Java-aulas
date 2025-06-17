package pilarespoo.encapsulamentoPoo;

//CRIAR UMA CLASSE PESSOA ✅
//ATRIBUTOS PRIVADOS: NOME, IDADE E CPF ✅
//CRIAR MÉTODOS PÚBLICOS (GETTERS E SETTERS) PARA CADA ATRIBUTO ✅
//NÃO PERMITIR QUE IDADE RECEBA VALORES NEGATIVOS (SETTER) ✅

public class Pessoa {

    //modificadores de acesso junto aos atributos
    private String nomePessoa;
    private int idadePessoa;
    private String cpfPessoa;

    //construtor da classe
    public void Pessoa(String nome, int idade, String cpf) {
        this.nomePessoa = nome;
        this.idadePessoa = idade;
        this.cpfPessoa = cpf;
    }

    //metodos getters
    public String getNomePessoa() {
        return nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public String getCpfPessoa() {
        if (cpfPessoa == null) {
            return "Nenhum dado cadastrado";
        } else {
            return cpfPessoa;
        }
    }

    //metodos setters
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        if (idadePessoa <= 0) {
            System.out.println("Não é possível valores negativos");
        } else {
            this.idadePessoa = idadePessoa;
        }
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setNomePessoa("Guilherme");
        p.setIdadePessoa(22);
//        p.setCpfPessoa("4587745745");

        System.out.println(p.getNomePessoa());
        System.out.println(p.getIdadePessoa());
        System.out.println(p.getCpfPessoa());
    }

}
