package br.com.clinicamedica.Exception;

public class ListaVaziaException extends RuntimeException{
    public ListaVaziaException() {
        super("\nNao ha nenhuma informacao armazenada!");
    }
}
