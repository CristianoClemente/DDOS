package model.bo;

import java.time.LocalDate;

/**
 *
 * @author Cristiano
 */
public class Enfermeiro extends Pessoa {

    private String login;
    private String senha;
    private String coren;
    private String status;
    private String nomeSocial;

    public Enfermeiro(String login, String senha, String coren, String status, String nomeSocial, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, LocalDate dataCadastro, String logradouro, String complemento, String bairro, String cidade, String cep, String uf) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, logradouro, complemento, bairro, cidade, cep, uf);
        this.login = login;
        this.senha = senha;
        this.coren = coren;
        this.status = status;
        this.nomeSocial = nomeSocial;
    }

    public Enfermeiro() {
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

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }


    
    
}