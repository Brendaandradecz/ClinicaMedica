package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.ColetaDeAmostras;

import java.util.ArrayList;

public class ColetaDeAmostrasDAO implements IDAO<ColetaDeAmostras> {
    private ArrayList<ColetaDeAmostras> coletaDeAmostrasDao = new ArrayList<>();

    @Override
    public boolean adicionar(ColetaDeAmostras elemento) {
        coletaDeAmostrasDao.add(elemento);
        return true;

    }

    @Override
    public ColetaDeAmostras buscar(String busca) {
        for (ColetaDeAmostras coleta: coletaDeAmostrasDao) {
            if(coleta.getCodigo().equals(busca) || coleta.getPaciente().getNome().equals(busca) || coleta.getPaciente().getCpf().equals(busca)){
                return coleta;
            }
        }
        return null;
    }

    @Override
    public ArrayList<ColetaDeAmostras> listarTodos() {
        return coletaDeAmostrasDao;
    }

    @Override
    public boolean remover(ColetaDeAmostras elemento) {
        coletaDeAmostrasDao.remove(elemento);
        return true;
    }

    @Override
    public ArrayList<ColetaDeAmostras> getArray() {
        return coletaDeAmostrasDao;
    }
}
