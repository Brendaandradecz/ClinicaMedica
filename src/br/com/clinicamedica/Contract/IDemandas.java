package br.com.clinicamedica.Contract;

import java.util.ArrayList;

public interface IDemandas<T>{
    boolean adicionar(String id);
    boolean remover(String id);
    boolean buscar(String busca);
    ArrayList<T> listarTodos();
    ArrayList<T> getArray();
}
