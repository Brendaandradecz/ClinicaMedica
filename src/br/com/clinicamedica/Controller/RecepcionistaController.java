package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IRecepcionistaController;
import br.com.clinicamedica.DAO.RecepcionistaDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RecepcionistaController implements IController<Recepcionista>, IRecepcionistaController {
    private IDAO<Recepcionista> dao;
    public RecepcionistaController(){
        this.dao = new RecepcionistaDAO();
    }
    @Override
    public boolean adicionar(Recepcionista elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Recepcionista");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Recepcionista buscar(String busca) {
        try{
            if(this.dao.buscar(busca).equals("null")){
                throw new ResultadoNaoEncontradoException();
            }else{
                return this.dao.buscar(busca);
            }
        } catch(ResultadoNaoEncontradoException e){
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
    public boolean remover(Recepcionista elemento) {
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

    @Override
    public boolean marcarCirurgia(LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento) {
        return false;
    }

    @Override
    public boolean marcarColeta(LocalDateTime dataHora, Biomedico biomedico, Enfermagem enfermeiro, String codigo, String tipo, Paciente paciente) {
        return false;
    }

    @Override
    public boolean marcarConsulta(LocalDateTime dataHora, Medico medico, Paciente paciente) {
        return false;
    }


}
