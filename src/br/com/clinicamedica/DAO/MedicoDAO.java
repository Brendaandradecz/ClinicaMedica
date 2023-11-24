package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IMedicoDao;
import br.com.clinicamedica.Model.Medico;

import java.util.ArrayList;

public class MedicoDAO implements IDAO<Medico>, IMedicoDao {
    private ArrayList<Medico> medicoDao = new ArrayList<>();

    @Override
    public boolean adicionar(Medico objeto) {
        return false;
    }

    @Override
    public Medico buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Medico> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Medico objeto) {
        return false;
    }

    @Override
    public boolean fazerConsulta() {
        return false;
    }

    @Override
    public boolean fazerCirurgia() {
        return false;
    }
}
