package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IBiomedicoDao;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Analise;
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
    public double fazerAnaliseDeAmostras(Analise analise, ColetaDeAmostras coleta) {
        double resultado = Math.random();
        double Positivo = 0.7;

        if (resultado >= Positivo) {
            System.out.println("A análise indicou um resultado positivo.");
        } else {
            System.out.println("A análise indicou um resultado negativo.");
        }

        System.out.println("INFORMAÇÕES DA ANÁLISE DE AMOSTRAS:");
        System.out.println("Coleta de amostras realizada para o paciente " + coleta.getPaciente().getNome() +
                ". Tipo de amostra: " + coleta.getTipo() +
                ". Data e hora da coleta: " + coleta.getDataHora() +
                ". Resultado: " + analise.getResultado());

        return resultado;
    }
}


