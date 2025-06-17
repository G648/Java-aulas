public class Diretor extends Pessoa{
    private int TempoGestão;

    public Diretor(String nomePessoa, int idade, int tempoGestão) {
        super(nomePessoa, idade);
        TempoGestão = tempoGestão;
    }

    public int getTempoGestão() {
        return TempoGestão;
    }

    public void setTempoGestão(int tempoGestão) {
        TempoGestão = tempoGestão;
    }

    @Override
    public String Apresentar() {
        return "Sou o diretor: " + getNomePessoa() + ", há " + getTempoGestão() + " anos na gestão";
    }
}
