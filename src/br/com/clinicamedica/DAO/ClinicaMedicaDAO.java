package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.ClinicaMedica;

import java.util.ArrayList;

public class ClinicaMedicaDAO implements IDAO<ClinicaMedica> {
    private ArrayList<ClinicaMedica> clinicaMedicaDao = new ArrayList<>();

    @Override
    public boolean adicionar(ClinicaMedica objeto) {
        return false;
    }

    @Override
    public ClinicaMedica buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<ClinicaMedica> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(ClinicaMedica objeto) {
        return false;
    }
}
