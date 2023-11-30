package br.com.clinicamedica.Exception;

public class MenorDesacompanhadoException extends RuntimeException{

    public MenorDesacompanhadoException(){
        System.out.println("Menores de 18 anos devem estar acompanhados durante a consulta.");
    }
}
