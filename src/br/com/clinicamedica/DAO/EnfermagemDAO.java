package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IEnfermagemDao;
import br.com.clinicamedica.Model.Enfermagem;

import java.util.ArrayList;

public class EnfermagemDAO implements IDAO<Enfermagem>, IEnfermagemDao {
    private ArrayList<Enfermagem> enfermagemDao = new ArrayList<>();

    @Override
    public boolean adicionar(Enfermagem objeto) {
        return false;
    }

    @Override
    public Enfermagem buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList<Enfermagem> listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Enfermagem objeto) {
        return false;
    }

    @Override
    public boolean realizarTriagem() {
        return false;
    }

    @Override
    public boolean realizarColeta() {
        return false;
    }
}
