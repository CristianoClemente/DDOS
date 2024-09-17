package model.bo;

import java.util.Date;

public class Atendimento {

    private int id;
    private Date dataHoraAtendimento;
    private String pressao;
    private String temperatura;
    private int bpm;
    private float oxiometria;
    private String historicoDeDoencas;
    private String medicacoesEmUso;
    private String anaminese;
    private String tipoAtendimento;
    private String classificacao;
    private String observacoes;
    private String status;
    private Paciente paciente;
    private Enfermeiro enfermeiro;
    private Usuario usuario;

    public Atendimento(int id, Date dataHoraAtendimento, String pressao, String temperatura, int bpm, float oxiometria, String historicoDeDoencas, String medicacoesEmUso, String anaminese, String tipoAtendimento, String classificacao, String observacoes, String status, Paciente paciente, Enfermeiro enfermeiro, Usuario usuario) {
        this.id = id;
        this.dataHoraAtendimento = dataHoraAtendimento;
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.bpm = bpm;
        this.oxiometria = oxiometria;
        this.historicoDeDoencas = historicoDeDoencas;
        this.medicacoesEmUso = medicacoesEmUso;
        this.anaminese = anaminese;
        this.tipoAtendimento = tipoAtendimento;
        this.classificacao = classificacao;
        this.observacoes = observacoes;
        this.status = status;
        this.paciente = paciente;
        this.enfermeiro = enfermeiro;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraAtendimento() {
        return dataHoraAtendimento;
    }

    public void setDataHoraAtendimento(Date dataHoraAtendimento) {
        this.dataHoraAtendimento = dataHoraAtendimento;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public float getOxiometria() {
        return oxiometria;
    }

    public void setOxiometria(float oxiometria) {
        this.oxiometria = oxiometria;
    }

    public String getHistoricoDeDoencas() {
        return historicoDeDoencas;
    }

    public void setHistoricoDeDoencas(String historicoDeDoencas) {
        this.historicoDeDoencas = historicoDeDoencas;
    }

    public String getMedicacoesEmUso() {
        return medicacoesEmUso;
    }

    public void setMedicacoesEmUso(String medicacoesEmUso) {
        this.medicacoesEmUso = medicacoesEmUso;
    }

    public String getAnaminese() {
        return anaminese;
    }

    public void setAnaminese(String anaminese) {
        this.anaminese = anaminese;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
