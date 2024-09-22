package br.com.alura.codechella.infra.gateways.endereco;

import br.com.alura.codechella.application.gateways.EnderecoRepositoryInterface;
import br.com.alura.codechella.domain.entities.endereco.Endereco;
import br.com.alura.codechella.infra.persistence.endereco.EnderecoRepositoryJPA;
import br.com.alura.codechella.infra.persistence.usuario.UsuarioRepositoryJPA;

public class EnderecoRepository implements  EnderecoRepositoryInterface{

    public final UsuarioRepositoryJPA repositoryUsuario;
    public final EnderecoRepositoryJPA repositoryEndereco;
    public final EnderecoMapper mapper;

    public EnderecoRepository(EnderecoRepositoryJPA repositoryEndereco, EnderecoMapper mapper, UsuarioRepositoryJPA repositoryUsuario) {
        this.mapper = mapper;
        this.repositoryEndereco = repositoryEndereco;
        this.repositoryUsuario = repositoryUsuario;
    }

    @Override
    public void salvarEndereco(Endereco endereco) {        
        repositoryEndereco.save(mapper.toEntity(endereco));       
    }

    @Override
    public void adicionarEndereco(Endereco endereco) {
        var usuario = repositoryUsuario.getReferenceById(endereco.getUsuario().getId());
        var enderecoEntity = mapper.toEntity(endereco);
        enderecoEntity.setUsuario(usuario);
        repositoryEndereco.save(enderecoEntity);       
    }

    @Override
    public void deletarEndereco(Long id) {
        repositoryEndereco.deleteById(id);
    }

    @Override
    public void alterarEndereco(Endereco endereco) {
        var usuario = repositoryUsuario.getReferenceById(endereco.getUsuario().getId());
        var enderecoEntity = mapper.toEntity(endereco);
        enderecoEntity.setUsuario(usuario);
        repositoryEndereco.save(enderecoEntity);       
    }

    @Override
    public Endereco enderecoPorId(Long id) {
        var endereco = repositoryEndereco.getReferenceById(id);
        return mapper.toEndereco(endereco);
    }

    
    
}
