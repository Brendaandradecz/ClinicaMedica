package br.com.clinicamedica.Exception;

public class PressaoArterialAlteradaException extends RuntimeException{

    public PressaoArterialAlteradaException(){
        System.out.println("A cirurgia não pode ser realizada devido a pressão arterial alterada.");
    }
}
