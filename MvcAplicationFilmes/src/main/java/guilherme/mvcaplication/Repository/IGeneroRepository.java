package guilherme.mvcaplication.Repository;

import guilherme.mvcaplication.Model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//                                                    entidade + tipo ID
public interface IGeneroRepository extends JpaRepository<Genero, Integer> {
}
