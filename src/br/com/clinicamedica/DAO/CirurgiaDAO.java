package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Biomedico;
import br.com.clinicamedica.Model.Cirurgia;

import java.util.ArrayList;

public class CirurgiaDAO implements IDAO<Cirurgia> {
    private ArrayList<Cirurgia> cirurgiaDao = new ArrayList<>();

    @Override
    public boolean adicionar(Cirurgia objeto) {
        return false;
    }

    @Override
    public Cirurgia buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Cirurgia> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Cirurgia objeto) {
        return false;
    }
}
