package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Cirurgia;

import java.util.ArrayList;

public class CirurgiaDAO implements IDAO<Cirurgia> {
    private ArrayList<Cirurgia> cirurgiaDao = new ArrayList<>();

    @Override
    public ArrayList<Cirurgia> getArray() {
        return cirurgiaDao;
    }

    @Override
    public boolean adicionar(Cirurgia elemento) {
        cirurgiaDao.add(elemento);
        return true;

    }

    @Override
    public Cirurgia buscar(String busca) {
        for (Cirurgia cirurgia: cirurgiaDao) {
            if(cirurgia.getPaciente().getCpf().equals(busca) || cirurgia.getPaciente().getNome().equals(busca)){
                return cirurgia;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Cirurgia> listarTodos() {
        return cirurgiaDao;
    }

    @Override
    public boolean remover(Cirurgia elemento) {
        cirurgiaDao.remove(elemento);
        return true;
    }
}
