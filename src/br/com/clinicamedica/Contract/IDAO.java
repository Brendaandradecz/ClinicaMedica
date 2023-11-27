package br.com.clinicamedica.Contract;

import java.util.ArrayList;
import java.util.Collection;

public interface IDAO<T>{
    boolean adicionar(T elemento);
    T buscar(String busca);
    ArrayList<T> listarTodos();
    boolean remover(T elemento);

    ArrayList<T> getArray();
}
