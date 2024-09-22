package br.com.alura.codechella.infra.gateways.usuario;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.codechella.domain.entities.endereco.EnderecoDTO;
import br.com.alura.codechella.infra.persistence.usuario.UsuarioEntity;

public record UsuarioCompletoDTO(

    String cpf,
    String nome,
    LocalDate nascimento,
    String email,
    List<EnderecoDTO> enderecos

) {

    public UsuarioCompletoDTO(UsuarioEntity entity) {
        this(entity.getCpf(),entity.getNome(),entity.getNascimento(), entity.getEmail(),
     entity.getEnderecos().stream().map( e -> new EnderecoDTO(e.getCep(), e.getNumero(),e.getComplemento())).collect(Collectors.toList()));    
    }
 

}
