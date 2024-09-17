package model.bo;

public class Exame {

    private int id;
    private String tituloExame;
    private String tipoExame;
    private String status;
    private ConsultaExame consultaExame;

    public Exame(int id, String tituloExame, String tipoExame, String status, ConsultaExame consultaExame) {
        this.id = id;
        this.tituloExame = tituloExame;
        this.tipoExame = tipoExame;
        this.status = status;
        this.consultaExame = consultaExame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloExame() {
        return tituloExame;
    }

    public void setTituloExame(String tituloExame) {
        this.tituloExame = tituloExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConsultaExame getConsultaExame() {
        return consultaExame;
    }

    public void setConsultaExame(ConsultaExame consultaExame) {
        this.consultaExame = consultaExame;
    }

}
