package br.com.alura.codechella.application.gateways;

import java.util.List;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.usuario.UsuarioCompletoDTO;

public interface UsuarioRepositoryInterface {
    
    public Usuario cadastrarUsuario(Usuario usuario);

    public List<UsuarioCompletoDTO> verUsuarios();
    
    public Usuario getUsuario(Long idUsuario);

    public void deletarUsuario(Long idUsuario);

    public Usuario alterarUsuario(Usuario usuario);




}
