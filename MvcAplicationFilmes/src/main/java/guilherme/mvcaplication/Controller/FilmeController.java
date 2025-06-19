package guilherme.mvcaplication.Controller;

import guilherme.mvcaplication.Model.Filme;
import guilherme.mvcaplication.Service.FilmeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Filmes", description = "Endpoint para realizar as operações de manipulação de dados")
@RequestMapping("/filmes")
@RestController
@CrossOrigin("*")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    @Operation(summary = "Listar todos os filmes", description = "Endpoint para listar todos os filmes")
    public ResponseEntity<List<Filme>> getAllFilmes(){
        return new ResponseEntity<>(filmeService.listarTodosFilmes(), HttpStatus.OK);
    }

    @GetMapping("/{idUsuario}")
    @Operation(summary = "Listar por ID", description = "Endpoint para listar filme por ID")
    public ResponseEntity<Filme> getFilme(@PathVariable int idUsuario){
        return new ResponseEntity<>(filmeService.buscarFilmePorId(idUsuario), HttpStatus.OK);
    }

    @PostMapping
    @Operation(summary = "Cadastrar filme", description = "Endpoint para cadastrar um filme")
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme){
        return new ResponseEntity<>(filmeService.criarFilme(filme), HttpStatus.CREATED);
    }


}
