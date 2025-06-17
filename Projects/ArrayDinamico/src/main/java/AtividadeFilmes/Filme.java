package AtividadeFilmes;

public class Filme {

    //Primeiro passo para criação do objeto: Criação dos atributos que o objeto terá
    private String NomeFilme;
    private String DiretorFilme;
    private int AnoLancamentoFilme;
    private String GeneroFilme;

    //Segundo passo é criar o construtor da classe, toda vez que criarmos um objeto o construtor será chamado
    public Filme(String NomeFilme, String DiretorFilme, int AnoLancamentoFilme, String GeneroFilme) {
        this.NomeFilme = NomeFilme;
        this.DiretorFilme = DiretorFilme;
        this.AnoLancamentoFilme = AnoLancamentoFilme;
        this.GeneroFilme = GeneroFilme;
    }

    //Depois disso, precisamos criar os métodos get e set para atribuir valores e para retornar valores
    public String getNomeFilme() {
        return NomeFilme;
    }

    public String getDiretorFilme() {
        return DiretorFilme;
    }

    public int getAnoLancamentoFIlme() {
        return AnoLancamentoFilme;
    }

    public String getGeneroFilme() {
        return GeneroFilme;
    }

    //Agora os setters
    public void setNomeFilme(String nomeFilme) {
        this.NomeFilme = nomeFilme;
    }

    public void setDiretorFilme(String diretorFilme) {
        this.DiretorFilme = diretorFilme;
    }

    public void setAnoLancamentoFilme(int anoLancamentoFilme) {
        this.AnoLancamentoFilme = anoLancamentoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.GeneroFilme = generoFilme;
    }

    // Método toString sobrescrito: define como o objeto será representado em forma de texto
    // Útil para imprimir o objeto diretamente (ex: System.out.println(livro))
    @Override
    public String toString() {
        return "Filme{" // Texto inicial da representação
                + "\n nome='" + NomeFilme + '\'' // Concatena o nome
                + "\n Diretor='" + DiretorFilme + '\'' // Concatena o autor
                + "\n Ano de lançamento='" + AnoLancamentoFilme + '\'' // Concatena a descrição
                + "\n Genero='" + GeneroFilme + '\'' // Concatena a descrição
                + '}';                          // Fecha a representação
    }
}