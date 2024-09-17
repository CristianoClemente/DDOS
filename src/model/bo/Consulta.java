package model.bo;

import java.util.Date;

public class Consulta {

    private int id;
    private String responsavel;
    private Date dataHora;
    private String anaminese;
    private String diagnostico;
    private String prescricao;
    private String observacao;
    private String status;
    private Atendimento atendimento;
    private Medico medico;

    public Consulta(int id, String responsavel, Date dataHora, String anaminese, String diagnostico, String prescricao, String observacao, String status, Atendimento atendimento, Medico medico) {
        this.id = id;
        this.responsavel = responsavel;
        this.dataHora = dataHora;
        this.anaminese = anaminese;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.observacao = observacao;
        this.status = status;
        this.atendimento = atendimento;
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getAnaminese() {
        return anaminese;
    }

    public void setAnaminese(String anaminese) {
        this.anaminese = anaminese;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
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

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

}
