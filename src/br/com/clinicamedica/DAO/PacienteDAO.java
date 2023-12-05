package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Paciente;

import java.util.ArrayList;

public class PacienteDAO implements IDAO<Paciente> {
    private ArrayList<Paciente> pacienteDao = new ArrayList<>();

    @Override
    public ArrayList<Paciente> getArray() {
        return pacienteDao;
    }

    @Override
    public boolean adicionar(Paciente elemento) {
        pacienteDao.add(elemento);
        System.out.println("\nPaciente adicionado ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        for (Paciente paciente: pacienteDao) {
            if(paciente.getNome().toLowerCase().contains(busca) ||
                    paciente.getCpf().toLowerCase().contains(busca)){
                System.out.println("\nPaciente encontrado:");
                imprimirInfo(paciente);
                return true;
            }
        }
        return false;
    }
    public void imprimirInfo(Paciente paciente){
        String condicao;
        if(paciente.isCondicaoNormal()){
            condicao = "Sim";
        } else{
            condicao = "Nao";
        }

        String acompanhado;
        if(paciente.isPacienteAcompanhado()){
            acompanhado = "Sim";
        } else{
            acompanhado = "Nao";
        }

        String pressao;
        if(paciente.isPressaoArterialAlterada()){
            pressao = "Sim";
        } else{
            pressao = "Nao";
        }

        String convenio;
        if(paciente.isPossuiConvenio()){
            convenio = "Sim";
        } else{
            convenio = "Nao";
        }
        System.out.println("\nInformacoes de " + paciente.getNome());
        System.out.println("\nNome: " + paciente.getNome()
                + ". \nCPF: " + paciente.getCpf()
                + ". \nIdade: " + paciente.getIdade()
                + ". \nAcompanhado? " + acompanhado
                + ". \nCondição normal? " + condicao
                + ". \nPossui Convenio? " + convenio
                + ". \nPressão Arterial alterada? " + pressao
                + ". \nTelefone: " + paciente.getTelefone()
                + ". \nEmail: " + paciente.getEmail());
    }
    @Override
    public ArrayList<Paciente> listarTodos() {
        for (Paciente paciente: pacienteDao) {
            imprimirInfo(paciente);
        }
        return pacienteDao;
    }

    @Override
    public boolean remover(Paciente elemento) {
        pacienteDao.remove(elemento);
        System.out.println("\nPaciente removido do sistema!\n");
        return true;
    }
}
