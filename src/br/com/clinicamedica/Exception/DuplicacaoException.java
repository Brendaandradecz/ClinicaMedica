package br.com.clinicamedica.Exception;

public class DuplicacaoException extends RuntimeException{
    public DuplicacaoException(String elemento) {
        super(elemento + " ja adicionado(a)");
    }
}
