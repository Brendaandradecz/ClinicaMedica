package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.DAO.AnaliseDAO;
import br.com.clinicamedica.Exception.DuplicacaoException;
import br.com.clinicamedica.Exception.ElementoInexistenteException;
import br.com.clinicamedica.Exception.ListaVaziaException;
import br.com.clinicamedica.Exception.ResultadoNaoEncontradoException;
import br.com.clinicamedica.Model.Analise;

public class AnaliseController implements IController<Analise> {
    private AnaliseDAO dao = new AnaliseDAO();
    @Override
    public boolean adicionar(Analise elemento) {
        try{
            if(this.dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Analise");
            }else{
                return this.dao.adicionar(elemento);
            }
        } catch(DuplicacaoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public boolean remover(Analise elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                return this.dao.remover(elemento);
            } else {
                throw new ElementoInexistenteException("Analise");
            }
        } catch (ElementoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean buscar(String busca) {
        try{
            boolean analiseEncontrada = this.dao.buscar(busca);
            if(!analiseEncontrada){
                throw new ResultadoNaoEncontradoException("a Analise");
            }else{
                return analiseEncontrada;
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
                throw new ListaVaziaException("Analises");
            }else{
                System.out.println("\nLista de Analises cadastradas no sistema");
                this.dao.listarTodos();
            }
        } catch(ListaVaziaException e){
            System.err.println(e.getMessage());
        }
    }
    public Analise encontrar(String id){
        return this.dao.encontrar(id);
    }
}
