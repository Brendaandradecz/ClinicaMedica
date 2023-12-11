package br.com.clinicamedica.Model;

import java.time.LocalDateTime;

public class Analise {
    private LocalDateTime dataHora;
    private Biomedico biomedico;
    private Paciente paciente;
    private double resultado;
    private String id;

    public Analise(LocalDateTime dataHora, Biomedico biomedico, Paciente paciente, double resultado, String id) {
        this.dataHora = dataHora;
        this.biomedico = biomedico;
        this.paciente = paciente;
        this.resultado = resultado;
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Biomedico getBiomedico() {
        return biomedico;
    }

    public void setBiomedico(Biomedico biomedico) {
        this.biomedico = biomedico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getResultado() {
        return resultado;
    }
}
