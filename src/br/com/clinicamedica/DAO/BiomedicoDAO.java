package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IBiomedicoDao;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Biomedico;
import br.com.clinicamedica.Model.ColetaDeAmostras;

import java.util.ArrayList;

public class BiomedicoDAO implements IDAO<Biomedico>, IBiomedicoDao {
    private ArrayList<Biomedico> biomedicoDao = new ArrayList<>();

    @Override
    public ArrayList<Biomedico> getArray() {
        return biomedicoDao;
    }

    @Override
    public boolean adicionar(Biomedico biomedico) {
        biomedicoDao.add(biomedico);
        return true;
    }

    @Override
    public Biomedico buscar(String busca) {
        for (Biomedico biomedico : biomedicoDao) {
            if (biomedico.getCpf().equals(busca) || biomedico.getCrbm().equals(busca) || biomedico.getNome().equals(busca)) {
                return biomedico;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Biomedico> listarTodos() {
        return biomedicoDao;
    }

    @Override
    public boolean remover(Biomedico biomedico) {
        biomedicoDao.remove(biomedico);
        return true;
    }

    @Override
    public double fazerAnaliseDeAmostras(ColetaDeAmostras coleta) {
        double resultado = Math.random();
        if (resultado >= 0.7) {
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
        return resultado;
    }
}

