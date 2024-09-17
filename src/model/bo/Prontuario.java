package model.bo;

import java.util.Date;

public class Prontuario {

    private int id;
    private Date dataHoraVisita;
    private String descricaiVisita;
    private String observacao;
    private String status;
    private InternacaoLeito internacaoLeito;
    private Enfermeiro enfermeiro;
    private Medico medico;

    public Prontuario(int id, Date dataHoraVisita, String descricaiVisita, String observacao, String status, InternacaoLeito internacaoLeito, Enfermeiro enfermeiro, Medico medico) {
        this.id = id;
        this.dataHoraVisita = dataHoraVisita;
        this.descricaiVisita = descricaiVisita;
        this.observacao = observacao;
        this.status = status;
        this.internacaoLeito = internacaoLeito;
        this.enfermeiro = enfermeiro;
        this.medico = medico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraVisita() {
        return dataHoraVisita;
    }

    public void setDataHoraVisita(Date dataHoraVisita) {
        this.dataHoraVisita = dataHoraVisita;
    }

    public String getDescricaiVisita() {
        return descricaiVisita;
    }

    public void setDescricaiVisita(String descricaiVisita) {
        this.descricaiVisita = descricaiVisita;
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

    public InternacaoLeito getInternacaoLeito() {
        return internacaoLeito;
    }

    public void setInternacaoLeito(InternacaoLeito internacaoLeito) {
        this.internacaoLeito = internacaoLeito;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
