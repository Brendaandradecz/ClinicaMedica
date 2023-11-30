package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Analise;

import java.util.ArrayList;

public class AnaliseDAO implements IDAO<Analise> {
    private ArrayList<Analise> analiseDao = new ArrayList<>();

    public ArrayList<Analise> getArray() {
        return analiseDao;
    }

    @Override
    public boolean adicionar(Analise elemento) {
        analiseDao.add(elemento);
        System.out.println("Análise adicionada ao sistema!");
        return true;
    }
    @Override
    public Analise buscar(String busca) {
        for (Analise analise: analiseDao) {
            if(analise.getPaciente().getNome().equals(busca) || analise.getPaciente().getCpf().equals(busca)){
                System.out.println();
                System.out.println("INFORMAÇÕES DA ANÁLISE DE AMOSTRAS:");
                System.out.println("Coleta de amostras realizada para o paciente " + analise.getPaciente().getNome() +
                        ". Data e hora da analise: " + analise.getDataHora() +
                        ". Resultado: " + analise.getResultado()+
                        ". Analise feita por: " + analise.getBiomedico().getNome());
                return analise;
            }
        }
        return null;
    }

    @Override
    public boolean remover(Analise elemento) {
        analiseDao.remove(elemento);
        System.out.println("Analise removida do sistema!");
        return true;
    }
    @Override
    public ArrayList<Analise> listarTodos() {
        for (Analise analise: analiseDao) {
            System.out.println("INFORMAÇÕES DA ANÁLISE DE AMOSTRAS:");
            System.out.println("Coleta de amostras realizada para o paciente " + analise.getPaciente().getNome() +
                    ". Data e hora da analise: " + analise.getDataHora() +
                    ". Resultado: " + analise.getResultado()+
                    ". Analise feita por: " + analise.getBiomedico().getNome());
        }
        return analiseDao;
    }
}
