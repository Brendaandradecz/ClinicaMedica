package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Limpeza;

import java.util.ArrayList;

public class LimpezaDAO implements IDAO<Limpeza> {
    private ArrayList<Limpeza> limpezaDao = new ArrayList<>();

    @Override
    public boolean adicionar(Limpeza objeto) {
        return false;
    }

    @Override
    public Limpeza buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Limpeza> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Limpeza objeto) {
        return false;
    }
}
