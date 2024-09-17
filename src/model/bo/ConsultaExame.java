package model.bo;

import java.util.Date;

public class ConsultaExame {

    private int id;
    private Date dataHora;
    private String analiseExame;
    private String imagemExame;
    private String status;
    private Consulta consulta;
    private Internacao internacao;

    public ConsultaExame(int id, Date dataHora, String analiseExame, String imagemExame, String status, Consulta consulta, Internacao internacao) {
        this.id = id;
        this.dataHora = dataHora;
        this.analiseExame = analiseExame;
        this.imagemExame = imagemExame;
        this.status = status;
        this.consulta = consulta;
        this.internacao = internacao;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getAnaliseExame() {
        return analiseExame;
    }

    public void setAnaliseExame(String analiseExame) {
        this.analiseExame = analiseExame;
    }

    public String getImagemExame() {
        return imagemExame;
    }

    public void setImagemExame(String imagemExame) {
        this.imagemExame = imagemExame;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

}
