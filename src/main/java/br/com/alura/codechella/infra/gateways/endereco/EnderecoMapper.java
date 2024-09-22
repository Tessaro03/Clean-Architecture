package br.com.alura.codechella.infra.gateways.endereco;

import br.com.alura.codechella.domain.entities.endereco.Endereco;
import br.com.alura.codechella.infra.gateways.usuario.UsuarioMapper;
import br.com.alura.codechella.infra.persistence.endereco.EnderecoEntity;

public class EnderecoMapper {

    private final UsuarioMapper usuarioMapper;


    public EnderecoMapper(UsuarioMapper usuarioMapper) {
        this.usuarioMapper = usuarioMapper;
    }


    public EnderecoEntity toEntity(Endereco endereco){
        return new EnderecoEntity(endereco.getId(),endereco.getCep(), endereco.getNumero(),
         endereco.getComplemento(), usuarioMapper.toEntity(endereco.getUsuario()));
    }


    public Endereco toEndereco(EnderecoEntity entity){
        return new Endereco(entity.getCep(), entity.getNumero(), entity.getComplemento(), entity.getId(), usuarioMapper.toUsuario(entity.getUsuario()));
    }

   

}
