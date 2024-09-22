package br.com.alura.codechella.infra.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.codechella.application.usescase.usuario.AlterarUsuario;
import br.com.alura.codechella.application.usescase.usuario.CriarUsuario;
import br.com.alura.codechella.application.usescase.usuario.DeletarUsuario;
import br.com.alura.codechella.application.usescase.usuario.VerUsuarios;
import br.com.alura.codechella.domain.entities.usuario.UsuarioDTO;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    private final CriarUsuario criarUsuario;
    private final VerUsuarios verUsuarios;
    private final DeletarUsuario deletarUsuario;
    private final AlterarUsuario alterarUsuario;

    public UsuarioController(CriarUsuario criarUsuario, VerUsuarios verUsuarios, DeletarUsuario deletarUsuario, AlterarUsuario alterarUsuario) {
        this.criarUsuario = criarUsuario;
        this.verUsuarios = verUsuarios;
        this.deletarUsuario = deletarUsuario;
        this.alterarUsuario = alterarUsuario;
    }

    
    @PostMapping
    public ResponseEntity cadastrarUsuario(@RequestBody UsuarioDTO dto) {
        var usuario = criarUsuario.criarUsuario(dto);
        return ResponseEntity.ok(new UsuarioDTO(usuario));
    }
    
    @GetMapping
    public ResponseEntity verUsuario( ) {
        return ResponseEntity.ok(verUsuarios.verUsuarios());
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity deletarUsuario(@PathVariable Long idUsuario){
        deletarUsuario.deletarUsuario(idUsuario);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{idUsuario}")
    public ResponseEntity alterarUsuario(@PathVariable Long idUsuario, @RequestBody UsuarioDTO dto){
        alterarUsuario.alterarUsuario(idUsuario, dto);
        return ResponseEntity.ok().build();
    }

}
