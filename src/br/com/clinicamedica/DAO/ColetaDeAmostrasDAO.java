package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.ColetaDeAmostras;

import java.util.ArrayList;

public class ColetaDeAmostrasDAO implements IDAO<ColetaDeAmostras> {
    private ArrayList<ColetaDeAmostras> coletaDeAmostrasDao = new ArrayList<>();

    @Override
    public boolean adicionar(ColetaDeAmostras elemento) {
        if (!coletaDeAmostrasDao.contains(elemento)){
            coletaDeAmostrasDao.add(elemento);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ColetaDeAmostras buscar(String busca) {
        return null;
    }

    @Override
    public ArrayList<ColetaDeAmostras> listarTodos() {
        return new ArrayList<>(coletaDeAmostrasDao);
    }

    @Override
    public boolean remover(ColetaDeAmostras elemento) {
        if (!coletaDeAmostrasDao.contains(elemento)){
            coletaDeAmostrasDao.remove(elemento);
        }
        return false;
    }

    @Override
    public ArrayList<ColetaDeAmostras> getArray() {
        return coletaDeAmostrasDao;
    }
}
