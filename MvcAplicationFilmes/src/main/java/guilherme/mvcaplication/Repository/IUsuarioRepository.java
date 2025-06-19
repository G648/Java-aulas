package guilherme.mvcaplication.Repository;

import guilherme.mvcaplication.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
}
