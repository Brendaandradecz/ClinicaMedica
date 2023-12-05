package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Limpeza;

import java.util.ArrayList;

public class LimpezaDAO implements IDAO<Limpeza> {
    private ArrayList<Limpeza> limpezaDao = new ArrayList<>();

    @Override
    public ArrayList<Limpeza> getArray() {
        return limpezaDao;
    }

    @Override
    public boolean adicionar(Limpeza elemento) {
        limpezaDao.add(elemento);
        System.out.println("\nFuncionario(a) adicionado(a) ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        for (Limpeza limpeza: limpezaDao) {
            if (limpeza.getCpf().toLowerCase().contains(busca) ||
                    limpeza.getNome().toLowerCase().contains(busca)) {
                System.out.println("\nFuncionario(a) encontrado(a):");
                imprimirInfo(limpeza);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Limpeza> listarTodos() {
        for (Limpeza limpeza: limpezaDao) {
            imprimirInfo(limpeza);
        }
        return limpezaDao;
    }

    @Override
    public boolean remover(Limpeza elemento) {
        limpezaDao.remove(elemento);
        System.out.println("\nFuncionario(a) removido(a) do sistema\n");
        return true;
    }

    @Override
    public void imprimirInfo(Limpeza limpeza) {
        System.out.println("\nInformacoes de " + limpeza.getNome());
        System.out.println("\nNome: " + limpeza.getNome()
                + ". \nCPF: " + limpeza.getCpf()
                + ". \nTelefone: " + limpeza.getTelefone()
                + ". \nEmail: " + limpeza.getEmail());

    }
}
