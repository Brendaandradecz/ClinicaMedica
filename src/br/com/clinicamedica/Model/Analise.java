package br.com.clinicamedica.Model;

import java.time.LocalDateTime;

public class Analise {
    private LocalDateTime dataHora;
    private Medico medico;
    private Paciente paciente;
    private double resultado;

    public Analise(LocalDateTime dataHora, Medico medico, Paciente paciente, double resultado) {
        this.dataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
        this.resultado = resultado;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
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
