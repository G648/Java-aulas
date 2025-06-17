package Dao;
import java.util.List;
import Model.Usuario;

public interface IUsuarioDAO {
    //OBJETO DE ACESSO AOS DADOS
    //SEPARAÇÃO ENTRE A CAMADA DE DADOS E A REGRA DO NEGÓCIO DA APLICAÇÃO
    //TODAS AS FUNCIONALIDADES PARA MANIPULAÇÃO DE DADOS DEVEM SER FEITAS PELA CLASSE DAO

    // PADRÃO DE PROJETO QUE ENCAPSULA A CAMADA DE DADOS
    //BASICAMENTE AQUI VAMOS SPECIFICAR OS MÉTODOS QUE QUEREMOS TER DENTRO DO NOSSO DAO

    //listar
    public List<Usuario> getAllusers();

    //listar por id
    public Usuario getUserById(int id);

    //cadastrar
    public void registerNewUser(Usuario usuario);

    //deletar
    public void deleteUser(int id);

    //atualizar
    public void updateuser(Usuario usuario);
}
