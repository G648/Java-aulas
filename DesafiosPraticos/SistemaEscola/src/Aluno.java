public class Aluno extends Pessoa{
    private int Matricula;

    public Aluno(String nomePessoa, int idade, int matricula) {
        super(nomePessoa, idade);
        Matricula = matricula;
    }

    //getter
    public int getMatricula() {
        return Matricula;
    }

    //setter
    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    @Override
    public String Apresentar() {
        return "Sou o aluno: " + getNomePessoa() + ", tenho " + getIdade() + " anos, matricula: " + getMatricula();
    }
}
