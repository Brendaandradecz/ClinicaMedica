package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IRecepcionistaDao;
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
        return true;

    }

    @Override
    public Recepcionista buscar(String busca) {
        for (Recepcionista recepcionista: recepcionistaDao) {
            if(recepcionista.getNome().equals(busca) || recepcionista.getCpf().equals(busca)){
                return recepcionista;
            }
        }
        return null;
    }
    @Override
    public ArrayList<Recepcionista> listarTodos() {
        return recepcionistaDao;
    }

    @Override
    public boolean remover(Recepcionista elemento) {
        recepcionistaDao.add(elemento);
        return true;
    }

    @Override
    public boolean marcarCirurgia(LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento) {
        System.out.println("Cirurgia marcada - INFORMAÇÕES DA CIRURGIA");
        System.out.println("Data e Hora: " + dataHora +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome() +
                "\nProcedimento: " + procedimento);
        return true;
    }

    @Override
    public boolean marcarColeta(LocalDateTime dataHora, Biomedico biomedico, Enfermagem enfermeiro, String codigo, String tipo, Paciente paciente) {
        System.out.println("Coleta marcada - INFORMAÇÕES DA COLETA");
        System.out.println("Data e Hora: " + dataHora +
                "\nBiomédico: " + biomedico.getNome() +
                "\nEnfermeiro: " + enfermeiro.getNome() +
                "\nCódigo: " + codigo +
                "\nTipo: " + tipo +
                "\nPaciente: " + paciente.getNome());
        return true;
    }

    @Override
    public boolean marcarConsulta(LocalDateTime dataHora, Medico medico, Paciente paciente) {
        System.out.println("Consulta marcada - INFORMAÇÕES DA CONSULTA");
        System.out.println("Data e Hora: " + dataHora +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome());
        return true;
    }
}

