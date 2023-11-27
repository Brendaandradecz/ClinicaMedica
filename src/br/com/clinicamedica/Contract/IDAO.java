package br.com.clinicamedica.Contract;

import java.util.ArrayList;

public interface IDAO<T>{
    boolean adicionar(T elemento);
    T buscar(String busca);
    ArrayList<T> listarTodos();
    boolean remover(T elemento);
}
