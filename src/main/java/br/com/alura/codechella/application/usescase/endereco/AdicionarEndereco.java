package br.com.alura.codechella.application.usescase.endereco;

import br.com.alura.codechella.application.gateways.EnderecoRepositoryInterface;
import br.com.alura.codechella.application.gateways.UsuarioRepositoryInterface;
import br.com.alura.codechella.domain.entities.endereco.Endereco;
import br.com.alura.codechella.domain.entities.endereco.EnderecoDTO;

public class AdicionarEndereco {
    

    private final EnderecoRepositoryInterface enderecoRepository;
    private final UsuarioRepositoryInterface usuarioRepository;

    public AdicionarEndereco( EnderecoRepositoryInterface enderecoRepository, UsuarioRepositoryInterface usuarioRepository) {
        this.enderecoRepository = enderecoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public void adicionarEndereco(EnderecoDTO dto, Long idUsuario){
        var usuario = usuarioRepository.getUsuario(idUsuario);
        var endereco = new Endereco(dto.cep(), dto.numero(), dto.complemento(), null, usuario);
        enderecoRepository.adicionarEndereco(endereco);
    }
    

}
