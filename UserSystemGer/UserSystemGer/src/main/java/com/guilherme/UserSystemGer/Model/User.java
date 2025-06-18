package com.guilherme.UserSystemGer.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @NotBlank(message = "Nome usuário é obrigatório!")
    private String nameUser;

    @NotBlank(message = "Email usuário é um campo obrigatório!")
    private String emailUser;

    @NotBlank(message = "Senha é um campo obrigatório!")
    private String passwordUser;
}
