package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IBiomedicoController;
import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.DAO.BiomedicoDAO;
import br.com.clinicamedica.Exception.*;
import br.com.clinicamedica.Model.Biomedico;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BiomedicoController implements IController<Biomedico>, IBiomedicoController {
    private BiomedicoDAO dao = new BiomedicoDAO();
    @Override
    public boolean adicionar(Biomedico elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                throw new DuplicacaoException("Biomedico");
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
            if (!(this.dao.buscar(busca))) {
                throw new ResultadoNaoEncontradoException();
            } else {
                return this.dao.buscar(busca);
            }
        } catch (ResultadoNaoEncontradoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList listarTodos() {
        try {
            if (dao.getArray().isEmpty()) {
                throw new ListaVaziaException();
            } else {
                return this.dao.listarTodos();
            }
        } catch (ListaVaziaException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean remover(Biomedico elemento) {
        try {
            if (dao.getArray().contains(elemento)) {
                return this.dao.remover(elemento);
            } else {
                throw new ElementoInexistenteException();
            }
        } catch (ElementoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean fazerAnaliseDeAmostras(String id, Biomedico biomedico, Paciente paciente, LocalDateTime dataHora, double resultado, ColetaDeAmostras coleta) {
        try {
            if ( coleta == null) {
                throw new ParametrosInvalidosException();
            }
            if (resultado > 1.0 || resultado < 0){
                throw new ResultadoInvalidoException();
            }
            return this.dao.fazerAnaliseDeAmostras(id, biomedico, paciente, dataHora, resultado, coleta);

        } catch (ParametrosInvalidosException | ResultadoInvalidoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
