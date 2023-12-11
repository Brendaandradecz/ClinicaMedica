package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IRecepcionistaController;
import br.com.clinicamedica.DAO.RecepcionistaDAO;
import br.com.clinicamedica.Exception.*;
import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;

public class RecepcionistaController implements IController<Recepcionista>, IRecepcionistaController {
    private RecepcionistaDAO dao = new RecepcionistaDAO();
    @Override
    public boolean adicionar(Recepcionista elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                throw new DuplicacaoException("Recepcionista");
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
            boolean recepcionistaEncontrado = this.dao.buscar(busca);

            if(!recepcionistaEncontrado){
                throw new ResultadoNaoEncontradoException(" Recepcionista");
            }else{
                return recepcionistaEncontrado;
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
                throw new ListaVaziaException("Recepcionistas");
            }else{
                System.out.println("\nLista de Recepcionistas cadastrados no sistema");
                this.dao.listarTodos();
            }
        } catch(ListaVaziaException e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public boolean remover(Recepcionista elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                return this.dao.remover(elemento);
            }else{
                throw new ElementoInexistenteException("Recepcionista");
            }
        } catch(ElementoInexistenteException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean marcarCirurgia(String id, LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento) {
        try {
            if (dataHora.isBefore(LocalDateTime.now())) {
                throw new DataInvalidaException();
            }
            return this.dao.marcarCirurgia(id, dataHora, medico, paciente, procedimento);

        } catch (DataInvalidaException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean marcarColeta(String id, LocalDateTime dataHora, Enfermagem enfermeiro, String tipo, Paciente paciente, String condicaoDaAmostra) {
        try {
            if (dataHora.isBefore(LocalDateTime.now())) {
                throw new DataInvalidaException();
            }
            return this.dao.marcarColeta(id, dataHora, enfermeiro, tipo, paciente, condicaoDaAmostra);

        } catch (DataInvalidaException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean marcarConsulta(String id, LocalDateTime dataHora, Medico medico, Paciente paciente) {
        try {
            if (dataHora.isBefore(LocalDateTime.now())) {
                throw new DataInvalidaException();
            }
            return this.dao.marcarConsulta(id, dataHora, medico, paciente);

        } catch (DataInvalidaException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, Cirurgia cirurgia) {
        try{
            if(alteracao.isBefore(LocalDateTime.now())){
                throw new DataInvalidaException();
            }else {
                return this.dao.alterarData(alteracao, cirurgia);
            }
        }catch (DataInvalidaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, ColetaDeAmostras coleta) {
        try{
            if(alteracao.isBefore(LocalDateTime.now())){
                throw new DataInvalidaException();
            }else {
                return this.dao.alterarData(alteracao, coleta);
            }
        }catch (DataInvalidaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean alterarData(LocalDateTime alteracao, Consulta consulta) {
        try{
            if(alteracao.isBefore(LocalDateTime.now())){
                throw new DataInvalidaException();
            }else {
                return this.dao.alterarData(alteracao, consulta);
            }
        }catch (DataInvalidaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean adicionar(Consulta consulta) {
        return this.dao.adicionar(consulta);
    }

    @Override
    public boolean adicionar(ColetaDeAmostras coleta) {
        return this.dao.adicionar(coleta);
    }

    @Override
    public boolean adicionar(Cirurgia cirurgia) {
        return this.dao.adicionar(cirurgia);
    }

    @Override
    public boolean remover(Consulta consulta) {
        return false;
    }

    @Override
    public boolean remover(ColetaDeAmostras coleta) {
        return this.dao.remover(coleta);
    }

    @Override
    public boolean remover(Cirurgia cirurgia) {
        return this.dao.remover(cirurgia);
    }

    @Override
    public boolean buscarConsulta(String busca) {
        return this.dao.buscarConsulta(busca);
    }

    @Override
    public boolean buscarColeta(String busca) {
        return this.dao.buscarColeta(busca);
    }

    @Override
    public boolean buscarCirurgia(String busca) {
        return this.dao.buscarCirurgia(busca);
    }

    @Override
    public void listarConsultas() {
        this.dao.listarConsultas();
    }

    @Override
    public void listarCirurgias() {
        this.dao.listarCirurgias();
    }

    @Override
    public void listarColetas() {
        this.dao.listarColetas();
    }

    @Override
    public Consulta encontrarConsulta(String id) {
        return this.dao.encontrarConsulta(id);
    }

    @Override
    public Cirurgia encontrarCirurgia(String id) {
        return this.dao.encontrarCirurgia(id);
    }

    @Override
    public ColetaDeAmostras encontrarColeta(String id) {
        return this.dao.encontrarColeta(id);
    }
}
