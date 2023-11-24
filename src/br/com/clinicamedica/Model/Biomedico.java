package br.com.clinicamedica.Model;

public class Biomedico {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String crbm;

    public Biomedico(String nome, String cpf, String email, String telefone, String crbm) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.crbm = crbm;
    }

    public String getCrbm() {
        return crbm;
    }

    public void setCrbm(String crbm) {
        this.crbm = crbm;
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
