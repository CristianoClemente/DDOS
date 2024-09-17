package model.bo;

import java.util.Date;

public class Receita {

    private int id;
    private Date dataHoraReceita;
    private String observacao;
    private String status;
    private Consulta consulta;

    public Receita(int id, Date dataHoraReceita, String observacao, String status, Consulta consulta) {
        this.id = id;
        this.dataHoraReceita = dataHoraReceita;
        this.observacao = observacao;
        this.status = status;
        this.consulta = consulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraReceita() {
        return dataHoraReceita;
    }

    public void setDataHoraReceita(Date dataHoraReceita) {
        this.dataHoraReceita = dataHoraReceita;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

}
