package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IRecepcionistaDao;
import br.com.clinicamedica.Model.Recepcionista;

import java.util.ArrayList;

public class RecepcionistaDAO implements IDAO<Recepcionista>, IRecepcionistaDao {
    private ArrayList<Recepcionista> recepcionistaDao = new ArrayList<>();

    @Override
    public boolean adicionar(Recepcionista objeto) {
        return false;
    }

    @Override
    public Recepcionista buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Recepcionista> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Recepcionista objeto) {
        return false;
    }

    @Override
    public boolean marcarCirurgia() {
        return false;
    }

    @Override
    public boolean marcarColeta() {
        return false;
    }

    @Override
    public boolean marcarConsulta() {
        return false;
    }
}
