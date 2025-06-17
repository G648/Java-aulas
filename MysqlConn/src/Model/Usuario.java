package Model;

public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private int idadeUsuario;

    public Usuario(){};

    public Usuario(int idUsuario, String nomeUsuario, int idadeUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.idadeUsuario = idadeUsuario;
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

    public int getIdUsuario() { return idUsuario; }

    public String getNomeUsuario() { return nomeUsuario; }

    public int getIdadeUsuario() { return idadeUsuario;}

    @Override
    public String toString() {
        return "ID: " + this.idUsuario + " | Nome: " + this.nomeUsuario + " | Idade: " + this.idadeUsuario;
    }

}
