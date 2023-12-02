package br.com.clinicamedica.Model;

import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime dataHora;
    private Paciente paciente;
    private Medico medico;
    private String id;

    public Consulta(LocalDateTime dataHora, Paciente paciente, Medico medico, String id){
        this.dataHora = dataHora;
        this.paciente = paciente;
        this.medico = medico;
        this.id =  id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
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
}
