package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IEnfermagemController;
import br.com.clinicamedica.DAO.EnfermagemDAO;
import br.com.clinicamedica.Exception.*;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Enfermagem;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EnfermagemController implements IController<Enfermagem>, IEnfermagemController {
    private IDAO<Enfermagem> dao;

    public EnfermagemController() {
        this.dao = new EnfermagemDAO();
    }

    @Override
    public boolean adicionar(Enfermagem elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                throw new DuplicacaoException("Consulta");
            } else {
                return this.dao.adicionar(elemento);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Enfermagem buscar(String busca) {
        try {
            if (this.dao.buscar(busca).equals("null")) {
                throw new ResultadoNaoEncontradoException();
            } else {
                return this.dao.buscar(busca);
            }
        } catch (ResultadoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList listarTodos() {
        try {
            if (dao.getArray().isEmpty()) {
                throw new ListaVaziaException();
            } else {
                return this.dao.listarTodos();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean remover(Enfermagem elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                return this.dao.remover(elemento);
            } else {
                throw new ElementoInexistenteException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean realizarTriagem(Paciente paciente, LocalDateTime dataHora) {
        try {
            if(paciente.getCpf() == null) ;
            return true;

        } catch (DocumentoInvalidoException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean realizarColeta(ColetaDeAmostras coleta) {
        try {
            if (coleta == null || coleta.getCondicaoDaAmostra().contains("Danificada"))
                return true;

        } catch (AmostraInvalidaOuDanificadaException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}

