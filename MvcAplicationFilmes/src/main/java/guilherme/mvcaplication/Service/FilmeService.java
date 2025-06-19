package guilherme.mvcaplication.Service;

import guilherme.mvcaplication.Model.Filme;
import guilherme.mvcaplication.Model.Genero;
import guilherme.mvcaplication.Repository.IFilmeRepository;
import guilherme.mvcaplication.Repository.IGeneroRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    //    A anotação @Autowired é usada no Spring Boot para realizar a injeção de dependência automaticamente.
//    Quando um objeto é anotado com @Autowired, o Spring Boot procura por uma instância correspondente
//    do tipo dessa classe no contexto da aplicação e a injeta automaticamente na classe anotada.
    @Autowired
    private IFilmeRepository filmeRepository;

    @Autowired
    private IGeneroRepository generoRepository;

    public List<Filme> listarTodosFilmes() {
        return filmeRepository.findAll();
    }

    public Filme buscarFilmePorId(int id) {
        return filmeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Filme não encontrado!"));
    }

    public Filme criarFilme(Filme filme) {
        int idGenero = filme.getIdFilme();

        Genero genero = generoRepository.findById(idGenero)
                .orElseThrow(() -> new EntityNotFoundException("Gênero com ID " + idGenero + " não encontrado"));

        filme.setGenero(genero); // Garante que o gênero esteja gerenciado

        return filmeRepository.save(filme);
    }

    public void deletarFilme(int id) {
        Filme filmeBuscado = filmeRepository.findById(id).orElseThrow();

        filmeRepository.delete(filmeBuscado);
    }

    public Filme editarFilme(Filme filme) {
        Filme findByid = filmeRepository.findById(filme.getIdFilme()).orElseThrow();

        findByid.setIdFilme(filme.getIdFilme());
        findByid.setNomeFilme(filme.getNomeFilme());
        findByid.setAnoLancamentoFilme(filme.getAnoLancamentoFilme());
        findByid.setGenero(filme.getGenero());

        return filmeRepository.save(findByid);
    }
}
