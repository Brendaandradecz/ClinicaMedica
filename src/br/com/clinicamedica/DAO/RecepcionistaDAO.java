package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IRecepcionistaDao;
import br.com.clinicamedica.Controller.CirurgiaController;
import br.com.clinicamedica.Controller.ColetaDeAmostrasController;
import br.com.clinicamedica.Controller.ConsultaController;
import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RecepcionistaDAO implements IDAO<Recepcionista>, IRecepcionistaDao {
    private ArrayList<Recepcionista> recepcionistaDao = new ArrayList<>();
    private ConsultaController consultaController = new ConsultaController();
    private CirurgiaController cirurgiaController = new CirurgiaController();
    private ColetaDeAmostrasController coletaController = new ColetaDeAmostrasController();

    @Override
    public ArrayList<Recepcionista> getArray() {
        return recepcionistaDao;
    }

    @Override
    public boolean adicionar(Recepcionista elemento) {
        recepcionistaDao.add(elemento);
        System.out.println("\nRecepcionista adicionado(a) ao sistema!\n");
        return true;

    }

    @Override
    public boolean buscar(String busca) {
        String buscaLowerCase = busca.toLowerCase();
        for (Recepcionista recepcionista: recepcionistaDao) {
            if(recepcionista.getNome().toLowerCase().contains(buscaLowerCase) ||
                    recepcionista.getCpf().toLowerCase().contains(buscaLowerCase)){
                System.out.println("\nRecepcionista encontrado(a):");
                imprimirInfo(recepcionista);
                return true;
            }
        }
        return false;
    }
    @Override
    public void listarTodos() {
        for (Recepcionista recepcionista: recepcionistaDao) {
            imprimirInfo(recepcionista);
        }
    }

    @Override
    public void imprimirInfo(Recepcionista recepcionista) {
        System.out.println("\nInformacoes de " + recepcionista.getNome());
        System.out.println("Nome: " + recepcionista.getNome()
                + ". \nCPF: " + recepcionista.getCpf()
                + ". \nTelefone: " + recepcionista.getTelefone()
                + ". \nEmail: " + recepcionista.getEmail());
    }

    @Override
    public boolean remover(Recepcionista elemento) {
        recepcionistaDao.add(elemento);
        System.out.println("\nRecepcionista removido(a) do sistema!\n");
        return true;
    }

    @Override
    public boolean marcarCirurgia(String id, LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento) {
        Cirurgia cirurgia = new Cirurgia(dataHora, medico, paciente, procedimento, id);
        cirurgiaController.adicionar(cirurgia);

        String dia = String.format(cirurgia.getDataHora().getDayOfMonth() +
                "/" + cirurgia.getDataHora().getMonthValue() +
                "/" + cirurgia.getDataHora().getYear() + " as " + cirurgia.getDataHora().getHour() +
                ":" + cirurgia.getDataHora().getMinute());

        System.out.println("\nCirurgia marcada - INFORMACOES DA CIRURGIA");
        System.out.println("Data e Hora: " + dia +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome() +
                "\nProcedimento: " + procedimento);
        return true;
    }
    @Override
    public boolean marcarConsulta(String id, LocalDateTime dataHora, Medico medico, Paciente paciente) {
        Consulta consulta = new Consulta(dataHora, paciente, medico, id);
        consultaController.adicionar(consulta);

        String dia = String.format(consulta.getDataHora().getDayOfMonth() +
                "/" + consulta.getDataHora().getMonthValue() +
                "/" + consulta.getDataHora().getYear() + " as " + consulta.getDataHora().getHour() +
                ":" + consulta.getDataHora().getMinute());

        System.out.println("\nConsulta marcada - INFORMACOES DA CONSULTA");
        System.out.println("Data e Hora: " + dia +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome());
        return true;
    }
    @Override
    public boolean marcarColeta(String id, LocalDateTime dataHora, Enfermagem enfermeiro, String tipo, Paciente paciente, String condicaoDaAmostra) {
        ColetaDeAmostras coleta = new ColetaDeAmostras(tipo, enfermeiro, paciente, dataHora, condicaoDaAmostra, id);
        coletaController.adicionar(coleta);
        String dia = String.format(coleta.getDataHora().getDayOfMonth() +
                "/" + coleta.getDataHora().getMonthValue() +
                "/" + coleta.getDataHora().getYear() + " as " + coleta.getDataHora().getHour() +
                ":" + coleta.getDataHora().getMinute());

        System.out.println("\nColeta marcada - INFORMACOES DA COLETA");
        System.out.println("Data e Hora: " + dia +
                "\nEnfermeiro: " + enfermeiro.getNome() +
                "\nIdentificacao: " + id +
                "\nTipo: " + tipo +
                "\nPaciente: " + paciente.getNome());
        return true;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, Cirurgia cirurgia) {
        cirurgia.setDataHora(alteracao);

        String dia = String.format(alteracao.getDayOfMonth() +
                "/" + alteracao.getMonthValue() +
                "/" + alteracao.getYear() + " as " + alteracao.getHour() +
                ":" + alteracao.getMinute());

        System.out.println("\nDATA DA CIRURGIA (Alteração Realizada) - CIRUGIA");
        System.out.println("Nova Data e Hora: " + dia +
                "\nMédico: " + cirurgia.getMedico().getNome() +
                "\nPaciente: " + cirurgia.getPaciente().getNome() +
                "\nProcedimento: " + cirurgia.getProcedimento());
        return true;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, ColetaDeAmostras coleta) {
        coleta.setDataHora(alteracao);

        String dia = String.format(alteracao.getDayOfMonth() +
                "/" + alteracao.getMonthValue() +
                "/" + alteracao.getYear() + " as " + alteracao.getHour() +
                ":" + alteracao.getMinute());

        System.out.println("\nNOVA DATA DA COLETA (Alteração Realizada) - COLETA");
        System.out.println("Nova Data e Hora: " + dia +
                "\nEnfermeiro: " + coleta.getEnfermeiro().getNome() +
                "\nPaciente: " + coleta.getPaciente().getNome() +
                "\nTipo: " + coleta.getTipo());
        return true;
}
    @Override
    public boolean alterarData(LocalDateTime alteracao, Consulta consulta) {
        consulta.setDataHora(alteracao);

        String dia = String.format(alteracao.getDayOfMonth() +
                "/" + alteracao.getMonthValue() +
                "/" + alteracao.getYear() + " as " + alteracao.getHour() +
                ":" + alteracao.getMinute());

        System.out.println("\nNOVA DATA DA CONSULTA (Alteração Realizada) - CONSULTA");
        System.out.println("Nova Data e Hora: " + dia +
                "\nMédico: " + consulta.getMedico().getNome() +
                "\nPaciente: " + consulta.getPaciente().getNome());
        return true;
    }
    @Override
    public boolean adicionar(Consulta consulta) {
        return this.consultaController.adicionar(consulta);
    }

    @Override
    public boolean adicionar(ColetaDeAmostras coleta) {
        return this.coletaController.adicionar(coleta);
    }

    @Override
    public boolean adicionar(Cirurgia cirurgia) {
        return this.cirurgiaController.adicionar(cirurgia);
    }

    @Override
    public boolean remover(Consulta consulta) {
        return this.consultaController.remover(consulta);
    }

    @Override
    public boolean remover(ColetaDeAmostras coleta) {
        return this.coletaController.remover(coleta);
    }

    @Override
    public boolean remover(Cirurgia cirurgia) {
        return this.cirurgiaController.remover(cirurgia);
    }

    @Override
    public boolean buscarConsulta(String busca) {
        return this.consultaController.buscar(busca);
    }

    @Override
    public boolean buscarColeta(String busca) {
        return this.coletaController.buscar(busca);
    }

    @Override
    public boolean buscarCirurgia(String busca) {
        return this.consultaController.buscar(busca);
    }

    @Override
    public void listarConsultas() {
        this.consultaController.listarTodos();
    }

    @Override
    public void listarCirurgias() {
        this.cirurgiaController.listarTodos();
    }

    @Override
    public void listarColetas() {
        this.coletaController.listarTodos();
    }
    @Override
    public Consulta encontrarConsulta(String id) {
        return this.consultaController.encontrar(id);
    }

    @Override
    public Cirurgia encontrarCirurgia(String id) {
        return this.cirurgiaController.encontrar(id);
    }

    @Override
    public ColetaDeAmostras encontrarColeta(String id) {
        return this.coletaController.encontrar(id);
    }
}

