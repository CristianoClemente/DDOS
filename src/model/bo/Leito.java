
package model.bo;

public class Leito {
    private int id;
    private String descricao;
    private String status;
    private Quarto quarto;

    public Leito(int id, String descricao, String status, Quarto quarto) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
        this.quarto = quarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    
}
