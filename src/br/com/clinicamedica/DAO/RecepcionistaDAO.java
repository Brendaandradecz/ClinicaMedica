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
        System.out.println("Recepcionista adicionado(a) ao sistema!\n");
        return true;

    }

    @Override
    public boolean buscar(String busca) {
        for (Recepcionista recepcionista: recepcionistaDao) {
            if(recepcionista.getNome().equals(busca) || recepcionista.getCpf().equals(busca)){
                System.out.println("\nInformacoes de " + recepcionista.getNome());
                System.out.println("Nome: " + recepcionista.getNome()
                        + ". \nCPF: " + recepcionista.getCpf()
                        + ". \nTelefone: " + recepcionista.getTelefone()
                        + ". \nEmail: " + recepcionista.getEmail());
                return true;
            }
        }
        return false;
    }
    @Override
    public ArrayList<Recepcionista> listarTodos() {
        for (Recepcionista recepcionista: recepcionistaDao) {
            System.out.println("\nInformacoes de " + recepcionista.getNome());
            System.out.println("Nome: " + recepcionista.getNome()
                    + ". \nCPF: " + recepcionista.getCpf()
                    + ". \nTelefone: " + recepcionista.getTelefone()
                    + ". \nEmail: " + recepcionista.getEmail());
        }
        return recepcionistaDao;
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
        System.out.println("\nCirurgia marcada - INFORMACOES DA CIRURGIA");
        System.out.println("Data e Hora: " + dataHora +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome() +
                "\nProcedimento: " + procedimento);
        return true;
    }
    @Override
    public boolean marcarConsulta(String id, LocalDateTime dataHora, Medico medico, Paciente paciente) {
        Consulta consulta = new Consulta(dataHora, paciente, medico, id);
        consultaController.adicionar(consulta);
        System.out.println("\nConsulta marcada - INFORMACOES DA CONSULTA");
        System.out.println("Data e Hora: " + dataHora +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome());
        return true;
    }
    @Override
    public boolean marcarColeta(String id, LocalDateTime dataHora, Enfermagem enfermeiro, String codigo, String tipo, Paciente paciente, String condicaoDaAmostra) {
        ColetaDeAmostras coleta = new ColetaDeAmostras(tipo, codigo, enfermeiro, paciente, dataHora, condicaoDaAmostra, id);
        coletaController.adicionar(coleta);
        System.out.println("\nColeta marcada - INFORMACOES DA COLETA");
        System.out.println("Data e Hora: " + dataHora +
                "\nEnfermeiro: " + enfermeiro.getNome() +
                "\nCódigo: " + codigo +
                "\nTipo: " + tipo +
                "\nPaciente: " + paciente.getNome());
        return true;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, Cirurgia cirurgia) {
        cirurgia.setDataHora(alteracao);
        System.out.println("\nDATA DA CIRURGIA (Alteração Realizada) - CIRUGIA");
        System.out.println("Nova Data e Hora: " + alteracao +
                "\nMédico: " + cirurgia.getMedico().getNome() +
                "\nPaciente: " + cirurgia.getPaciente().getNome() +
                "\nProcedimento: " + cirurgia.getProcedimento());
        return true;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, ColetaDeAmostras coleta) {
        coleta.setDataHora(alteracao);
        System.out.println("\nNOVA DATA DA COLETA (Alteração Realizada) - COLETA");
        System.out.println("Nova Data e Hora: " + alteracao +
                "\nEnfermeiro: " + coleta.getEnfermeiro().getNome() +
                "\nPaciente: " + coleta.getPaciente().getNome() +
                "\nTipo: " + coleta.getTipo());
        return true;
}
    @Override
    public boolean alterarData(LocalDateTime alteracao, Consulta consulta) {
        consulta.setDataHora(alteracao);
        System.out.println("\nNOVA DATA DA CONSULTA (Alteração Realizada) - CONSULTA");
        System.out.println("Nova Data e Hora: " + alteracao +
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
    public ArrayList<Consulta> listarConsultas() {
        return this.consultaController.listarTodos();
    }

    @Override
    public ArrayList<Cirurgia> listarCirurgias() {
        return this.cirurgiaController.listarTodos();
    }

    @Override
    public ArrayList<ColetaDeAmostras> listarColetas() {
        return this.coletaController.listarTodos();
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

