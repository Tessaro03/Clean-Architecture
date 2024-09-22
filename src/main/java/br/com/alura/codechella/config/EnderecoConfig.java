package br.com.alura.codechella.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.codechella.application.gateways.EnderecoRepositoryInterface;
import br.com.alura.codechella.application.gateways.UsuarioRepositoryInterface;
import br.com.alura.codechella.application.usescase.endereco.AdicionarEndereco;
import br.com.alura.codechella.application.usescase.endereco.AlterarEndereco;
import br.com.alura.codechella.application.usescase.endereco.DeletarEndereco;
import br.com.alura.codechella.infra.gateways.endereco.EnderecoMapper;
import br.com.alura.codechella.infra.gateways.endereco.EnderecoRepository;
import br.com.alura.codechella.infra.gateways.usuario.UsuarioMapper;
import br.com.alura.codechella.infra.persistence.endereco.EnderecoRepositoryJPA;
import br.com.alura.codechella.infra.persistence.usuario.UsuarioRepositoryJPA;

@Configuration
public class EnderecoConfig {

    @Bean
    public EnderecoMapper enderecoMapper(UsuarioMapper usuarioMapper ){
        return new EnderecoMapper(usuarioMapper);
    }

    @Bean
    public EnderecoRepository enderecoRepository(EnderecoRepositoryJPA repositoryJPA, EnderecoMapper enderecoMapper, UsuarioRepositoryJPA usuarioRepositoryJPA){
        return new EnderecoRepository(repositoryJPA, enderecoMapper, usuarioRepositoryJPA);
    }

    @Bean
    public AdicionarEndereco adicionarEndereco(EnderecoRepositoryInterface enderecoRepository, UsuarioRepositoryInterface usuarioRepository){
        return new AdicionarEndereco(enderecoRepository, usuarioRepository);
    }

    @Bean
    public DeletarEndereco deletarEndereco(EnderecoRepositoryInterface enderecoRepository){
        return new DeletarEndereco(enderecoRepository);
    }

    @Bean
    public AlterarEndereco alterarEndereco(EnderecoRepositoryInterface enderecoRepository){
        return new AlterarEndereco(enderecoRepository);
    }
    
}
