package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IDemandasController;
import br.com.clinicamedica.DAO.ConsultaDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.Consulta;

import java.util.ArrayList;

public class ConsultaController implements IDemandasController<Consulta> {

    private ConsultaDAO dao = new ConsultaDAO();

    @Override
    public boolean adicionar(String id) {
        try{
            for (Consulta consulta: this.dao.getArray()) {
                if(consulta.getId().equals(id)){
                    throw new DuplicacaoException("Consulta");
                }else{
                    return this.dao.adicionar(id);
                }
            }
        } catch(DuplicacaoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public boolean remover(String id) {
        try{
            for (Consulta consulta: this.dao.getArray()) {
                if(consulta.getId().equals(id)){
                    return this.dao.remover(id);
                }else{
                    throw new ElementoInexistenteException();
                }
            }
        } catch(ElementoInexistenteException e){
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
}
