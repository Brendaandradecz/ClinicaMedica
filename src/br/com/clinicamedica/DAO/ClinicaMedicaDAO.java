package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.ClinicaMedica;

import java.util.ArrayList;

public class ClinicaMedicaDAO implements IDAO<ClinicaMedica> {
    private ArrayList<ClinicaMedica> clinicaMedicaDao = new ArrayList<>();

    @Override
    public boolean adicionar(ClinicaMedica elemento) {
        if(!clinicaMedicaDao.contains(elemento)){
            clinicaMedicaDao.add(elemento);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ClinicaMedica buscar(String busca) {
        return null;
    }


    @Override
    public ArrayList<ClinicaMedica> listarTodos() {
        return new ArrayList<>(clinicaMedicaDao);
    }

    @Override
    public boolean remover(ClinicaMedica elemento) {
        if (!clinicaMedicaDao.contains(elemento)){
            clinicaMedicaDao.remove(elemento);
            return true;
        }else{
            return false;
        }
    }
}
