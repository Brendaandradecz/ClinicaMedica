package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Limpeza;

import java.util.ArrayList;

public class LimpezaDAO implements IDAO<Limpeza> {
    private ArrayList<Limpeza> limpezaDao = new ArrayList<>();

    @Override
    public ArrayList<Limpeza> getArray() {
        return limpezaDao;
    }

    @Override
    public boolean adicionar(Limpeza elemento) {
        if (!limpezaDao.contains(elemento)){
            limpezaDao.add(elemento);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Limpeza buscar(String busca) {
        return null;
    }

    @Override
    public ArrayList<Limpeza> listarTodos() {
        return new ArrayList<>(limpezaDao);
    }

    @Override
    public boolean remover(Limpeza elemento) {
        if (!limpezaDao.contains(elemento)){
            limpezaDao.remove(elemento);
            return true;
        }
        return false;
    }
}
