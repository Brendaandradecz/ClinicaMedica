package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDemandas;
import br.com.clinicamedica.Model.Cirurgia;

import java.util.ArrayList;

public class CirurgiaDAO implements IDemandas<Cirurgia> {
    private ArrayList<Cirurgia> cirurgiaDao = new ArrayList<>();

    @Override
    public ArrayList<Cirurgia> getArray() {
        return cirurgiaDao;
    }

    @Override
    public boolean adicionar(String id) {
        for (Cirurgia cirurgia: cirurgiaDao) {
            if(cirurgia.getId().equals(id)){
                cirurgiaDao.add(cirurgia);
                System.out.println("Cirurgia adicionada do sistema!\n");
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean remover(String id) {
        for (Cirurgia cirurgia: cirurgiaDao) {
            if(cirurgia.getId().equals(id)){
                cirurgiaDao.remove(cirurgia);
                System.out.println("Cirurgia removida do sistema!\n");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean buscar(String busca) {
        for (Cirurgia cirurgia: cirurgiaDao) {
            if(cirurgia.getPaciente().getCpf().equals(busca) || cirurgia.getPaciente().getNome().equals(busca)){
                System.out.println("\nINFORMAÇÕES DA CIRURGIA:");
                System.out.println("Cirurgia realizada no paciente " + cirurgia.getPaciente().getNome() +
                        ". \nData e hora da cirurgia: " + cirurgia.getDataHora() +
                        ". \nProcedimento: " + cirurgia.getProcedimento() +
                        ". \nCirugia feita por: " + cirurgia.getMedico().getNome());
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Cirurgia> listarTodos() {
        for (Cirurgia cirurgia: cirurgiaDao) {
            System.out.println("\nINFORMAÇÕES DA CIRURGIA:");
            System.out.println("Cirurgia realizada no paciente " + cirurgia.getPaciente().getNome() +
                    ". \nData e hora da cirurgia: " + cirurgia.getDataHora() +
                    ". \nProcedimento: " + cirurgia.getProcedimento() +
                    ". \nCirugia feita por: " + cirurgia.getMedico().getNome());
        }
        return cirurgiaDao;
    }

}
