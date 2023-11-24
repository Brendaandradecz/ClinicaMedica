package br.com.clinicamedica.Model;

public class ColetaDeAmostras {
    private String tipo;
    private String codigo;
    private Enfermagem enfermeiro;
    private Biomedico biomedico;
    private Paciente paciente;

    public ColetaDeAmostras(String tipo, String codigo, Enfermagem enfermeiro, Biomedico biomedico, Paciente paciente){
        this.tipo = tipo;
        this.codigo = codigo;
        this.enfermeiro = enfermeiro;
        this.biomedico = biomedico;
        this.paciente = paciente;
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
}
