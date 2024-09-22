package br.com.alura.codechella.infra.persistence.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoryJPA extends JpaRepository<UsuarioEntity, Long> {
}
