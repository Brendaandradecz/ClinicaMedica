package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Cirurgia;

import java.util.ArrayList;

public class CirurgiaDAO implements IDAO<Cirurgia> {
    private ArrayList<Cirurgia> cirurgiaDao = new ArrayList<>();

    @Override
    public ArrayList<Cirurgia> getArray() {
        return cirurgiaDao;
    }

    @Override
    public boolean adicionar(Cirurgia elemento) {
        cirurgiaDao.add(elemento);
        System.out.println("Cirurgia adicionada ao sistema!\n");
        return true;

    }

    @Override
    public Cirurgia buscar(String busca) {
        for (Cirurgia cirurgia: cirurgiaDao) {
            if(cirurgia.getPaciente().getCpf().equals(busca) || cirurgia.getPaciente().getNome().equals(busca)){
                System.out.println("INFORMAÇÕES DA CIRURGIA:");
                System.out.println("Cirurgia realizada no paciente " + cirurgia.getPaciente().getNome() +
                        ". \nData e hora da cirurgia: " + cirurgia.getDataHora() +
                        ". \nProcedimento: " + cirurgia.getProcedimento() +
                        ". \nCirugia feita por: " + cirurgia.getMedico().getNome());
                return cirurgia;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Cirurgia> listarTodos() {
        for (Cirurgia cirurgia: cirurgiaDao) {
            System.out.println("INFORMAÇÕES DA CIRURGIA:");
            System.out.println("Cirurgia realizada no paciente " + cirurgia.getPaciente().getNome() +
                    ". \nData e hora da cirurgia: " + cirurgia.getDataHora() +
                    ". \nProcedimento: " + cirurgia.getProcedimento() +
                    ". \nCirugia feita por: " + cirurgia.getMedico().getNome());
        }
        return cirurgiaDao;
    }

    @Override
    public boolean remover(Cirurgia elemento) {
        cirurgiaDao.remove(elemento);
        System.out.println("Cirurgia removida do sistema!\n");
        return true;
    }
}
