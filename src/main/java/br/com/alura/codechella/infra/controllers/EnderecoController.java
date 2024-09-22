package br.com.alura.codechella.infra.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.codechella.application.usescase.endereco.AdicionarEndereco;
import br.com.alura.codechella.application.usescase.endereco.AlterarEndereco;
import br.com.alura.codechella.application.usescase.endereco.DeletarEndereco;
import br.com.alura.codechella.domain.entities.endereco.EnderecoDTO;


@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private final AdicionarEndereco adicionarEndereco;
    private final DeletarEndereco deletarEndereco;
    private final AlterarEndereco alterarEndereco;

    public EnderecoController(AdicionarEndereco adicionarEndereco, DeletarEndereco deletarEndereco, AlterarEndereco alterarEndereco) {
        this.adicionarEndereco = adicionarEndereco;
        this.deletarEndereco = deletarEndereco;
        this.alterarEndereco = alterarEndereco;
    }

    @PostMapping("/{idUsuario}")
    public ResponseEntity adicionarEndereco(@RequestBody EnderecoDTO endereco, @PathVariable Long idUsuario) {
        adicionarEndereco.adicionarEndereco(endereco, idUsuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{idEndereco}")
    public ResponseEntity deletarEndereco(@PathVariable Long idEndereco){
        deletarEndereco.deletarEndereco(idEndereco);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{idEndereco}")
    public ResponseEntity alterarEndereco(@PathVariable Long idEndereco, @RequestBody EnderecoDTO dto){
        var endereco = alterarEndereco.alterarEndereco(idEndereco, dto);
        return ResponseEntity.ok(new EnderecoDTO(endereco));

    }
}
