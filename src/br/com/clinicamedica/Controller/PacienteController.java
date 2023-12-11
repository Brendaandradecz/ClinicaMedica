package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.DAO.PacienteDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.Paciente;

public class PacienteController implements IController<Paciente> {
    private PacienteDAO dao = new PacienteDAO();
    @Override
    public boolean adicionar(Paciente elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Paciente");
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
        try {
            boolean pacienteEncontrado = this.dao.buscar(busca);

            if (!pacienteEncontrado) {
                throw new ResultadoNaoEncontradoException(" Paciente");
            } else {
                return pacienteEncontrado;
            }
        } catch (ResultadoNaoEncontradoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void listarTodos() {
        try{
            if(dao.getArray().isEmpty()) {
                throw new ListaVaziaException("Pacientes");
            }else{
                System.out.println("\nLista de Pacientes cadastrados no sistema");
                this.dao.listarTodos();
            }
        } catch(ListaVaziaException e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public boolean remover(Paciente elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                return this.dao.remover(elemento);
            }else{
                throw new ElementoInexistenteException("Paciente");
            }
        } catch(ElementoInexistenteException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
}
