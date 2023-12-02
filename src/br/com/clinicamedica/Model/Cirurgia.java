package br.com.clinicamedica.Model;

import java.time.LocalDateTime;

public class Cirurgia {
    private LocalDateTime dataHora;
    private Medico medico;
    private Paciente paciente;
    private String procedimento;
    private String id;

    public Cirurgia(LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento, String id) {
        this.dataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
        this.procedimento = procedimento;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
