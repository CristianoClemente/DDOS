package model.bo;

import java.time.LocalDate;

public class Fornecedor extends Pessoa {

    private String nomeFantasia;
    private String contato;
    private String status;

    public Fornecedor(String nomeFantasia, String contato, String status, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, LocalDate dataCadastro, String logradouro, String complemento, String bairro, String cidade, String cep, String uf) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, logradouro, complemento, bairro, cidade, cep, uf);
        this.nomeFantasia = nomeFantasia;
        this.contato = contato;
        this.status = status;
    }

    public Fornecedor() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

}
