package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.ColetaDeAmostras;

import java.util.ArrayList;

public class ColetaDeAmostrasDAO implements IDAO<ColetaDeAmostras> {
    private ArrayList<ColetaDeAmostras> coletaDeAmostrasDao = new ArrayList<>();

    @Override
    public boolean adicionar(ColetaDeAmostras coleta) {
        coletaDeAmostrasDao.add(coleta);
        System.out.println("\nColeta De Amostras adicionada ao sistema!\n");
        return true;
    }
    @Override
    public boolean remover(ColetaDeAmostras coleta) {
        coletaDeAmostrasDao.remove(coleta);
        System.out.println("\nColeta De Amostras removida do sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        String buscaLowerCase = busca.toLowerCase();
        for (ColetaDeAmostras coleta: coletaDeAmostrasDao) {
            if(coleta.getPaciente().getNome().toLowerCase().contains(buscaLowerCase) ||
                    coleta.getPaciente().getCpf().toLowerCase().contains(buscaLowerCase)){
                System.out.println("\nColeta de Amostras encontrada:");
                imprimirInfo(coleta);
                return true;
            }
        }
        return false;
    }

    @Override
    public void listarTodos() {
        for (ColetaDeAmostras coleta: coletaDeAmostrasDao) {
            imprimirInfo(coleta);
        }
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

    @Override
    public void imprimirInfo(ColetaDeAmostras coleta) {
        String dia = String.format(coleta.getDataHora().getDayOfMonth() +
                "/" + coleta.getDataHora().getMonthValue() +
                "/" + coleta.getDataHora().getYear() + " as " + coleta.getDataHora().getHour() +
                ":" + coleta.getDataHora().getMinute());

        System.out.println("\nINFORMACOES DA COLETA DE AMOSTRAS:");
        System.out.println("Coleta realizada no paciente " + coleta.getPaciente().getNome() +
                ". \nData e hora da coleta: " + dia +
                ". \nTipo: " + coleta.getTipo() +
                ". \nIdentificacao: " + coleta.getId() +
                ". \nCondição da amostra: " + coleta.getCondicaoDaAmostra() +
                ". \nColeta feita por: " + coleta.getEnfermeiro().getNome());
    }
}
