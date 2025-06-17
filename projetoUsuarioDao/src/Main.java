import DaoImpl.UsuarioDaoImpl;
import Model.Usuario;

public class Main {
    public static void main(String[] args) {
        //Listar todos os usuários
        UsuarioDaoImpl userDao = new UsuarioDaoImpl();

        for (Usuario allUser : userDao.getAllUsers()) {
            System.out.println("IdUsuario: " + allUser.getIdUsuario() + " | nomeUsuario: "
                    + allUser.getNomeUsuario() + " | idadeUsuario: " + allUser.getIdadeUsuario()
            );
        }


        //Listar usuário por id
        Usuario usuarioBuscado = userDao.getUserById(3);

        if (usuarioBuscado != null) {
            System.out.println("Usuário encontrado!");
            System.out.println(usuarioBuscado);
        } else {
            System.out.println("Nenhum usuário encontrado! ");
        }


        //Criação de usuário
//        Usuario usuario = new Usuario();
//
//        usuario.setNomeUsuario("Rogerio");
//        usuario.setIdadeUsuario(87);
//
//        userDao.registerNewUser(usuario);


        //deletar usuario
//        userDao.deleteUser(4);

        //Atualizar usuario
        Usuario usuario = new Usuario();

        usuario.setNomeUsuario("Teste");
        usuario.setIdadeUsuario(28);
        usuario.setIdUsuario(1);

        userDao.updateUser(usuario);
    }
}