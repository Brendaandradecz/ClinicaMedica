package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class ColetaDeAmostrasDAO implements IDAO<ColetaDeAmostras> {
    private ArrayList<ColetaDeAmostras> coletaDeAmostrasDao = new ArrayList<>();

    @Override
    public boolean adicionar(ColetaDeAmostras coleta) {
        coletaDeAmostrasDao.add(coleta);
        System.out.println("Coleta De Amostras adicionado ao sistema!\n");
        return true;
    }
    @Override
    public boolean remover(ColetaDeAmostras coleta) {
        coletaDeAmostrasDao.remove(coleta);
        System.out.println("Coleta De Amostras adicionado ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        for (ColetaDeAmostras coleta: coletaDeAmostrasDao) {
            if(coleta.getCodigo().equals(busca) || coleta.getPaciente().getNome().equals(busca) || coleta.getPaciente().getCpf().equals(busca)){
                System.out.println("\nINFORMAÇÕES DA COLETA DE AMOSTRAS:");
                System.out.println("Coleta realizada no paciente " + coleta.getPaciente().getNome() +
                        ". \nData e hora da coleta: " + coleta.getDataHora() +
                        ". \nTipo: " + coleta.getTipo() +
                        ". \nCodigo: " + coleta.getCodigo() +
                        ". \nCondição da amostra: " + coleta.getCondicaoDaAmostra() +
                        ". \nColeta feita por: " + coleta.getEnfermeiro().getNome());
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<ColetaDeAmostras> listarTodos() {
        for (ColetaDeAmostras coleta: coletaDeAmostrasDao) {
            System.out.println("\nINFORMAÇÕES DA COLETA DE AMOSTRAS:");
            System.out.println("Coleta realizada no paciente " + coleta.getPaciente().getNome() +
                    ". \nData e hora da coleta: " + coleta.getDataHora() +
                    ". \nTipo: " + coleta.getTipo() +
                    ". \nCodigo: " + coleta.getCodigo() +
                    ". \nCondição da amostra: " + coleta.getCondicaoDaAmostra() +
                    ". \nColeta feita por: " + coleta.getEnfermeiro().getNome());

        }
        return coletaDeAmostrasDao;
    }
    @Override
    public ArrayList<ColetaDeAmostras> getArray() {
        return coletaDeAmostrasDao;
    }
    public ColetaDeAmostras encontrar(String id){
        for (ColetaDeAmostras coleta : coletaDeAmostrasDao) {
            if(coleta.getId().equals(id)){
                return coleta;
            }
        }
        return null;
    }
}
