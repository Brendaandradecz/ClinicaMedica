package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Paciente;

import java.util.ArrayList;

public class PacienteDAO implements IDAO<Paciente> {
    private ArrayList<Paciente> PacienteDao = new ArrayList<>();

    @Override
    public boolean adicionar(Paciente elemento) {
        if (!PacienteDao.contains(elemento)) {
            PacienteDao.add(elemento);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Paciente buscar(String busca) {
        return null;
    }

    @Override
    public ArrayList<Paciente> listarTodos() {
        return new ArrayList<>(PacienteDao);
    }

    @Override
    public boolean remover(Paciente elemento) {
        if (!PacienteDao.contains(elemento)) {
            PacienteDao.remove(elemento);
            return true;
        }
        return false;
    }
}
