package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class ConsultaDAO implements IDAO<Consulta> {
    private ArrayList<Consulta> consultaDao = new ArrayList<>();

    @Override
    public ArrayList<Consulta> getArray() {
        return consultaDao;
    }

    @Override
    public boolean adicionar(Consulta elemento) {
        consultaDao.add(elemento);
        System.out.println("Consulta adicionada ao sistema!");
        return true;

    }

    @Override
    public Consulta buscar(String busca) {
        for (Consulta consulta: consultaDao) {
            if(consulta.getPaciente().getCpf().equals(busca) || consulta.getPaciente().getNome().equals(busca)){
                System.out.println("INFORMAÇÕES DA CONSULTA:");
                System.out.println("Consulta do paciente " + consulta.getPaciente().getNome() +
                        ". Data e hora da consulta: " + consulta.getDataHora() +
                        ". Consulta feita por: " + consulta.getMedico().getNome());
                return consulta;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Consulta> listarTodos() {
        for (Consulta consulta: consultaDao) {
            System.out.println("INFORMAÇÕES DA CONSULTA:");
            System.out.println("Consulta do paciente " + consulta.getPaciente().getNome() +
                    ". Data e hora da consulta: " + consulta.getDataHora() +
                    ". Consulta feita por: " + consulta.getMedico().getNome());
        }
        return consultaDao;
    }

    @Override
    public boolean remover(Consulta elemento) {
        consultaDao.remove(elemento);
        System.out.println("Consulta removida do sistema!");
        return true;
    }
}
