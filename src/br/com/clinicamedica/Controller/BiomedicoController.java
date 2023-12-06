package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IBiomedicoController;
import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.DAO.BiomedicoDAO;
import br.com.clinicamedica.Exception.*;
import br.com.clinicamedica.Model.Analise;
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
            boolean biomedicoEncontrado = this.dao.buscar(busca);

            if (!biomedicoEncontrado) {
                throw new ResultadoNaoEncontradoException(" Biomedico(a)");
            } else {
                return biomedicoEncontrado;
            }
        } catch (ResultadoNaoEncontradoException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }


    @Override
    public ArrayList<Biomedico> listarTodos() {
        try {
            if (dao.getArray().isEmpty()) {
                throw new ListaVaziaException("Biomedicos");
            } else {
                System.out.println("\nLista de Biomedicos cadastrados no sistema");
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
                throw new ElementoInexistenteException("Biomedico(a)");
            }
        } catch (ElementoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean fazerAnaliseDeAmostras(String id, Biomedico biomedico, Paciente paciente, LocalDateTime dataHora, double resultado, ColetaDeAmostras coleta) {
        try {
            if (resultado > 1.0 || resultado < 0){
                throw new ResultadoInvalidoException();
            }if(coleta == null){
                throw new NaoAgendadaException("Coleta");
            }if(dataHora.isBefore(coleta.getDataHora())){
                throw new DataInvalidaException();
            }
            return this.dao.fazerAnaliseDeAmostras(id, biomedico, paciente, dataHora, resultado, coleta);

        } catch (NaoAgendadaException | ResultadoInvalidoException | DataInvalidaException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean adicionarAnalise(Analise analise) {
        return this.dao.adicionarAnalise(analise);
    }

    @Override
    public boolean buscarAnalise(String busca) {
        return this.buscarAnalise(busca);
    }

    @Override
    public ArrayList<Analise> listarAnalises() {
        return this.dao.listarAnalise();
    }

    @Override
    public boolean removerAnalise(Analise analise) {
        return this.dao.removerAnalise(analise);
    }
}
