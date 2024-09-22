package br.com.alura.codechella.application.usescase.usuario;

import java.util.List;

import br.com.alura.codechella.application.gateways.UsuarioRepositoryInterface;
import br.com.alura.codechella.infra.gateways.usuario.UsuarioCompletoDTO;

public class VerUsuarios {
    
    private final UsuarioRepositoryInterface repository;

    public VerUsuarios(UsuarioRepositoryInterface repository) {
        this.repository = repository;
    }

    public List<UsuarioCompletoDTO> verUsuarios(){
        return repository.verUsuarios();
    }

}
