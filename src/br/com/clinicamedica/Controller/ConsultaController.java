package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.DAO.ConsultaDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.Consulta;

public class ConsultaController implements IController<Consulta> {

    private ConsultaDAO dao = new ConsultaDAO();
    @Override
    public boolean adicionar(Consulta elemento) {
        try{
            if(this.dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Consulta");
            }else{
                return this.dao.adicionar(elemento);
            }
        } catch(DuplicacaoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public boolean remover(Consulta elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                return this.dao.remover(elemento);
            } else {
                throw new ElementoInexistenteException("Consulta");
            }
        } catch (ElementoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public boolean buscar(String busca) {
        try{
            boolean consultaEncontrada = this.dao.buscar(busca);
            if(!consultaEncontrada){
                throw new ResultadoNaoEncontradoException("a Consulta");
            }else{
                return consultaEncontrada;
            }
        } catch(ResultadoNaoEncontradoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void listarTodos() {
        try{
            if(dao.getArray().isEmpty()) {
                throw new ListaVaziaException("Consutas");
            }else{
                System.out.println("\nLista de Consultas cadastradas no sistema");
                this.dao.listarTodos();
            }
        } catch(ListaVaziaException e){
            System.err.println(e.getMessage());
        }
    }
    public Consulta encontrar(String id){
        return this.dao.encontrar(id);
    }
}
