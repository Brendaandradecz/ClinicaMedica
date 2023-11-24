package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IEnfermagemController;

import java.util.ArrayList;

public class EnfermagemController implements IController, IEnfermagemController {
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
    public boolean realizarTriagem() {
        return false;
    }

    @Override
    public boolean realizarColeta() {
        return false;
    }
}
