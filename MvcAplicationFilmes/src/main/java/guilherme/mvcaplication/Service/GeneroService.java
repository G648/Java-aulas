package guilherme.mvcaplication.Service;

import guilherme.mvcaplication.Repository.IGeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    @Autowired
    private IGeneroRepository generoRepository;


    //Método de criação de um novo genero
//    public GeneroDTO createGenero(Genero genero) {
//
//
//    }
}
