package br.com.clinicamedica.Exception;

public class DataInvalidaException extends RuntimeException{

    public DataInvalidaException(){
        System.out.println("Data de coleta inválida. A data deve estar no futuro.");
    }
}
