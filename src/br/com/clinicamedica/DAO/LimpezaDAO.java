package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Enfermagem;
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
        limpezaDao.add(elemento);
        return true;
    }

    @Override
    public Limpeza buscar(String busca) {
        for (Limpeza limpeza: limpezaDao) {
            if (limpeza.getCpf().equals(busca) || limpeza.getNome().equals(busca)) {
                return limpeza;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Limpeza> listarTodos() {
        return limpezaDao;
    }

    @Override
    public boolean remover(Limpeza elemento) {
        limpezaDao.remove(elemento);
        return true;
    }
}
