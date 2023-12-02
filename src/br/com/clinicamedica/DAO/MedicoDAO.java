package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IMedicoDao;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;
import br.com.clinicamedica.Model.Medico;

import java.util.ArrayList;

public class MedicoDAO implements IDAO<Medico>, IMedicoDao {
    private ArrayList<Medico> medicoDao = new ArrayList<>();

    @Override
    public boolean adicionar(Medico elemento) {
        medicoDao.add(elemento);
        System.out.println("Medico(a) adicionado(a) ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        for (Medico medico: medicoDao) {
            if (medico.getCpf().equals(busca) || medico.getCrm().equals(busca) || medico.getNome().equals(busca)) {
                System.out.println("\nInformações de " + medico.getNome());
                System.out.println("Nome: " + medico.getNome()
                        + ". \nCRM: " + medico.getCrm()
                        + ". \nEspecialidade: " + medico.getEspecialidade()
                        + ". \nCPF: " + medico.getCpf()
                        + ". \nTelefone: " + medico.getTelefone()
                        + ". \nEmail: " + medico.getEmail());
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Medico> listarTodos() {
        for (Medico medico: medicoDao) {
            System.out.println("\nInformações de " + medico.getNome());
            System.out.println("Nome: " + medico.getNome()
                    + ". \nCRM: " + medico.getCrm()
                    + ". \nCPF: " + medico.getCpf()
                    + ". \nTelefone: " + medico.getTelefone()
                    + ". \nEmail: " + medico.getEmail());
        }
        return medicoDao;
    }

    @Override
    public boolean remover(Medico elemento) {
        medicoDao.remove(elemento);
        System.out.println("Medico(a) removido(a) do sistema\n");
        return true;
    }

    @Override
    public ArrayList<Medico> getArray() {
        return medicoDao;
    }

    @Override
    public boolean fazerConsulta(Consulta consulta) {
        System.out.println("INFORMAÇÕES DA CONSULTA:");
        System.out.println("Consulta realizada por " + consulta.getMedico().getNome() +
                " para o paciente " + consulta.getPaciente().getNome() +
                " às " + consulta.getDataHora());
        return true;
    }

    @Override
    public boolean fazerCirurgia(Cirurgia cirurgia) {
        System.out.println("INFORMAÇÕES DA CIRURGIA:");
        System.out.println("Cirurgia realizada por " + cirurgia.getMedico().getNome() +
                " para o paciente " + cirurgia.getPaciente().getNome() +
                " às " + cirurgia.getDataHora() +
                ". Procedimento: " + cirurgia.getProcedimento());
        return true;
    }
}
