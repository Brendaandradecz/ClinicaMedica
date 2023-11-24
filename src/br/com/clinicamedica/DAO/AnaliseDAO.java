package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Analise;

import java.util.ArrayList;

public class AnaliseDAO implements IDAO<Analise> {
    private ArrayList<Analise> analiseDao = new ArrayList<>();

    @Override
    public boolean adicionar(Analise objeto) {
        return false;
    }

    @Override
    public Analise buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Analise> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Analise objeto) {
        return false;
    }
}
