package br.com.alura.codechella.application.gateways;

import br.com.alura.codechella.domain.entities.endereco.Endereco;

public interface  EnderecoRepositoryInterface {

    public void salvarEndereco(Endereco endereco);

    public void adicionarEndereco(Endereco endereco);

    public void deletarEndereco(Long id);

    public void alterarEndereco(Endereco endereco);

    public Endereco enderecoPorId(Long id);

    
}
