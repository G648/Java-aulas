public abstract class Pessoa {

    private String nomePessoa;
    private int idadePessoa;

    //construtor da classe Pessoa
    public Pessoa(String nomePessoa, int idade) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idade;
    }

    //métodos acessores
    public String getNomePessoa() {
        return nomePessoa;
    }

    public int getIdade() {
        return idadePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade da pessoa não pode ser menor ou igual a 0");
        } else {
            this.idadePessoa = idade;
        }
    }

    public  abstract String Apresentar();
}
