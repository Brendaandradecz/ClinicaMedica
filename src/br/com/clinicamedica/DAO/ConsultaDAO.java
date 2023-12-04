package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class ConsultaDAO implements IDAO<Consulta> {
    private ArrayList<Consulta> consultaDao = new ArrayList<>();

    @Override
    public ArrayList<Consulta> getArray() {
        return consultaDao;
    }
    @Override
    public boolean adicionar(Consulta consulta) {
        consultaDao.add(consulta);
        System.out.println("\nConsulta adicionado ao sistema!\n");
        return true;
    }
    @Override
    public boolean remover(Consulta consulta) {
        consultaDao.remove(consulta);
        System.out.println("\nConsulta adicionado ao sistema!\n");
        return true;
    }
    @Override
    public boolean buscar(String busca) {
        for (Consulta consulta: consultaDao) {
            if(consulta.getPaciente().getCpf().equals(busca) || consulta.getPaciente().getNome().equals(busca)){
                System.out.println("\nINFORMACOES DA CONSULTA:");
                System.out.println("\nConsulta do paciente " + consulta.getPaciente().getNome() +
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
            System.out.println("\nINFORMACOES DA CONSULTA:");
            System.out.println("\nConsulta do paciente " + consulta.getPaciente().getNome() +
                    ". \nData e hora da consulta: " + consulta.getDataHora() +
                    ". \nConsulta feita por: " + consulta.getMedico().getNome());
        }
        return consultaDao;
    }
    public Consulta encontrar(String id){
        for (Consulta consulta : consultaDao) {
            if(consulta.getId().equals(id)){
                return consulta;
            }
        }
        return null;
    }
}
