package br.com.clinicamedica.Exception;

public class ListaVaziaException extends RuntimeException{
    public ListaVaziaException() {
        super("Nao há nenhuma informação armazenada!");
    }
}
