public class Pessoa {
    // cricação dos atributos privados
    private String nomePessoa;
    private int idadePessoa;
    private String cpfPessoa;

    //criação do construtor para acesso dos métodos
    public void Pessoa(String nome, int idade, String cpf) {
        this.nomePessoa = nome;
        this.idadePessoa = idade;
        this.cpfPessoa = cpf;
    }

    //Criação dos métodos acessores - getters
    public String getNomePessoa() {
        return nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    //Criação dos métodos acessores - setters
    public void setNomePessoa(String nome) {
        this.nomePessoa = nome;
    }

    public void setIdadePessoa(int idade) {
        if (idade <= 0) {
            System.out.println("Nao e possivel valores negativos");
        } else {
            this.idadePessoa = idade;
        }
    }

    public void setCpfPessoa(String cpf) {
        this.cpfPessoa = cpf;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setNomePessoa("Guilherme");
        p.setIdadePessoa(10);

        System.out.println(p.nomePessoa);
        System.out.println(p.idadePessoa);
    }
}