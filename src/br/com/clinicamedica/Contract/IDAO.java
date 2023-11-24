package br.com.clinicamedica.Contract;

import java.util.ArrayList;

public interface IDAO<T>{
    boolean adicionar(T objeto);
    T buscarPorID(int id);
    ArrayList<T> listarTodos();
    boolean remover(T objeto);
}
