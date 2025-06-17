package Model;

public class Usuario {
    private long idUsuario;
    private String nomeUsuario;
    private String enderecoUsuario;
    private String telefoneUsuario;

    public Usuario() {
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }


    @Override
    public String toString() {
        return "👤 Usuário {" +
                "\n  ID: " + idUsuario +
                "\n  Nome: '" + nomeUsuario + '\'' +
                "\n  Endereço: '" + enderecoUsuario + '\'' +
                "\n  Telefone: '" + telefoneUsuario + '\'' +
                "\n}";
    }
}
