package br.com.clinicamedica.Exception;

public class ElementoInexistenteException extends RuntimeException{
    public ElementoInexistenteException(String elemento) {
        super("\nImpossivel remover " + elemento + ". Informaçao nao armazenada!");
    }
}
