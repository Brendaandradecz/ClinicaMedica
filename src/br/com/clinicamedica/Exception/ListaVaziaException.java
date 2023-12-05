package br.com.clinicamedica.Exception;

public class ListaVaziaException extends RuntimeException{
    public ListaVaziaException(String onde) {
        super("\nNao ha nenhuma informacao armazenada na lista de " + onde + "!");
    }
}
