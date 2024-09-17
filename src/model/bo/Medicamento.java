package model.bo;

public class Medicamento {

    private int id;
    private String descricaoMedicamento;
    private String principioAtivo;
    private int quantidadeMinima;
    private String status;

    public Medicamento() {
    }

    public Medicamento(int id, String descricaoMeiamento, String principioAtivo, int quantidadeMinima, String status) {
        this.id = id;
        this.descricaoMedicamento = descricaoMeiamento;
        this.principioAtivo = principioAtivo;
        this.quantidadeMinima = quantidadeMinima;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoMeiamento() {
        return descricaoMedicamento;
    }

    public void setDescricaoMeiamento(String descricaoMeiamento) {
        this.descricaoMedicamento = descricaoMeiamento;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public float getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", descricaoMeiamento=" + descricaoMedicamento + ", principioAtivo=" + principioAtivo + ", quantidadeMinima=" + quantidadeMinima + ", status=" + status + '}'+"\n";
    }

}
