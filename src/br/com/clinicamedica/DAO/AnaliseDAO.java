package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Analise;

import java.util.ArrayList;

public class AnaliseDAO implements IDAO<Analise> {
    private ArrayList<Analise> analiseDao = new ArrayList<>();

    public ArrayList<Analise> getArray() {
        return analiseDao;
    }

    public boolean adicionar(Analise analise) {
        analiseDao.add(analise);
        System.out.println("\nAnalise adicionada ao sistema!\n");
        return true;
    }
    @Override
    public boolean remover(Analise analise) {
        analiseDao.remove(analise);
        System.out.println("\nAnalise removida do sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        String buscaLowerCase = busca.toLowerCase();
        for (Analise analise: analiseDao) {
            if(analise.getPaciente().getNome().toLowerCase().contains(buscaLowerCase) ||
                    analise.getPaciente().getCpf().toLowerCase().contains(buscaLowerCase)){
                System.out.println("\nAnalise encontrada:");
                imprimirInfo(analise);
                return true;
            }
        }
        return false;
    }
    @Override
    public void listarTodos() {
        for (Analise analise: analiseDao) {
            imprimirInfo(analise);
        }
    }
    public Analise encontrar(String id){
        for (Analise analise : analiseDao) {
            if(analise.getId().equals(id)){
                return analise;
            }
        }
        return null;
    }

    @Override
    public void imprimirInfo(Analise analise) {
        String dia = String.format(analise.getDataHora().getDayOfMonth() +
                "/" + analise.getDataHora().getMonthValue() +
                "/" + analise.getDataHora().getYear() + " as " + analise.getDataHora().getHour() +
                ":" + analise.getDataHora().getMinute());
        System.out.println("\n INFORMACOES DA ANALISE DE AMOSTRAS:");
        System.out.println("Coleta de amostras realizada para o paciente " + analise.getPaciente().getNome()
                + ". \nData e hora da analise: " + dia
                + ". \nResultado: " + analise.getResultado()
                + ". \nAnalise feita por: " + analise.getBiomedico().getNome());
    }
}
