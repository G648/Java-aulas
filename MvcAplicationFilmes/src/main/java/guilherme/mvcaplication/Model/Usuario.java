package guilherme.mvcaplication.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "O valor deve ser informado")
    private String nomeUsuario;

    @NotBlank(message = "O valor deve ser informado")
    private String emailUsuario;

    @NotBlank(message = "O valor deve ser informado")
    private String senhaUsuario;
}
