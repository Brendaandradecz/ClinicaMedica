package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDemandas;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class ConsultaDAO implements IDemandas<Consulta> {
    private ArrayList<Consulta> consultaDao = new ArrayList<>();

    @Override
    public ArrayList<Consulta> getArray() {
        return consultaDao;
    }

    @Override
    public boolean adicionar(String id) {
        for (Consulta consulta: consultaDao) {
            if(consulta.getId().equals(id)){
                consultaDao.add(consulta);
                System.out.println("Consulta adicionada do sistema!\n");
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean remover(String id) {
        for (Consulta consulta: consultaDao) {
            if(consulta.getId().equals(id)){
                consultaDao.add(consulta);
                System.out.println("Consulta removida do sistema!\n");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean buscar(String busca) {
        for (Consulta consulta: consultaDao) {
            if(consulta.getPaciente().getCpf().equals(busca) || consulta.getPaciente().getNome().equals(busca)){
                System.out.println("\nINFORMAÇÕES DA CONSULTA:");
                System.out.println("Consulta do paciente " + consulta.getPaciente().getNome() +
                        ". \nData e hora da consulta: " + consulta.getDataHora() +
                        ". \nConsulta feita por: " + consulta.getMedico().getNome());
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Consulta> listarTodos() {
        for (Consulta consulta: consultaDao) {
            System.out.println("\nINFORMAÇÕES DA CONSULTA:");
            System.out.println("Consulta do paciente " + consulta.getPaciente().getNome() +
                    ". \nData e hora da consulta: " + consulta.getDataHora() +
                    ". \nConsulta feita por: " + consulta.getMedico().getNome());
        }
        return consultaDao;
    }
}
