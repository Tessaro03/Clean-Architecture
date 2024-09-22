package br.com.alura.codechella.infra.gateways.usuario;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.codechella.application.gateways.UsuarioRepositoryInterface;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.usuario.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.usuario.UsuarioRepositoryJPA;
import jakarta.transaction.Transactional;

public class UsuarioRepository implements UsuarioRepositoryInterface {

    private final UsuarioRepositoryJPA repositoryJPA;

    private final UsuarioMapper mapper;


    public UsuarioRepository(UsuarioRepositoryJPA usuarioRepositoryJPA, UsuarioMapper mapper) {
        this.repositoryJPA = usuarioRepositoryJPA;
        this.mapper = mapper;
    }


    @Override
    @Transactional
    public Usuario cadastrarUsuario(Usuario usuario) {
        var usuarioSalvo = repositoryJPA.save(mapper.toEntity(usuario));
        return mapper.toUsuario(usuarioSalvo);
    }

    @Override
    public List<UsuarioCompletoDTO> verUsuarios() {
        List<UsuarioEntity> listaEntity = repositoryJPA.findAll();
        return listaEntity.stream().map(UsuarioCompletoDTO::new).collect(Collectors.toList());
    }

    @Override
    public Usuario getUsuario(Long idUsuario) {
        var usuario = repositoryJPA.getReferenceById(idUsuario);
        return mapper.toUsuario(usuario);
    }


    @Override
    public void deletarUsuario(Long idUsuario) {
        repositoryJPA.deleteById(idUsuario);
    }


    @Override
    public Usuario alterarUsuario(Usuario usuario) {
        var entity = repositoryJPA.save(mapper.toEntity(usuario));
        return mapper.toUsuario(entity);
    }


  
    

}
