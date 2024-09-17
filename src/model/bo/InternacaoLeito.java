package model.bo;

import java.util.Date;

public class InternacaoLeito {

    private int id;
    private Date dataHoraIternacao;
    private Date dataHoraDesocupacao;
    private String status;
    private Internacao internacao;
    private Leito leito;
    private Acompanhante acompanhante;

    public InternacaoLeito(int id, Date dataHoraIternacao, Date dataHoraDesocupacao, String status, Internacao internacao, Leito leito, Acompanhante acompanhante) {
        this.id = id;
        this.dataHoraIternacao = dataHoraIternacao;
        this.dataHoraDesocupacao = dataHoraDesocupacao;
        this.status = status;
        this.internacao = internacao;
        this.leito = leito;
        this.acompanhante = acompanhante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraIternacao() {
        return dataHoraIternacao;
    }

    public void setDataHoraIternacao(Date dataHoraIternacao) {
        this.dataHoraIternacao = dataHoraIternacao;
    }

    public Date getDataHoraDesocupacao() {
        return dataHoraDesocupacao;
    }

    public void setDataHoraDesocupacao(Date dataHoraDesocupacao) {
        this.dataHoraDesocupacao = dataHoraDesocupacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public Acompanhante getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(Acompanhante acompanhante) {
        this.acompanhante = acompanhante;
    }

}
