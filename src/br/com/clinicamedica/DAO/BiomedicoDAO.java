package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IBiomedicoDao;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Controller.AnaliseController;
import br.com.clinicamedica.Model.Analise;
import br.com.clinicamedica.Model.Biomedico;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BiomedicoDAO implements IDAO<Biomedico>, IBiomedicoDao {
    private ArrayList<Biomedico> biomedicoDao = new ArrayList<>();
    private AnaliseController analiseController =  new AnaliseController();

    @Override
    public ArrayList<Biomedico> getArray() {
        return biomedicoDao;
    }

    @Override
    public boolean adicionar(Biomedico biomedico) {
        biomedicoDao.add(biomedico);
        System.out.println("\nBiomedico(a) adicionado(a) ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        String buscaLowerCase = busca.toLowerCase();
        for (Biomedico biomedico : biomedicoDao) {
            if (biomedico.getCpf().toLowerCase().contains(buscaLowerCase) ||
                    biomedico.getCrbm().toLowerCase().contains(buscaLowerCase) ||
                    biomedico.getNome().toLowerCase().contains(buscaLowerCase)) {
                System.out.println("\nBiomedico(a) encontrado(a):");
                imprimirInfo(biomedico);
                return true;
            }
        }
        return false;
    }

    @Override
    public void listarTodos() {
        for (Biomedico biomedico : biomedicoDao) {
            imprimirInfo(biomedico);
        }
    }

    @Override
    public boolean remover(Biomedico biomedico) {
        biomedicoDao.remove(biomedico);
        System.out.println("\nBiomedico(a) removido do sistema!\n");
        return true;
    }

    @Override
    public boolean fazerAnaliseDeAmostras(String id, Biomedico biomedico, Paciente paciente, LocalDateTime dataHora, double resultado, ColetaDeAmostras coleta) {
        Analise analise = new Analise(dataHora, biomedico, paciente, resultado, id);
        analiseController.adicionar(analise);
        double Positivo = 0.7;

        String diaAnalise = String.format(analise.getDataHora().getDayOfMonth() +
                "/" + analise.getDataHora().getMonthValue() +
                "/" + analise.getDataHora().getYear() + " as " + analise.getDataHora().getHour() +
                ":" + analise.getDataHora().getMinute());

        String diaColeta = String.format(coleta.getDataHora().getDayOfMonth() +
                "/" + coleta.getDataHora().getMonthValue() +
                "/" + coleta.getDataHora().getYear() + " as " + coleta.getDataHora().getHour() +
                ":" + coleta.getDataHora().getMinute());

        if (resultado >= Positivo) {
            System.out.println("A analise indicou um resultado positivo.\n");
        } else {
            System.out.println("A analise indicou um resultado negativo.\n");
        }
        System.out.println("INFORMACOES DA ANALISE DE AMOSTRAS:");
        System.out.println("Coleta de amostras realizada para o paciente " + coleta.getPaciente().getNome() +
                ". \nTipo de amostra: " + coleta.getTipo() +
                ". \nData e hora da coleta: " + diaColeta +
                ". \nData e hora da analise: " + diaAnalise +
                ". \nResultado: " + analise.getResultado());

        return true;
    }

    @Override
    public boolean adicionarAnalise(Analise analise) {
        return this.analiseController.adicionar(analise);
    }

    @Override
    public boolean buscarAnalise(String busca) {
        return this.analiseController.buscar(busca);
    }

    @Override
    public void listarAnalise() {
        this.analiseController.listarTodos();
    }

    @Override
    public boolean removerAnalise(Analise analise) {
        return this.analiseController.remover(analise);
    }

    @Override
    public void imprimirInfo(Biomedico biomedico) {
        System.out.println("\nInformacoes de " + biomedico.getNome());
        System.out.println("Nome: " + biomedico.getNome()
                + ". \nCRBM: " + biomedico.getCrbm()
                + ". \nCPF: " + biomedico.getCpf()
                + ". \nTelefone: " + biomedico.getTelefone()
                + ". \nEmail: " + biomedico.getEmail());
    }
}


