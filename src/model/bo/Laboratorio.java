package model.bo;

import java.time.LocalDate;

public class Laboratorio extends Pessoa {

    private String nomeFantasia;
    private String contato;
    private String status;

    public Laboratorio(String nomeFantasia, String contato, String status, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, LocalDate dataCadastro, String logradouro, String complemento, String bairro, String cidade, String cep, String uf) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, logradouro, complemento, bairro, cidade, cep, uf);
        this.nomeFantasia = nomeFantasia;
        this.contato = contato;
        this.status = status;
    }

    public Laboratorio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "id=" + id + ", nomeFantasia=" + nomeFantasia + ", contato=" + contato + ", status=" + status + "}\n";
    }

}
