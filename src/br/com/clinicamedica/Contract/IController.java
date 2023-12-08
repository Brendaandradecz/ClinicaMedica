package br.com.clinicamedica.Contract;

import java.util.ArrayList;

public interface IController<T>{
    boolean adicionar(T elemento);
    boolean buscar(String busca);
    void listarTodos();
    boolean remover(T elemento);
}
