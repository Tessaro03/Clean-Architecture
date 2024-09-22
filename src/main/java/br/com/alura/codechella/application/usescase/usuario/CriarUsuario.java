package br.com.alura.codechella.application.usescase.usuario;

import br.com.alura.codechella.application.gateways.UsuarioRepositoryInterface;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.domain.entities.usuario.UsuarioDTO;

public class CriarUsuario {
    
    private final UsuarioRepositoryInterface repository;

    public CriarUsuario(UsuarioRepositoryInterface repository) {
        this.repository = repository;
    }

    public Usuario criarUsuario(UsuarioDTO dto){
        Usuario usuario = new Usuario.UsuarioBuilder(null)
            .cpf(dto.cpf())
            .email(dto.email())
            .nome(dto.nome())
            .nascimento(dto.nascimento())
            .build();
            
        var usuarioSalvo = repository.cadastrarUsuario(usuario);
        return usuarioSalvo;
    }


}
