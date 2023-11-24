package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.ColetaDeAmostras;

import java.util.ArrayList;

public class ColetaDeAmostrasDAO implements IDAO<ColetaDeAmostras> {
    private ArrayList<ColetaDeAmostras> coletaDeAmostrasDao = new ArrayList<>();

    @Override
    public boolean adicionar(ColetaDeAmostras objeto) {
        return false;
    }

    @Override
    public ColetaDeAmostras buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<ColetaDeAmostras> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(ColetaDeAmostras objeto) {
        return false;
    }
}
