package br.com.alura.codechella.application.usescase.usuario;

import br.com.alura.codechella.application.gateways.UsuarioRepositoryInterface;

public class DeletarUsuario {
    
    private final UsuarioRepositoryInterface repository;

    public DeletarUsuario(UsuarioRepositoryInterface repository) {
        this.repository = repository;
    }

    public void deletarUsuario(Long idUsuarios){
        repository.deletarUsuario(idUsuarios);
    }

}
