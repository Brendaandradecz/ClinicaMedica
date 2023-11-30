package br.com.clinicamedica.Exception;

public class ResultadoInvalidoException extends RuntimeException{

    public ResultadoInvalidoException(){
        System.out.println("O resultado da análise está fora do intervalo esperado.");
    }
}
