package br.com.alura.codechella.domain.entities.usuario;

import java.time.LocalDate;
import java.util.List;

import br.com.alura.codechella.domain.entities.endereco.Endereco;



public class Usuario {

    private Long id;
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;
    private List<Endereco> enderecos;


    private Usuario( UsuarioBuilder builder) {
        this.id = builder.id;
        this.cpf = builder.cpf;
        this.nome = builder.nome;
        this.nascimento = builder.nascimento;
        this.email = builder.email;
        this.enderecos = builder.enderecos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEndereco(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
   
    public void adicionarEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }

    public static class UsuarioBuilder {

        private Long id;
        private String cpf;
        private String nome;
        private LocalDate nascimento;
        private String email;
        private List<Endereco> enderecos;
    
        public UsuarioBuilder(Long id){
            this.id = id;
        }

        public UsuarioBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public UsuarioBuilder cpf(String cpf){
            if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
                throw new IllegalArgumentException("CPF Invalido");
            }
            this.cpf = cpf;
            return this;
        }

        public UsuarioBuilder nascimento(LocalDate nascimento){
            this.nascimento = nascimento;
            return this;
        }

        public UsuarioBuilder email(String email){
            this.email = email;
            return this;
        }

        public UsuarioBuilder enderecos(List<Endereco> enderecos){
            this.enderecos = enderecos;
            return this;
        }


        public Usuario build(){
            var usuario = new Usuario(this);
            return usuario;
        }

    }



   




}
