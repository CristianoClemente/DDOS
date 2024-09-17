package model.bo;

public class Quarto {

    private int id;
    private String descricao;
    private String status;
    private Ala ala;

    public Quarto(int id, String descricao, String status, Ala ala) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
        this.ala = ala;
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

    public Ala getAla() {
        return ala;
    }

    public void setAla(Ala ala) {
        this.ala = ala;
    }
    
    
}
