package br.com.clinicamedica.Exception;

public class MenorDesacompanhadoException extends RuntimeException{

    public MenorDesacompanhadoException(String ocasiao){
        System.out.println("\nMenores de 18 anos devem estar acompanhados durante a " + ocasiao + ".");
    }
}
