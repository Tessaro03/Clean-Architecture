package br.com.alura.codechella.domain.entities.endereco;

import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class Endereco {

    private Long id;
    private Usuario usuario;
    private String cep;
    private Integer numero;
    private String complemento;

    public Endereco(String cep, Integer numero, String complemento, Long id, Usuario usuario) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.usuario = usuario;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Endereco [id=" + id + ", usuario=" + usuario.getId() + ", cep=" + cep + ", numero=" + numero + ", complemento="
                + complemento + "]";
    }

   


    
}
