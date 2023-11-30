package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.DAO.ColetaDeAmostrasDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.ColetaDeAmostras;

import java.util.ArrayList;

public class ColetaDeAmostrasController implements IController<ColetaDeAmostras> {
    private ColetaDeAmostrasDAO dao = new ColetaDeAmostrasDAO();
    @Override
    public boolean adicionar(ColetaDeAmostras elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Coleta de Amostras");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch(DuplicacaoException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ColetaDeAmostras buscar(String busca) {
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
    public boolean remover(ColetaDeAmostras elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                return this.dao.remover(elemento);
            }else{
                throw new ElementoInexistenteException();
            }
        } catch(ElementoInexistenteException e){
            System.out.println(e.getMessage());
        }
        return false;
    }


}
