package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IBiomedicoDao;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Biomedico;

import java.util.ArrayList;

public class BiomedicoDAO implements IDAO<Biomedico>, IBiomedicoDao {
    private ArrayList<Biomedico> biomedicoDao = new ArrayList<>();

    @Override
    public boolean adicionar(Biomedico biomedico) {
        if (!biomedicoDao.contains(biomedico)) {
            biomedicoDao.add(biomedico);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Biomedico buscar(String cpf) {
        for (Biomedico biomedico : biomedicoDao) {
            if (biomedico.getCpf().equals(cpf)) {
                return biomedico;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Biomedico> listarTodos() {
        return new ArrayList<>(biomedicoDao);
    }

    @Override
    public boolean remover(Biomedico biomedico) {
        if (biomedicoDao.contains(biomedico)) {
            biomedicoDao.remove(biomedico);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double fazerAnalise() {
        double resultado = Math.random();
        if (resultado >= 0.7) {
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
        return resultado;
    }
}

