package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDemandas;
import br.com.clinicamedica.Model.Analise;

import java.util.ArrayList;

public class AnaliseDAO implements IDemandas<Analise> {
    private ArrayList<Analise> analiseDao = new ArrayList<>();

    public ArrayList<Analise> getArray() {
        return analiseDao;
    }

    @Override
    public boolean adicionar(String id) {
        for (Analise analise: analiseDao) {
            if(analise.getId().equals(id)){
                analiseDao.add(analise);
                System.out.println("Analise adicionada do sistema!\n");
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean remover(String id) {
        for (Analise analise: analiseDao) {
            if(analise.getId().equals(id)){
                analiseDao.remove(analise);
                System.out.println("Analise removida do sistema!\n");
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean buscar(String busca) {
        for (Analise analise: analiseDao) {
            if(analise.getPaciente().getNome().equals(busca) || analise.getPaciente().getCpf().equals(busca)){
                System.out.println();
                System.out.println("\nINFORMAÇÕES DA ANALISE DE AMOSTRAS:");
                System.out.println("Coleta de amostras realizada para o paciente " + analise.getPaciente().getNome()
                        + ". \nData e hora da analise: " + analise.getDataHora()
                        + ". \nResultado: " + analise.getResultado()
                        + ". \nAnalise feita por: " + analise.getBiomedico().getNome() );
                return true;
            }
        }
        return false;
    }
    @Override
    public ArrayList<Analise> listarTodos() {
        for (Analise analise: analiseDao) {
            System.out.println("\n INFORMAÇÕES DA ANALISE DE AMOSTRAS:");
            System.out.println("Coleta de amostras realizada para o paciente " + analise.getPaciente().getNome()
                    + ". \nData e hora da analise: " + analise.getDataHora()
                    + ". \nResultado: " + analise.getResultado()
                    + ". \nAnalise feita por: " + analise.getBiomedico().getNome());
        }
        return analiseDao;
    }
}
