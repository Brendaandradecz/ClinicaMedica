package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Analise;

import java.util.ArrayList;

public class AnaliseDAO implements IDAO<Analise> {
    private ArrayList<Analise> analiseDao = new ArrayList<>();

    @Override
    public boolean adicionar(Analise elemento) {
        if (!analiseDao.contains(elemento)) {
            analiseDao.add(elemento);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Analise buscar(String busca) {
        return null;
    }

    @Override
    public boolean remover(Analise elemento) {
        if (analiseDao.contains(elemento)) {
            analiseDao.remove(elemento);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ArrayList<Analise> listarTodos() {
        return new ArrayList<>(analiseDao);
    }
}
