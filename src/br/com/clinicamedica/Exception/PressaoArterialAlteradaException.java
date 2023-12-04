package br.com.clinicamedica.Exception;

public class PressaoArterialAlteradaException extends RuntimeException{

    public PressaoArterialAlteradaException(){
        System.out.println("\nA cirurgia nao pode ser realizada devido a pressao arterial alterada.");
    }
}
