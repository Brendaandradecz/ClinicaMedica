package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IMedicoDao;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;
import br.com.clinicamedica.Model.Enfermagem;
import br.com.clinicamedica.Model.Medico;

import java.util.ArrayList;

public class MedicoDAO implements IDAO<Medico>, IMedicoDao {
    private ArrayList<Medico> medicoDao = new ArrayList<>();

    @Override
    public boolean adicionar(Medico elemento) {
        medicoDao.add(elemento);
        System.out.println("Medico(a) adicionado ao sistema!");
        return true;
    }

    @Override
    public Medico buscar(String busca) {
        for (Medico medico: medicoDao) {
            if (medico.getCpf().equals(busca) || medico.getCrm().equals(busca) || medico.getNome().equals(busca)) {
                System.out.println("Informações de " + medico.getNome());
                System.out.println("Nome: " + medico.getNome()
                        + ". CRM: " + medico.getCrm()
                        + ". CPF: " + medico.getCpf()
                        + ". Telefone: " + medico.getTelefone()
                        + ". Email: " + medico.getEmail());
                return medico;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Medico> listarTodos() {
        for (Medico medico: medicoDao) {
            System.out.println("Informações de " + medico.getNome());
            System.out.println("Nome: " + medico.getNome()
                    + ". CRM: " + medico.getCrm()
                    + ". CPF: " + medico.getCpf()
                    + ". Telefone: " + medico.getTelefone()
                    + ". Email: " + medico.getEmail());
        }
        return medicoDao;
    }

    @Override
    public boolean remover(Medico elemento) {
        medicoDao.remove(elemento);
        System.out.println("Medico(a) removido do sistema");
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
        System.out.println("Cirurgia agendada por " + cirurgia.getMedico().getNome() +
                " para o paciente " + cirurgia.getPaciente().getNome() +
                " às " + cirurgia.getDataHora() +
                ". Procedimento: " + cirurgia.getProcedimento());
        return true;
    }
}
