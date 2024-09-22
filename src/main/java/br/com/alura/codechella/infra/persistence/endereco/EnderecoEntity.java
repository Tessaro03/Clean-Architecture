package br.com.alura.codechella.infra.persistence.endereco;

import br.com.alura.codechella.infra.persistence.usuario.UsuarioEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="enderecos")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@NoArgsConstructor
public class EnderecoEntity {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuarios_id", nullable = false)
    private UsuarioEntity usuario;
    private String cep;
    private Integer numero;
    private String complemento;


    public EnderecoEntity(Long id,String cep, Integer numero, String complemento) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public EnderecoEntity(Long id,String cep, Integer numero, String complemento, UsuarioEntity usuario ) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.usuario = usuario;
    }



}
