package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IBiomedicoDao;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Model.Analise;
import br.com.clinicamedica.Model.Biomedico;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BiomedicoDAO implements IDAO<Biomedico>, IBiomedicoDao {
    private ArrayList<Biomedico> biomedicoDao = new ArrayList<>();

    @Override
    public ArrayList<Biomedico> getArray() {
        return biomedicoDao;
    }

    @Override
    public boolean adicionar(Biomedico biomedico) {
        biomedicoDao.add(biomedico);
        System.out.println("Biomedico(a) adicionado(a) ao sistema!\n");
        return true;
    }

    @Override
    public Biomedico buscar(String busca) {
        for (Biomedico biomedico : biomedicoDao) {
            if (biomedico.getCpf().equals(busca) || biomedico.getCrbm().equals(busca) || biomedico.getNome().equals(busca)) {
                System.out.println("Informações de " + biomedico.getNome());
                System.out.println("Nome: " + biomedico.getNome()
                + ". \nCRBM: " + biomedico.getCrbm()
                + ". \nCPF: " + biomedico.getCpf()
                + ". \nTelefone: " + biomedico.getTelefone()
                + ". \nEmail: " + biomedico.getEmail());
                return biomedico;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Biomedico> listarTodos() {
        for (Biomedico biomedico : biomedicoDao) {
            System.out.println("Informações de " + biomedico.getNome());
            System.out.println("Nome: " + biomedico.getNome()
                    + ". \nCRBM: " + biomedico.getCrbm()
                    + ". \nCPF: " + biomedico.getCpf()
                    + ". \nTelefone: " + biomedico.getTelefone()
                    + ". \nEmail: " + biomedico.getEmail());
        }
        return biomedicoDao;
    }

    @Override
    public boolean remover(Biomedico biomedico) {
        biomedicoDao.remove(biomedico);
        System.out.println("Biomedico(a) removido do sistema!\n");
        return true;
    }

    @Override
    public boolean fazerAnaliseDeAmostras(Biomedico biomedico, Paciente paciente, LocalDateTime dataHora, double resultado, ColetaDeAmostras coleta) {
        Analise analise = new Analise(dataHora, biomedico, paciente, resultado);
        double Positivo = 0.7;

        if (resultado >= Positivo) {
            System.out.println("A análise indicou um resultado positivo.\n");
        } else {
            System.out.println("A análise indicou um resultado negativo.\n");
        }

        System.out.println("INFORMAÇÕES DA ANÁLISE DE AMOSTRAS:");
        System.out.println("Coleta de amostras realizada para o paciente " + coleta.getPaciente().getNome() +
                ". \nTipo de amostra: " + coleta.getTipo() +
                ". \nData e hora da coleta: " + coleta.getDataHora() +
                ". \nResultado: " + analise.getResultado());

        return true;
    }
}


