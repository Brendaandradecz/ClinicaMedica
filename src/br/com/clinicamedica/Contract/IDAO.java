package br.com.clinicamedica.Contract;


import java.util.ArrayList;

public interface IDAO<T>{
    boolean adicionar(T elemento);
    boolean buscar(String busca);
    void listarTodos();
    boolean remover(T elemento);
    ArrayList<T> getArray();
    void imprimirInfo(T elemento);
}
