package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class ConsultaDAO implements IDAO<Consulta> {
    private ArrayList<Consulta> consultaDao = new ArrayList<>();

    @Override
    public ArrayList<Consulta> getArray() {
        return consultaDao;
    }

    @Override
    public boolean adicionar(Consulta elemento) {
        consultaDao.add(elemento);
        return true;

    }

    @Override
    public Consulta buscar(String busca) {
        for (Consulta consulta: consultaDao) {
            if(consulta.getPaciente().getCpf().equals(busca) || consulta.getPaciente().getNome().equals(busca)){
                return consulta;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Consulta> listarTodos() {
        return consultaDao;
    }

    @Override
    public boolean remover(Consulta elemento) {
        consultaDao.remove(elemento);
        return true;
    }
}
