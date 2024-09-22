package br.com.alura.codechella.domain.entities.usuario;

import java.time.LocalDate;

public record UsuarioDTO(

    String cpf,
    String nome,
    LocalDate nascimento,
    String email


) {

    public UsuarioDTO(Usuario usuario) {
        this(usuario.getCpf(),usuario.getNome(),usuario.getNascimento(), usuario.getEmail());
    }

}