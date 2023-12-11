package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IEnfermagemController;
import br.com.clinicamedica.DAO.EnfermagemDAO;
import br.com.clinicamedica.Exception.*;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Enfermagem;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;

public class EnfermagemController implements IController<Enfermagem>, IEnfermagemController {
    private EnfermagemDAO dao = new EnfermagemDAO();

    @Override
    public boolean adicionar(Enfermagem elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                throw new DuplicacaoException("Consulta");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch (DuplicacaoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean buscar(String busca) {
        try {
            boolean enfermeiroEncontrado = this.dao.buscar(busca);
            if (!enfermeiroEncontrado) {
                throw new ResultadoNaoEncontradoException(" Enfermeiro(a)");
            } else {
                return enfermeiroEncontrado;
            }
        } catch (ResultadoNaoEncontradoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void listarTodos() {
        try {
            if (dao.getArray().isEmpty()) {
                throw new ListaVaziaException("Enfermeiros");
            } else {
                System.out.println("\nLista de Enfermeiros cadastrados no sistema");
                this.dao.listarTodos();
            }
        } catch (ListaVaziaException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public boolean remover(Enfermagem elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                return this.dao.remover(elemento);
            } else {
                throw new ElementoInexistenteException("Enfermeiro(a)");
            }
        } catch (ElementoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean realizarTriagem(Paciente paciente, LocalDateTime dataHora) {
        try{
            if(dataHora.isBefore(LocalDateTime.now())){
                throw new DataInvalidaException();
            } else {
                return this.dao.realizarTriagem(paciente, dataHora);
            }
        } catch (DataInvalidaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean realizarColeta(ColetaDeAmostras coleta) {
        try {
            if(coleta == null){
                throw new NaoAgendadaException("Coleta de Amostras");
            }
            if (coleta.getCondicaoDaAmostra().equalsIgnoreCase("danificada")){
                throw new AmostraInvalidaOuDanificadaException();
            }
            return this.dao.realizarColeta(coleta);
        } catch (NaoAgendadaException | AmostraInvalidaOuDanificadaException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}

