package br.com.clinicamedica.Exception;

public class ResultadoInvalidoException extends RuntimeException{

    public ResultadoInvalidoException(){
        System.out.println("\nO resultado da analise esta fora do intervalo esperado.");
    }
}
