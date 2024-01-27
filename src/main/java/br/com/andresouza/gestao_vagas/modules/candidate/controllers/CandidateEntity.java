package br.com.andresouza.gestao_vagas.modules.candidate.controllers;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

  private UUID id;
  private String name;

  @NotBlank()
  @Pattern(regexp = "\\S+", message = "O campo [username] não deve ser vazio!")
  private String username;

  @Email(message = "O campo [email] deve conter um email válido!")
  private String email;

  @Length(min = 6, message = "O campo [password] deve conter no mínimo 6 caracteres!")
  private String password;
  private String description;
  private String curriculum;

}
