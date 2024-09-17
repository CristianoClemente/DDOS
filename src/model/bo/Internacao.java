package model.bo;

import java.util.Date;

public class Internacao {

    private int id;
    private Date dataHoraInternacao;
    private Date dataHoraAlta;
    private String observacao;
    private String status;
    private Consulta conssulta;

    public Internacao(int id, Date dataHoraInternacao, Date dataHoraAlta, String observacao, String status, Consulta conssulta) {
        this.id = id;
        this.dataHoraInternacao = dataHoraInternacao;
        this.dataHoraAlta = dataHoraAlta;
        this.observacao = observacao;
        this.status = status;
        this.conssulta = conssulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraInternacao() {
        return dataHoraInternacao;
    }

    public void setDataHoraInternacao(Date dataHoraInternacao) {
        this.dataHoraInternacao = dataHoraInternacao;
    }

    public Date getDataHoraAlta() {
        return dataHoraAlta;
    }

    public void setDataHoraAlta(Date dataHoraAlta) {
        this.dataHoraAlta = dataHoraAlta;
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

    public Consulta getConssulta() {
        return conssulta;
    }

    public void setConssulta(Consulta conssulta) {
        this.conssulta = conssulta;
    }

}
