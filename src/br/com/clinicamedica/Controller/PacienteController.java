package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.DAO.AnaliseDAO;
import br.com.clinicamedica.DAO.PacienteDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Model.Analise;
import br.com.clinicamedica.Model.Paciente;

import java.util.ArrayList;

public class PacienteController implements IController<Paciente> {
    private IDAO<Paciente> dao;
    public PacienteController(){
        this.dao = new PacienteDAO();
    }
    @Override
    public boolean adicionar(Paciente elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Paciente");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Paciente buscar(String busca) {
        try{
            return this.dao.buscar(busca);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList listarTodos() {
        try{
            if(dao.getArray().isEmpty()) {
                throw new ListaVaziaException();
            }else{
                return this.dao.listarTodos();
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean remover(Paciente elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                return this.dao.remover(elemento);
            }else{
                throw new ElementoInexistenteException();
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

}
