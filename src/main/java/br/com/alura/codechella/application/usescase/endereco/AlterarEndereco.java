package br.com.alura.codechella.application.usescase.endereco;

import br.com.alura.codechella.application.gateways.EnderecoRepositoryInterface;
import br.com.alura.codechella.domain.entities.endereco.Endereco;
import br.com.alura.codechella.domain.entities.endereco.EnderecoDTO;

public class AlterarEndereco {
    

    private final EnderecoRepositoryInterface enderecoRepository;

    public AlterarEndereco( EnderecoRepositoryInterface enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco alterarEndereco( Long idEndereco, EnderecoDTO dto){
        var endereco = enderecoRepository.enderecoPorId(idEndereco);
        if (dto.cep() != null) {
            endereco.setCep(dto.cep());
        } 
        if (dto.numero() != null) {
            endereco.setNumero(dto.numero());
        }
        if (dto.complemento() != null) {
            endereco.setComplemento(dto.complemento());
        }
        enderecoRepository.alterarEndereco(endereco);
        return endereco;
    }
}
