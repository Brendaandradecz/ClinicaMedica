package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IRecepcionistaController;

import java.util.ArrayList;

public class RecepcionistaController implements IController, IRecepcionistaController {
    @Override
    public boolean adicionar(Object objeto) {
        return false;
    }

    @Override
    public Object buscarPorID(int id) {
        return null;
    }

    @Override
    public ArrayList listarTodos() {
        return null;
    }

    @Override
    public boolean remover(Object objeto) {
        return false;
    }

    @Override
    public boolean marcarCirurgia() {
        return false;
    }

    @Override
    public boolean marcarColeta() {
        return false;
    }

    @Override
    public boolean marcarConsulta() {
        return false;
    }
}
