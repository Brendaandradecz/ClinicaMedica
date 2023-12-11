package br.com.clinicamedica.Contract;


public interface IController<T>{
    boolean adicionar(T elemento);
    boolean buscar(String busca);
    void listarTodos();
    boolean remover(T elemento);
}
