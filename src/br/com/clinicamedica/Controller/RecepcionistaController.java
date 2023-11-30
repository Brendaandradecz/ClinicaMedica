package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IRecepcionistaController;
import br.com.clinicamedica.DAO.RecepcionistaDAO;
import br.com.clinicamedica.Exception.*;
import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

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
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Recepcionista buscar(String busca) {
        try{
            if(this.dao.buscar(busca).equals("null")){
                throw new ResultadoNaoEncontradoException();
            }else{
                return this.dao.buscar(busca);
            }
        } catch(ResultadoNaoEncontradoException e){
            System.out.println(e.getMessage());
        }
        return null;
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
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean remover(Recepcionista elemento) {
        try{
            if(dao.getArray().contains(elemento)){
                return this.dao.remover(elemento);
            }else{
                throw new ElementoInexistenteException();
            }
        } catch(ElementoInexistenteException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean marcarCirurgia(LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento) {
        try {
            if (paciente.getCpf().equals(null)) {
                throw new DocumentoInvalidoException();
            }

            if (dataHora == null || medico == null || paciente == null || procedimento == null){
                throw new ParametrosInvalidosException();
            }

            if (dataHora.isBefore(LocalDateTime.now())) {
                throw new DataInvalidaException();
            }
            return this.dao.marcarCirurgia(dataHora, medico, paciente, procedimento);

        } catch (DocumentoInvalidoException | ParametrosInvalidosException | DataInvalidaException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean marcarColeta(LocalDateTime dataHora, Enfermagem enfermeiro, String codigo, String tipo, Paciente paciente, String condicaoDaAmostra) {
        try {
            if (paciente.getCpf().equals(null)) {
                throw new DocumentoInvalidoException();
            }

            if (dataHora == null || enfermeiro == null || codigo == null || tipo == null || paciente == null) {
                throw new ParametrosInvalidosException();
            }

            if (dataHora.isBefore(LocalDateTime.now())) {
                throw new DataInvalidaException();
            }

            return this.dao.marcarColeta(dataHora, enfermeiro, codigo, tipo, paciente, condicaoDaAmostra);

        } catch (DocumentoInvalidoException | ParametrosInvalidosException | DataInvalidaException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean marcarConsulta(LocalDateTime dataHora, Medico medico, Paciente paciente) {
        try {
            if (paciente.getCpf().equals(null)) {
                throw new DocumentoInvalidoException();
            }

            if (dataHora == null || medico == null || paciente == null) {
                throw new ParametrosInvalidosException();
            }

            if (dataHora.isBefore(LocalDateTime.now())) {
                throw new DataInvalidaException();
            }
            return this.dao.marcarConsulta(dataHora, medico, paciente);

        } catch (DocumentoInvalidoException | ParametrosInvalidosException | DataInvalidaException e) {
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
        }
        return false;
    }
}
