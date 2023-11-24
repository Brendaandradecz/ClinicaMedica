package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class ConsultaDAO implements IDAO<Consulta> {
    private ArrayList<Consulta> consultaDao = new ArrayList<>();

    @Override
    public boolean adicionar(Consulta objeto) {
        return false;
    }

    @Override
    public Consulta buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Consulta> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Consulta objeto) {
        return false;
    }
}
