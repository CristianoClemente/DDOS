package model.bo;

public class Ala {

    private int id;
    private String descrcao;
    private String status;

    public Ala(int id, String descrcao, String status) {
        this.id = id;
        this.descrcao = descrcao;
        this.status = status;
    }

    public Ala() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }

    public String getStatus(String toString) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
