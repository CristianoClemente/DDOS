package model.bo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Cristiano
 */
public class Farmaceutico extends Pessoa {

    private String login;
    private String senha;
    private String nomeSocial;
    private String crf;
    private String status;

    public Farmaceutico(String login, String senha, String nomeSocial, String crf, String status, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, LocalDate dataCadastro, String logradouro, String complemento, String bairro, String cidade, String cep, String uf) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, logradouro, complemento, bairro, cidade, cep, uf);
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
        this.crf = crf;
        this.status = status;
    }

    public Farmaceutico() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

}
