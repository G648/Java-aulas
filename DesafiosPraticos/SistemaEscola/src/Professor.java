public class Professor extends Pessoa {
    private String Disciplina;

    public Professor(String nomePessoa, int idade, String disciplina) {
        super(nomePessoa, idade);
        Disciplina = disciplina;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }

    @Override
    public String Apresentar() {
        return "Sou o professor: " + getNomePessoa() + ", leciono: " + getDisciplina();
    }
}
