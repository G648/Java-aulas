package Model;

public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private int idadeUsuario;

    //Construtor
    public Usuario() {
    }

    //métodos getters e setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public int getIdadeUsuario() {
        return idadeUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setIdadeUsuario(int idadeUsuario) {
        this.idadeUsuario = idadeUsuario;
    }

    @Override
    public  String toString() {
        return "ID: " + this.idUsuario + " | Nome: " + this.nomeUsuario + " | Idade: " + this.idadeUsuario;
    }
}
