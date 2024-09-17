package model.bo;

import java.util.Date;

public class MovimentoMedicamento {

    private int id;
    private Date dataHoraMovimento;
    private String tipoMovimento;
    private float qtdMedicamento;
    private String observacao;
    private String status;
    private Lote lote;

    public MovimentoMedicamento(int id, Date dataHoraMovimento, String tipoMovimento, float qtdMedicamento, String observacao, String status, Lote lote) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.tipoMovimento = tipoMovimento;
        this.qtdMedicamento = qtdMedicamento;
        this.observacao = observacao;
        this.status = status;
        this.lote = lote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(Date dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public float getQtdMedicamento() {
        return qtdMedicamento;
    }

    public void setQtdMedicamento(float qtdMedicamento) {
        this.qtdMedicamento = qtdMedicamento;
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

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

}
