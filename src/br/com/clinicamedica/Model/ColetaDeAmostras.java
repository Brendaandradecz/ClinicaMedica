package br.com.clinicamedica.Model;

import java.time.LocalDateTime;

public class ColetaDeAmostras {
    private String tipo;
    private String codigo;
    private Enfermagem enfermeiro;
    private Paciente paciente;
    private LocalDateTime dataHora;
    private String condicaoDaAmostra;
    private String id;

    public ColetaDeAmostras(String tipo, String codigo, Enfermagem enfermeiro, Paciente paciente, LocalDateTime dataHora, String condicaoDaAmostra, String id){
        this.tipo = tipo;
        this.codigo = codigo;
        this.enfermeiro = enfermeiro;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.condicaoDaAmostra = condicaoDaAmostra;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Enfermagem getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermagem enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getCondicaoDaAmostra() {
        return condicaoDaAmostra;
    }

    public void setCondicaoDaAmostra(String condicaoDaAmostra) {
        this.condicaoDaAmostra = condicaoDaAmostra;
    }
}
