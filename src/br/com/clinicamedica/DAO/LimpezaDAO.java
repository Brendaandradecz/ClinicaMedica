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
        System.out.println("Funcionario(a) adicionado(a) ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        for (Limpeza limpeza: limpezaDao) {
            if (limpeza.getCpf().equals(busca) || limpeza.getNome().equals(busca)) {
                System.out.println("\nInformações de " + limpeza.getNome());
                System.out.println("Nome: " + limpeza.getNome()
                        + ". \nCPF: " + limpeza.getCpf()
                        + ". \nTelefone: " + limpeza.getTelefone()
                        + ". \nEmail: " + limpeza.getEmail());
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Limpeza> listarTodos() {
        for (Limpeza limpeza: limpezaDao) {
            System.out.println("\nInformações de " + limpeza.getNome());
            System.out.println("Nome: " + limpeza.getNome()
                    + ". \nCPF: " + limpeza.getCpf()
                    + ". \nTelefone: " + limpeza.getTelefone()
                    + ". \nEmail: " + limpeza.getEmail());
        }
        return limpezaDao;
    }

    @Override
    public boolean remover(Limpeza elemento) {
        limpezaDao.remove(elemento);
        System.out.println("Funcionario(a) removido(a) do sisstema\n");
        return true;
    }
}
