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
    public boolean adicionar(Cirurgia cirurgia) {
        cirurgiaDao.add(cirurgia);
        System.out.println("\nCirurgia adicionada ao sistema!\n");
        return true;
    }
    @Override
    public boolean remover(Cirurgia cirurgia) {
        cirurgiaDao.remove(cirurgia);
        System.out.println("\nCirurgia removida do sistema!\n");
        return true;
    }
    @Override
    public boolean buscar(String busca) {
        String buscaLowerCase = busca.toLowerCase();
        for (Cirurgia cirurgia: cirurgiaDao) {
            if(cirurgia.getPaciente().getCpf().toLowerCase().contains(buscaLowerCase) ||
                    cirurgia.getPaciente().getNome().toLowerCase().contains(buscaLowerCase)){
                System.out.println("\nCirurgia encontrada:");
                imprimirInfo(cirurgia);
                return true;
            }
        }
        return false;
    }

    @Override
    public void listarTodos() {
        for (Cirurgia cirurgia: cirurgiaDao) {
            imprimirInfo(cirurgia);
        }
    }
    public Cirurgia encontrar(String id){
        for (Cirurgia cirurgia : cirurgiaDao) {
            if(cirurgia.getId().equals(id)){
                return cirurgia;
            }
        }
        return null;
    }

    @Override
    public void imprimirInfo(Cirurgia cirurgia) {
        String dia = String.format(cirurgia.getDataHora().getDayOfMonth() +
                "/" + cirurgia.getDataHora().getMonthValue() +
                "/" + cirurgia.getDataHora().getYear() + " as " + cirurgia.getDataHora().getHour() +
                ":" + cirurgia.getDataHora().getMinute());

        System.out.println("\nINFORMACOES DA CIRURGIA:");
        System.out.println("Cirurgia realizada no paciente " + cirurgia.getPaciente().getNome() +
                ". \nData e hora da cirurgia: " + dia +
                ". \nProcedimento: " + cirurgia.getProcedimento() +
                ". \nCirugia feita por: " + cirurgia.getMedico().getNome());
    }
}
