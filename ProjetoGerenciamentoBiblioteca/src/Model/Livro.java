package Model;

public class Livro {
    private long idLivro;
    private String nomeLivro;
    private String autorLivro;
    private String editoraLivro;
    private Long idUsuario; // Nullable: livro pode não estar emprestado

    public Livro() {
    }

    public long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(long idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "📚 Livro {" +
                "\n  ID: " + idLivro +
                "\n  Nome: '" + nomeLivro + '\'' +
                "\n  Autor: '" + autorLivro + '\'' +
                "\n  Editora: '" + editoraLivro + '\'' +
                "\n  Emprestado para ID de usuário: " + (idUsuario != null ? idUsuario : "Nenhum") +
                "\n}";
    }
}
