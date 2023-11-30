package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.DAO.CirurgiaDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.Cirurgia;

import java.util.ArrayList;

public class CirurgiaController implements IController<Cirurgia> {
    private CirurgiaDAO dao = new CirurgiaDAO();

    @Override
    public boolean adicionar(Cirurgia elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Cirurgia");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch(DuplicacaoException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Cirurgia buscar(String busca) {
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
        } catch(ListaVaziaException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean remover(Cirurgia elemento) {
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
