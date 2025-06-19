package guilherme.mvcaplication.Repository;

import guilherme.mvcaplication.Model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFilmeRepository extends JpaRepository<Filme, Integer> {
}
