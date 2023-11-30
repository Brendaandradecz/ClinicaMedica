package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.ColetaDeAmostras;

import java.util.ArrayList;

public class ColetaDeAmostrasDAO implements IDAO<ColetaDeAmostras> {
    private ArrayList<ColetaDeAmostras> coletaDeAmostrasDao = new ArrayList<>();

    @Override
    public boolean adicionar(ColetaDeAmostras elemento) {
        coletaDeAmostrasDao.add(elemento);
        System.out.println("Coleta de amostras adicionada ao sistema!");
        return true;

    }

    @Override
    public ColetaDeAmostras buscar(String busca) {
        for (ColetaDeAmostras coleta: coletaDeAmostrasDao) {
            if(coleta.getCodigo().equals(busca) || coleta.getPaciente().getNome().equals(busca) || coleta.getPaciente().getCpf().equals(busca)){
                System.out.println("INFORMAÇÕES DA COLETA DE AMOSTRAS:");
                System.out.println("Coleta realizada no paciente " + coleta.getPaciente().getNome() +
                        ". Data e hora da coleta: " + coleta.getDataHora() +
                        ". Tipo: " + coleta.getTipo() +
                        ". Codigo: " + coleta.getCodigo() +
                        ". Condição da amostra: " + coleta.getCondicaoDaAmostra() +
                        ". Coleta feita por: " + coleta.getEnfermeiro().getNome());
                return coleta;
            }
        }
        return null;
    }

    @Override
    public ArrayList<ColetaDeAmostras> listarTodos() {
        for (ColetaDeAmostras coleta: coletaDeAmostrasDao) {
            System.out.println("INFORMAÇÕES DA COLETA DE AMOSTRAS:");
            System.out.println("Coleta realizada no paciente " + coleta.getPaciente().getNome() +
                    ". Data e hora da coleta: " + coleta.getDataHora() +
                    ". Tipo: " + coleta.getTipo() +
                    ". Codigo: " + coleta.getCodigo() +
                    ". Condição da amostra: " + coleta.getCondicaoDaAmostra() +
                    ". Coleta feita por: " + coleta.getEnfermeiro().getNome());

        }
        return coletaDeAmostrasDao;
    }

    @Override
    public boolean remover(ColetaDeAmostras elemento) {
        coletaDeAmostrasDao.remove(elemento);
        System.out.println("Coleta removida do sistema!");
        return true;
    }

    @Override
    public ArrayList<ColetaDeAmostras> getArray() {
        return coletaDeAmostrasDao;
    }
}
