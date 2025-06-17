import DaoImpl.UsuarioDAOImpl;
import Model.Usuario;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        UsuarioDAOImpl userDao = new UsuarioDAOImpl();

        //Cadastrando usuários
        Usuario novoUser = new Usuario();

        novoUser.setNomeUsuario("Teste");
        novoUser.setIdadeUsuario(28);
        userDao.registerNewUser(novoUser);

        //listando todos os usuários
        List<Usuario> usuarios = userDao.getAllusers();
        for (Usuario users : usuarios) {
            System.out.println("idUsuario: " + users.getIdUsuario() + " | nomeUsuario: " + users.getNomeUsuario() + " | idadeUsuario: " + users.getIdadeUsuario());
        }

        // Buscar um usuário por ID
        int idParaBuscar = 1; // você pode trocar esse ID por outro que exista no seu banco
        Usuario usuarioEncontrado = userDao.getUserById(idParaBuscar);

        // Verifica se encontrou ou não
        if (usuarioEncontrado != null) {
            System.out.println("Usuário encontrado:");
            System.out.println(usuarioEncontrado); // toString será chamado automaticamente
        } else {
            System.out.println("Nenhum usuário encontrado com o ID: " + idParaBuscar);
        }
    }
}
