package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class ConsultaDAO implements IDAO<Consulta> {
    private ArrayList<Consulta> consultaDao = new ArrayList<>();

    @Override
    public boolean adicionar(Consulta elemento) {
        if(!consultaDao.contains(elemento)){
            consultaDao.add(elemento);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Consulta buscar(String busca) {
        return null;
    }

    @Override
    public ArrayList<Consulta> listarTodos() {
        return new ArrayList<>(consultaDao);
    }

    @Override
    public boolean remover(Consulta elemento) {
       if (!consultaDao.contains(elemento)){
           consultaDao.remove(elemento);
           return true;
       }
        return false;
    }
}
