package br.com.clinicamedica.Exception;

public class CirurgiaInvalidaException extends RuntimeException{

    public CirurgiaInvalidaException(){
        System.out.println("Tipo de procedimento inválido para marcar cirurgia.");
    }
}
