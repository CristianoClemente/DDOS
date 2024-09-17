package model.bo;

public class LaboratorioMedicamento {

    private int id;
    private String codigoDeBarras;
    private String observacao;
    private String status;
    private Medicamento medicamento;
    private Laboratorio laboratorio;

    public LaboratorioMedicamento(int id, String codigoDeBarras, String observacao, String status, Medicamento medicamento, Laboratorio laboratorio) {
        this.id = id;
        this.codigoDeBarras = codigoDeBarras;
        this.observacao = observacao;
        this.status = status;
        this.medicamento = medicamento;
        this.laboratorio = laboratorio;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
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

}
