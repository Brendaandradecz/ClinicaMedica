package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IDemandas;
import br.com.clinicamedica.Model.Analise;
import br.com.clinicamedica.Model.Cirurgia;

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
        System.out.println("Analise adicionada ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        for (Analise analise: analiseDao) {
            if(analise.getPaciente().getNome().equals(busca) || analise.getPaciente().getCpf().equals(busca)){
                System.out.println();
                System.out.println("\nINFORMACOES DA ANALISE DE AMOSTRAS:");
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
            System.out.println("\n INFORMACOES DA ANALISE DE AMOSTRAS:");
            System.out.println("Coleta de amostras realizada para o paciente " + analise.getPaciente().getNome()
                    + ". \nData e hora da analise: " + analise.getDataHora()
                    + ". \nResultado: " + analise.getResultado()
                    + ". \nAnalise feita por: " + analise.getBiomedico().getNome());
        }
        return analiseDao;
    }
    public Analise encontrar(String id){
        for (Analise analise : analiseDao) {
            if(analise.getId().equals(id)){
                return analise;
            }
        }
        return null;
    }
}
