package br.com.clinicamedica.Model;

import java.time.LocalDateTime;

public class Analise {
    private LocalDateTime dataHora;
    private Biomedico biomedico;
    private Paciente paciente;
    private double resultado;

    public Analise(LocalDateTime dataHora, Biomedico biomedico, Paciente paciente, double resultado) {
        this.dataHora = dataHora;
        this.biomedico = biomedico;
        this.paciente = paciente;
        this.resultado = resultado;
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

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getResultado() {
        return resultado;
    }

    public void setDiagnostico(String diagnostico) {
        this.resultado = resultado;
    }
}
