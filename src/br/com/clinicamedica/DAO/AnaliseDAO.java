package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Analise;

import java.util.ArrayList;

public class AnaliseDAO implements IDAO<Analise> {
    private ArrayList<Analise> analiseDao = new ArrayList<>();

    public ArrayList<Analise> getArray() {
        return analiseDao;
    }

    @Override
    public boolean adicionar(Analise elemento) {
        analiseDao.add(elemento);
        System.out.println("adicionou");
        return true;
    }
    @Override
    public Analise buscar(String busca) {
        for (Analise analise: analiseDao) {
            if(analise.getPaciente().getNome().equals(busca) || analise.getPaciente().getCpf().equals(busca)){
                return analise;
            }
        }
        return null;
    }

    @Override
    public boolean remover(Analise elemento) {
        analiseDao.remove(elemento);
        return true;
    }
    @Override
    public ArrayList<Analise> listarTodos() {
        return analiseDao;
    }
}
