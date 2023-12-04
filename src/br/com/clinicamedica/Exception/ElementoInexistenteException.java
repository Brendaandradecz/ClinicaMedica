package br.com.clinicamedica.Exception;

public class ElementoInexistenteException extends RuntimeException{
    public ElementoInexistenteException() {
        super("\nInformação nao armazenada!");
    }
}
