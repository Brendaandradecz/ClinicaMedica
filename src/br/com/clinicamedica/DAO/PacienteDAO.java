package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Paciente;

import java.util.ArrayList;

public class PacienteDAO implements IDAO<Paciente> {
    private ArrayList<Paciente> PacienteDao = new ArrayList<>();

    @Override
    public boolean adicionar(Paciente objeto) {
        return false;
    }

    @Override
    public Paciente buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Paciente> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Paciente objeto) {
        return false;
    }
}
