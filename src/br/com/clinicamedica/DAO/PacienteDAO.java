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
            if(paciente.getNome().equals(busca) || paciente.getCpf().equals(busca)){
                System.out.println("\nInformacoes de " + paciente.getNome());
                System.out.println("\nNome: " + paciente.getNome()
                        + ". \nCPF: " + paciente.getCpf()
                        + ". \nIdade: " + paciente.getIdade()
                        + ". \nAcompanhado? " + paciente.isPacienteAcompanhado()
                        + ". \nCondição normal? " + paciente.isCondicaoNormal()
                        + ". \nPossui Convenio? " + paciente.isPossuiConvenio()
                        + ". \nPressão Arterial alterada? " + paciente.isPressaoArterialAlterada()
                        + ". \nTelefone: " + paciente.getTelefone()
                        + ". \nEmail: " + paciente.getEmail());
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Paciente> listarTodos() {
        for (Paciente paciente: pacienteDao) {
            System.out.println("\nInformacoes de " + paciente.getNome());
            System.out.println("\nNome: " + paciente.getNome()
                    + ". \nCPF: " + paciente.getCpf()
                    + ". \nIdade: " + paciente.getIdade()
                    + ". \nAcompanhado? " + paciente.isPacienteAcompanhado()
                    + ". \nCondição normal? " + paciente.isCondicaoNormal()
                    + ". \nPossui Convenio? " + paciente.isPossuiConvenio()
                    + ". \nPressão Arterial alterada? " + paciente.isPressaoArterialAlterada()
                    + ". \nTelefone: " + paciente.getTelefone()
                    + ". \nEmail: " + paciente.getEmail());
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
