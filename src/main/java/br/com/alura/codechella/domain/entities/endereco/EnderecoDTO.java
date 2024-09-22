package br.com.alura.codechella.domain.entities.endereco;

public record EnderecoDTO(

    String cep,
    Integer numero,
    String complemento

) {

    public EnderecoDTO(Endereco endereco){
        this(endereco.getCep(), endereco.getNumero(), endereco.getComplemento());
    }

}
