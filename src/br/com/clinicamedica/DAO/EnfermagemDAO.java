package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IEnfermagemDao;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Enfermagem;
import br.com.clinicamedica.Model.Paciente;

import java.util.ArrayList;

public class EnfermagemDAO implements IDAO<Enfermagem>, IEnfermagemDao {
    private ArrayList<Enfermagem> enfermagemDao = new ArrayList<>();

    @Override
    public boolean adicionar(Enfermagem elemento) {
        if (!enfermagemDao.contains(elemento)) {
            enfermagemDao.add(elemento);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Enfermagem buscar(String busca) {
        return null;
    }


    @Override
    public ArrayList<Enfermagem> listarTodos() {
        return new ArrayList<>(enfermagemDao);
    }

    @Override
    public ArrayList<Enfermagem> getArray() {
        return enfermagemDao;
    }

    @Override
    public boolean remover(Enfermagem elemento) {
        if (!enfermagemDao.contains(elemento)) {
            enfermagemDao.remove(elemento);
            return true;
        }
        return false;
    }

    @Override
    public boolean realizarTriagem(Paciente paciente) {
        System.out.println("Triagem realizada para o paciente: " + paciente.getNome());
        return true;
    }

    @Override
    public boolean realizarColeta(Paciente paciente, ColetaDeAmostras coletaDeAmostras) {
        System.out.println("Coleta de amostras realizada para o paciente: " + paciente.getNome());
        return true;
    }
}
