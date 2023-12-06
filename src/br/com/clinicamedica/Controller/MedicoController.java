package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IMedicoController;
import br.com.clinicamedica.DAO.MedicoDAO;
import br.com.clinicamedica.Exception.*;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;
import br.com.clinicamedica.Model.Medico;

import java.util.ArrayList;

public class MedicoController implements IController<Medico>, IMedicoController {
    private MedicoDAO dao = new MedicoDAO();

    @Override
    public boolean adicionar(Medico elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                throw new DuplicacaoException("Medico");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch (DuplicacaoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean buscar(String busca) {
        try {
            boolean medicoEncontrado = this.dao.buscar(busca);

            if (!medicoEncontrado) {
                throw new ResultadoNaoEncontradoException(" Medico(a)");
            } else {
                return medicoEncontrado;
            }
        } catch (ResultadoNaoEncontradoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<Medico> listarTodos() {
        try {
            if (dao.getArray().isEmpty()) {
                throw new ListaVaziaException("Medicos");
            } else {
                System.out.println("\nLista de Medicos cadastrados no sistema");
                return this.dao.listarTodos();
            }
        } catch (ListaVaziaException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean remover(Medico elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                return this.dao.remover(elemento);
            } else {
                throw new ElementoInexistenteException("Medico(a)");
            }
        } catch (ElementoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean fazerConsulta(Consulta consulta) {
        try {
            if (consulta == null) {
                throw new NaoAgendadaException("Consulta");
            }
            if ((consulta.getPaciente().getIdade() < 18) && !consulta.getPaciente().isPacienteAcompanhado()) {
                throw new MenorDesacompanhadoException("consulta");
            }
            return this.dao.fazerConsulta(consulta);

        } catch (NaoAgendadaException | MenorDesacompanhadoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public boolean fazerCirurgia(Cirurgia cirurgia) {
        try {
            if (cirurgia == null) {
                throw new NaoAgendadaException("Cirurgia");
            }
            if ((cirurgia.getPaciente().getIdade() < 18) && !cirurgia.getPaciente().isPacienteAcompanhado()) {
                throw new MenorDesacompanhadoException("cirugia");
            }
            if (cirurgia.getPaciente().isPressaoArterialAlterada()){
                throw new PressaoArterialAlteradaException();
            }
            return this.dao.fazerCirurgia(cirurgia);

        } catch (PressaoArterialAlteradaException | MenorDesacompanhadoException | NaoAgendadaException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}


