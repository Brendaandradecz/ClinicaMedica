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
        System.out.println("\nConsulta adicionada ao sistema!\n");
        return true;
    }
    @Override
    public boolean remover(Consulta consulta) {
        consultaDao.remove(consulta);
        System.out.println("\nConsulta removida do sistema!\n");
        return true;
    }
    @Override
    public boolean buscar(String busca) {
        String buscaLowerCase = busca.toLowerCase();
        for (Consulta consulta: consultaDao) {
            if(consulta.getPaciente().getCpf().toLowerCase().contains(buscaLowerCase) ||
                    consulta.getPaciente().getNome().toLowerCase().contains(buscaLowerCase)){
                System.out.println("\nConsulta encontrada:");
                imprimirInfo(consulta);
                return true;
            }
        }
        return false;
    }

    @Override
    public void listarTodos() {
        for (Consulta consulta: consultaDao) {
            imprimirInfo(consulta);
        }
    }
    public Consulta encontrar(String id){
        for (Consulta consulta : consultaDao) {
            if(consulta.getId().equals(id)){
                return consulta;
            }
        }
        return null;
    }

    @Override
    public void imprimirInfo(Consulta consulta) {
        String dia = String.format(consulta.getDataHora().getDayOfMonth() +
                "/" + consulta.getDataHora().getMonthValue() +
                "/" + consulta.getDataHora().getYear() + " as " + consulta.getDataHora().getHour() +
                ":" + consulta.getDataHora().getMinute());

        System.out.println("\nINFORMACOES DA CONSULTA:");
        System.out.println("\nConsulta do paciente " + consulta.getPaciente().getNome() +
                ". \nData e hora da consulta: " + dia +
                ". \nConsulta feita por: " + consulta.getMedico().getNome());
    }
}
