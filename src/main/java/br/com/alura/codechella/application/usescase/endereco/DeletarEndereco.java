package br.com.alura.codechella.application.usescase.endereco;

import br.com.alura.codechella.application.gateways.EnderecoRepositoryInterface;

public class DeletarEndereco {


     private final EnderecoRepositoryInterface enderecoRepository;

    public DeletarEndereco( EnderecoRepositoryInterface enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public void deletarEndereco(long id){
        enderecoRepository.deletarEndereco(id);
    }

}
