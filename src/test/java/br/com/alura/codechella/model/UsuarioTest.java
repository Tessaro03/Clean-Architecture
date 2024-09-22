package br.com.alura.codechella.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class UsuarioTest {


    @Test
    public void naoDeveCriarUsuarioComCPFForaDoPadrao(){

        Assertions.assertThrows(IllegalArgumentException.class , () -> 
        new Usuario.UsuarioBuilder(1l)
            .cpf("123456789-00")
            .build()  
        );

        Assertions.assertThrows(IllegalArgumentException.class , () -> 
        new Usuario.UsuarioBuilder(1l)
            .cpf("12345678900")
            .build()  
        );
        
        Assertions.assertThrows(IllegalArgumentException.class , () -> 
        new Usuario.UsuarioBuilder(1l)
            .cpf("123.456.789.00")
            .build()  
        );
    }

    @Test
    public void deveCriarUsuarioComCPFDentroDoPadrao(){
        Assertions.assertDoesNotThrow(() -> 
        new Usuario.UsuarioBuilder(1l)
            .cpf("123.456.789-00")
            .build()  
        );
    }

}
