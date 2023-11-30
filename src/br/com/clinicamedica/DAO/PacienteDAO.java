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
        System.out.println("Paciente adicionado ao sistema!\n");
        return true;
    }

    @Override
    public Paciente buscar(String busca) {
        for (Paciente paciente: pacienteDao) {
            if(paciente.getNome().equals(busca) || paciente.getCpf().equals(busca)){
                System.out.println("Informações de " + paciente.getNome());
                System.out.println("Nome: " + paciente.getNome()
                        + ". \nCPF: " + paciente.getCpf()
                        + ". \nIdade: " + paciente.getIdade()
                        + ". \nAcompanhado? " + paciente.isPacienteAcompanhado()
                        + ". \nCondição normal? " + paciente.isCondicaoNormal()
                        + ". \nPossui Convenio? " + paciente.isPossuiConvenio()
                        + ". \nPressão Arterial alterada? " + paciente.isPressaoArterialAlterada()
                        + ". \nTelefone: " + paciente.getTelefone()
                        + ". \nEmail: " + paciente.getEmail());
                return paciente;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Paciente> listarTodos() {
        for (Paciente paciente: pacienteDao) {
            System.out.println("Informações de " + paciente.getNome());
            System.out.println("Nome: " + paciente.getNome()
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
        System.out.println("Paciente removido do sistema!\n");
        return true;
    }
}
