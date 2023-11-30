package br.com.clinicamedica.Exception;

public class TipoInvalidoException extends RuntimeException{

    public TipoInvalidoException(){
        System.out.println("Tipo de coleta inválido para marcar coleta.");
    }
}
