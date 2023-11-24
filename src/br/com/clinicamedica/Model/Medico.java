package br.com.clinicamedica.Model;

public abstract class Medico {
    private String nome;
    private String cpf;
    private String crm;
    private String especialidade;
    private String email;
    private String telefone;

    public Medico(String nome, String cpf, String email, String telefone, String crm, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
         this.telefone = telefone;
         this.crm = crm;
         this.especialidade = especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
