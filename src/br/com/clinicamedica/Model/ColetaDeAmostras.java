package br.com.clinicamedica.Model;

import java.time.LocalDateTime;

public class ColetaDeAmostras {
    private String tipo;
    private String codigo;
    private Enfermagem enfermeiro;
    private Paciente paciente;
    private LocalDateTime dataHora;
    private String condicaoDaAmostra;

    public ColetaDeAmostras(String tipo, String codigo, Enfermagem enfermeiro, Paciente paciente, LocalDateTime dataHora, String condicaoDaAmostra){
        this.tipo = tipo;
        this.codigo = codigo;
        this.enfermeiro = enfermeiro;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.condicaoDaAmostra = condicaoDaAmostra;
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
