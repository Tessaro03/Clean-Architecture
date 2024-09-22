package br.com.alura.codechella.infra.gateways.usuario;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.usuario.UsuarioEntity;

public class UsuarioMapper {


    public UsuarioEntity toEntity(Usuario usuario){
        return new UsuarioEntity(usuario.getId(),usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }

    public Usuario toUsuario(UsuarioEntity entity){
        return new Usuario.UsuarioBuilder(entity.getId())
            .nome(entity.getNome())
            .cpf(entity.getCpf())
            .email(entity.getEmail())
            .nascimento(entity.getNascimento())
            .build(); 
    }

}
