package br.com.clinicamedica.Exception;

public class AmostraInvalidaOuDanificadaException extends RuntimeException{

    public AmostraInvalidaOuDanificadaException(){
        System.out.println("\nAmostra coletada eh invalida ou danificada.");
    }
}
