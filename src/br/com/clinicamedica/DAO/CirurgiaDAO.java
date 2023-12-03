package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IDemandas;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class CirurgiaDAO implements IDAO<Cirurgia> {
    private ArrayList<Cirurgia> cirurgiaDao = new ArrayList<>();

    @Override
    public ArrayList<Cirurgia> getArray() {
        return cirurgiaDao;
    }
    @Override
    public boolean adicionar(Cirurgia cirurgia) {
        cirurgiaDao.add(cirurgia);
        System.out.println("Cirurgia adicionado ao sistema!\n");
        return true;
    }
    @Override
    public boolean remover(Cirurgia cirurgia) {
        cirurgiaDao.remove(cirurgia);
        System.out.println("Cirurgia adicionado ao sistema!\n");
        return true;
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
    public Cirurgia encontrar(String id){
        for (Cirurgia cirurgia : cirurgiaDao) {
            if(cirurgia.getId().equals(id)){
                return cirurgia;
            }
        }
        return null;
    }
}
