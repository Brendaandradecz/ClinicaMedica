package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Cirurgia;

import java.util.ArrayList;

public class CirurgiaDAO implements IDAO<Cirurgia> {
    private ArrayList<Cirurgia> cirurgiaDao = new ArrayList<>();

    @Override
    public boolean adicionar(Cirurgia elemento) {
        if(!cirurgiaDao.contains(elemento)){
            cirurgiaDao.add(elemento);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Cirurgia buscar(String busca) {
        return null;
    }

    @Override
    public ArrayList<Cirurgia> listarTodos() {
        return new ArrayList<>(cirurgiaDao);
    }

    @Override
    public boolean remover(Cirurgia elemento) {
        if (!cirurgiaDao.contains(elemento)){
            cirurgiaDao.remove(elemento);
            return true;
        }else{
            return false;
        }
    }
}
