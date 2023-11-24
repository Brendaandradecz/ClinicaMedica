package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;

import java.util.ArrayList;

public class LimpezaController implements IController {
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
}
