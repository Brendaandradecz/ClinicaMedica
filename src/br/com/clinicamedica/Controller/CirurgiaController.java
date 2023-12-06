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
            if(this.dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Cirurgia");
            }else{
                return this.dao.adicionar(elemento);
            }
        } catch(DuplicacaoException e){
            System.err.println(e.getMessage());
        }
        return true;
    }
    @Override
    public boolean remover(Cirurgia elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                return this.dao.remover(elemento);
            } else {
                throw new ElementoInexistenteException("Cirurgia");
            }
        } catch (ElementoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean buscar(String busca) {
        try{
            boolean cirurgiaEncontrada = this.dao.buscar(busca);
            if(!cirurgiaEncontrada){
                throw new ResultadoNaoEncontradoException("a Cirurgia");
            }else{
                return cirurgiaEncontrada;
            }
        } catch(ResultadoNaoEncontradoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<Cirurgia> listarTodos() {
        try{
            if(dao.getArray().isEmpty()) {
                throw new ListaVaziaException("Cirurgias");
            }else{
                System.out.println("\nLista de Cirurgias cadastradas no sistema");
                return this.dao.listarTodos();
            }
        } catch(ListaVaziaException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    public Cirurgia encontrar(String id){
        return this.dao.encontrar(id);
    }
}
