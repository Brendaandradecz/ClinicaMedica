package br.com.clinicamedica.Exception;

public class AmostraInvalidaOuDanificadaException extends RuntimeException{

    public AmostraInvalidaOuDanificadaException(){
        System.out.println("Amostra coletada é inválida ou danificada.");
    }
}
