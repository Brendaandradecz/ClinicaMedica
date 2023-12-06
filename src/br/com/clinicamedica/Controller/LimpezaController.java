package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.DAO.LimpezaDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.Limpeza;

import java.util.ArrayList;

public class LimpezaController implements IController<Limpeza> {
    private LimpezaDAO dao = new LimpezaDAO();
    @Override
    public boolean adicionar(Limpeza elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Funcionario");
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
            boolean funcionarioEncontrado = this.dao.buscar(busca);
            if(!funcionarioEncontrado){
                throw new ResultadoNaoEncontradoException(" Funcionário(a) de limpeza");
            }else{
                return funcionarioEncontrado;
            }
        } catch(ResultadoNaoEncontradoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<Limpeza> listarTodos() {
        try{
            if(dao.getArray().isEmpty()) {
                throw new ListaVaziaException("Funcionários de limpeza");
            }else{
                System.out.println("\nLista de Funcionários de limpeza cadastrados no sistema");
                return this.dao.listarTodos();
            }
        } catch(ListaVaziaException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean remover(Limpeza elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                return this.dao.remover(elemento);
            }else{
                throw new ElementoInexistenteException("Funcionário(a) de limpeza");
            }
        } catch(ElementoInexistenteException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

}
