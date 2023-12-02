package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IRecepcionistaDao;
import br.com.clinicamedica.Controller.ColetaDeAmostrasController;
import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RecepcionistaDAO implements IDAO<Recepcionista>, IRecepcionistaDao {
    private ArrayList<Recepcionista> recepcionistaDao = new ArrayList<>();

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
    public Recepcionista buscar(String busca) {
        for (Recepcionista recepcionista: recepcionistaDao) {
            if(recepcionista.getNome().equals(busca) || recepcionista.getCpf().equals(busca)){
                System.out.println("Informações de " + recepcionista.getNome());
                System.out.println("Nome: " + recepcionista.getNome()
                        + ". \nCPF: " + recepcionista.getCpf()
                        + ". \nTelefone: " + recepcionista.getTelefone()
                        + ". \nEmail: " + recepcionista.getEmail());
                return recepcionista;
            }
        }
        return null;
    }
    @Override
    public ArrayList<Recepcionista> listarTodos() {
        for (Recepcionista recepcionista: recepcionistaDao) {
            System.out.println("Informações de " + recepcionista.getNome());
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
        System.out.println("Recepcionista removido(a) do sistema!\n");
        return true;
    }

    @Override
    public boolean marcarCirurgia(LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento) {
        Cirurgia cirurgia = new Cirurgia(dataHora, medico, paciente, procedimento);
        System.out.println("Cirurgia marcada - INFORMAÇÕES DA CIRURGIA");
        System.out.println("Data e Hora: " + dataHora +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome() +
                "\nProcedimento: " + procedimento);
        return true;
    }

    @Override
    public boolean marcarColeta(LocalDateTime dataHora, Enfermagem enfermeiro, String codigo, String tipo, Paciente paciente, String condicaoDaAmostra) {
        ColetaDeAmostras coleta = new ColetaDeAmostras(tipo, codigo, enfermeiro, paciente, dataHora, condicaoDaAmostra);
        System.out.println("Coleta marcada - INFORMAÇÕES DA COLETA");
        System.out.println("Data e Hora: " + dataHora +
                "\nEnfermeiro: " + enfermeiro.getNome() +
                "\nCódigo: " + codigo +
                "\nTipo: " + tipo +
                "\nPaciente: " + paciente.getNome());
        return true;
    }

    @Override
    public boolean marcarConsulta(LocalDateTime dataHora, Medico medico, Paciente paciente) {
        Consulta consulta = new Consulta(dataHora, paciente, medico);
        System.out.println("Consulta marcada - INFORMAÇÕES DA CONSULTA");
        System.out.println("Data e Hora: " + dataHora +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome());
        return true;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, Cirurgia cirurgia) {
        cirurgia.setDataHora(alteracao);
        System.out.println("DATA DA CIRURGIA (Alteração Realizada) - CIRUGIA");
        System.out.println("Nova Data e Hora: " + alteracao +
                "\nMédico: " + cirurgia.getMedico().getNome() +
                "\nPaciente: " + cirurgia.getPaciente().getNome() +
                "\nProcedimento: " + cirurgia.getProcedimento());
        return true;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, ColetaDeAmostras coleta) {
        coleta.setDataHora(alteracao);
        System.out.println("NOVA DATA DA COLETA (Alteração Realizada) - COLETA");
        System.out.println("Nova Data e Hora: " + alteracao +
                "\nEnfermeiro: " + coleta.getEnfermeiro().getNome() +
                "\nPaciente: " + coleta.getPaciente().getNome() +
                "\nTipo: " + coleta.getTipo());
        return true;
}
    @Override
    public boolean alterarData(LocalDateTime alteracao, Consulta consulta) {
        consulta.setDataHora(alteracao);
        System.out.println("NOVA DATA DA CONSULTA (Alteração Realizada) - CONSULTA");
        System.out.println("Nova Data e Hora: " + alteracao +
                "\nMédico: " + consulta.getMedico().getNome() +
                "\nPaciente: " + consulta.getPaciente().getNome());
        return true;
    }
}

