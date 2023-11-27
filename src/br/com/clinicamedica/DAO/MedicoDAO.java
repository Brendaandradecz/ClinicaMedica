package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IMedicoDao;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;
import br.com.clinicamedica.Model.Medico;

import java.util.ArrayList;

public class MedicoDAO implements IDAO<Medico>, IMedicoDao {
    private ArrayList<Medico> medicoDao = new ArrayList<>();

    @Override
    public boolean adicionar(Medico elemento) {
        if (!medicoDao.contains(elemento)) {
            medicoDao.add(elemento);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Medico buscar(String busca) {
        return null;
    }

    @Override
    public ArrayList<Medico> listarTodos() {
        return new ArrayList<>(medicoDao);
    }

    @Override
    public boolean remover(Medico elemento) {
        if (!medicoDao.contains(elemento)) {
            medicoDao.remove(elemento);
        }
        return false;
    }

    @Override
    public ArrayList<Medico> getArray() {
        return medicoDao;
    }

    @Override
    public boolean fazerConsulta(Consulta consulta) {
        System.out.println("Consulta realizada");
        return true;
    }

    @Override
    public boolean fazerCirurgia(Cirurgia cirurgia) {
        System.out.println("Cirurgia será realizada!");
        return true;
    }
}
