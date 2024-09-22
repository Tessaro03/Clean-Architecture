package br.com.alura.codechella.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.codechella.application.gateways.UsuarioRepositoryInterface;
import br.com.alura.codechella.application.usescase.usuario.AlterarUsuario;
import br.com.alura.codechella.application.usescase.usuario.CriarUsuario;
import br.com.alura.codechella.application.usescase.usuario.DeletarUsuario;
import br.com.alura.codechella.application.usescase.usuario.VerUsuarios;
import br.com.alura.codechella.infra.gateways.usuario.UsuarioMapper;
import br.com.alura.codechella.infra.gateways.usuario.UsuarioRepository;
import br.com.alura.codechella.infra.persistence.usuario.UsuarioRepositoryJPA;

@Configuration
public class UsuarioConfig {
    
   

    @Bean
    public CriarUsuario criarUsuario(UsuarioRepositoryInterface repositoryJPA){
       return new CriarUsuario(repositoryJPA);
    }

    @Bean
    public VerUsuarios verUsuarios(UsuarioRepositoryInterface repositoryJPA){
        return new VerUsuarios(repositoryJPA);
    }

    @Bean
    public DeletarUsuario deletarUsuario(UsuarioRepositoryInterface repositoryJPA){
        return new DeletarUsuario(repositoryJPA);
    }

    @Bean
    public AlterarUsuario alterarUsuario(UsuarioRepositoryInterface repositoryJPA){
        return new AlterarUsuario(repositoryJPA);
    }

    @Bean
    public UsuarioRepository usuarioRepository(UsuarioRepositoryJPA repositoryJPA, UsuarioMapper mapper){
        return new UsuarioRepository(repositoryJPA, mapper);
    }  

    @Bean
    public UsuarioMapper usuarioMapper(){
        return new UsuarioMapper();
    }



}
