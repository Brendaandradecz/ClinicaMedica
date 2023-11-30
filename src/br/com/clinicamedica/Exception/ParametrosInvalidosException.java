package br.com.clinicamedica.Exception;

public class ParametrosInvalidosException extends RuntimeException{

    public ParametrosInvalidosException(){
        System.out.println("Os parâmetros de análise ou coleta são inválidos.");
    }
}
