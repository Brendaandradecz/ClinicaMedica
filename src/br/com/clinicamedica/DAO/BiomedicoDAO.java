package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IBiomedicoDao;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Biomedico;

import java.util.ArrayList;

public class BiomedicoDAO implements IDAO<Biomedico>, IBiomedicoDao {
    private ArrayList<Biomedico> biomedicoDao = new ArrayList<>();

    @Override
    public boolean adicionar(Biomedico objeto) {
        return false;
    }

    @Override
    public Biomedico buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Biomedico> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Biomedico objeto) {
        return false;
    }

    @Override
    public boolean fazerAnalise() {
        return false;
    }
}
