package br.com.clinicamedica.Model;

public class Paciente {
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String telefone;
    private boolean possuiConvenio;
    private boolean condicaoNormal;
    private boolean pressaoArterialAlterada;
    private boolean pacienteAcompanhado;

    public Paciente(String nome, int idade, String cpf, String email, String telefone, boolean possuiConvenio, boolean condicaoNormal, boolean pressaoArterialAlterada, boolean pacienteAcompanhado){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.possuiConvenio = possuiConvenio;
        this.condicaoNormal = condicaoNormal;
        this.pressaoArterialAlterada = pressaoArterialAlterada;
        this.pacienteAcompanhado = pacienteAcompanhado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isPossuiConvenio() {
        return possuiConvenio;
    }

    public void setPossuiConvenio(boolean possuiConvenio) {
        this.possuiConvenio = possuiConvenio;
    }

    public boolean isCondicaoNormal() {
        return condicaoNormal;
    }

    public void setCondicaoNormal(boolean condicaoNormal) {
        this.condicaoNormal = condicaoNormal;
    }

    public boolean isPressaoArterialAlterada() {
        return pressaoArterialAlterada;
    }

    public void setPressaoArterialAlterada(boolean pressaoArterialAlterada) {
        this.pressaoArterialAlterada = pressaoArterialAlterada;
    }

    public boolean isPacienteAcompanhado() {
        return pacienteAcompanhado;
    }

    public void setPacienteAcompanhado(boolean pacienteAcompanhado) {
        this.pacienteAcompanhado = pacienteAcompanhado;
    }
}
