package br.com.alura.codechella.infra.persistence.endereco;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepositoryJPA extends JpaRepository<EnderecoEntity, Long> {

    
}
