package br.com.clinicamedica.Controller;

import br.com.clinicamedica.Contract.IController;
import br.com.clinicamedica.Contract.IMedicoController;

import java.util.ArrayList;

public class MedicoController implements IController, IMedicoController {
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
    public boolean fazerConsulta() {
        return false;
    }

    @Override
    public boolean fazerCirurgia() {
        return false;
    }
}
