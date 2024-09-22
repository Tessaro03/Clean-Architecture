package br.com.alura.codechella.application.usescase.usuario;

import br.com.alura.codechella.application.gateways.UsuarioRepositoryInterface;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.domain.entities.usuario.UsuarioDTO;

public class AlterarUsuario {

    private final UsuarioRepositoryInterface repository;

    public AlterarUsuario(UsuarioRepositoryInterface repository) {
        this.repository = repository;
    }

    public Usuario alterarUsuario(Long idUsuario, UsuarioDTO dto){
        var usuario = repository.getUsuario(idUsuario);
        if (dto.nome() != null) {
            usuario.setNome(dto.nome());
        }
        if (dto.cpf() != null) {
            usuario.setCpf(dto.cpf());
        }
        if (dto.nascimento() != null) {
            usuario.setNascimento(dto.nascimento());
        }
        if (dto.email() != null) {
            usuario.setEmail(dto.email());
        }
        var usuarioSalvo = repository.alterarUsuario(usuario);
        return usuarioSalvo;
    }
}
