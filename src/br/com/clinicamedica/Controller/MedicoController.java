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
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Medico");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch(DuplicacaoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean buscar(String busca) {
        try{
            if(!(this.dao.buscar(busca))){
                throw new ResultadoNaoEncontradoException();
            }else{
                return this.dao.buscar(busca);
            }
        } catch(ResultadoNaoEncontradoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList listarTodos() {
        try{
            if(dao.getArray().isEmpty()) {
                throw new ListaVaziaException();
            }else{
                return this.dao.listarTodos();
            }
        } catch(ListaVaziaException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean remover(Medico elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                return this.dao.remover(elemento);
            }else{
                throw new ElementoInexistenteException();
            }
        } catch(ElementoInexistenteException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean fazerConsulta(Consulta consulta) {
        try {
            if (consulta == null) {
                throw new ConsultaNaoAgendadaException();
            }
            if (consulta.getPaciente().getIdade() < 18 && !consulta.getPaciente().isPacienteAcompanhado()) {
                throw new MenorDesacompanhadoException();
            }
            return this.dao.fazerConsulta(consulta);
        } catch (ConsultaNaoAgendadaException | MenorDesacompanhadoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public boolean fazerCirurgia(Cirurgia cirurgia) {
        try {
            if (cirurgia == null) {
                throw new CirurgiaNaoAgendadaException();
            }
            if (cirurgia.getPaciente().isPressaoArterialAlterada()){
                throw new PressaoArterialAlteradaException();
            }
            return this.dao.fazerCirurgia(cirurgia);

        } catch (PressaoArterialAlteradaException | CirurgiaNaoAgendadaException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
