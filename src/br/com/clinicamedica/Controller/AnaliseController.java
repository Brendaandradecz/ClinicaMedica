package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.DAO.AnaliseDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.Analise;

import java.util.ArrayList;

public class AnaliseController implements IController<Analise> {
    private IDAO<Analise> dao;
    public AnaliseController(){
        this.dao = new AnaliseDAO();
    }

    @Override
    public boolean adicionar(Analise elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Analise");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Analise buscar(String busca) {
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
    public boolean remover(Analise elemento) {
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
