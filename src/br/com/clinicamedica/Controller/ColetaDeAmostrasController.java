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
            if(this.dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Coleta de Amostras");
            }else{
                return this.dao.adicionar(elemento);
            }
        } catch(DuplicacaoException e){
            System.err.println(e.getMessage());
        }
        return true;
    }
    @Override
    public boolean remover(ColetaDeAmostras elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                return this.dao.remover(elemento);
            } else {
                throw new ElementoInexistenteException("Coleta de Amostras");
            }
        } catch (ElementoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public boolean buscar(String busca) {
        try{
            boolean coletaEncontrada = this.dao.buscar(busca);
            if(!coletaEncontrada){
                throw new ResultadoNaoEncontradoException("a Coleta de Amostras");
            }else{
                return coletaEncontrada;
            }
        } catch(ResultadoNaoEncontradoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<ColetaDeAmostras> listarTodos() {
        try{
            if(dao.getArray().isEmpty()) {
                throw new ListaVaziaException("Coletas");
            }else{
                System.out.println("\nLista de Coletas cadastradas no sistema");
                return this.dao.listarTodos();
            }
        } catch(ListaVaziaException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    public ColetaDeAmostras encontrar(String id){
        return this.dao.encontrar(id);
    }
}
