package guilherme.mvcaplication.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data // o data já inclui o getter e setter
@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFilme;

    @NotBlank(message = "O nome do filme é obrigatório") //notblank é utilizado apenas para strings
    private String nomeFilme;

    @NotNull( message = "O ano de lançamento do filme é obrigatório") //notnull é utilizado para valores int
    @Min(value = 1888, message = "Ano de lançamento inválido!")
    private Integer anoLancamentoFilme;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "genero_id")
    private Genero genero;
}
