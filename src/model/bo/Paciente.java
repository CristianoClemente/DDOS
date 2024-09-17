package model.bo;

import java.time.LocalDate;

/**
 *
 * @author Cristiano
 */
public class Paciente extends Pessoa {

    private String tipoSanguineo;
    private String sexo;
    private String nomesocial;
    private String status;

    public Paciente(String tipoSanguineo, String sexo, String nomesocial, String status, int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, LocalDate dataCadastro, String logradouro, String complemento, String bairro, String cidade, String cep, String uf) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, logradouro, complemento, bairro, cidade, cep, uf);
        this.tipoSanguineo = tipoSanguineo;
        this.sexo = sexo;
        this.nomesocial = nomesocial;
        this.status = status;
    }

    public Paciente() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomesocial() {
        return nomesocial;
    }

    public void setNomesocial(String nomesocial) {
        this.nomesocial = nomesocial;
    }




}
