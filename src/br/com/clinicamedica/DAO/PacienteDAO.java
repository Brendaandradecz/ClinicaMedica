package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Analise;
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
        return true;
    }

    @Override
    public Paciente buscar(String busca) {
        for (Paciente paciente: pacienteDao) {
            if(paciente.getNome().equals(busca) || paciente.getCpf().equals(busca)){
                return paciente;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Paciente> listarTodos() {
        return pacienteDao;
    }

    @Override
    public boolean remover(Paciente elemento) {
        pacienteDao.remove(elemento);
        return true;
    }
}
