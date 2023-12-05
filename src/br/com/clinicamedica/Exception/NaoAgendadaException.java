package br.com.clinicamedica.Exception;

public class NaoAgendadaException extends RuntimeException{

    public NaoAgendadaException(String elemento){
        System.out.println("\n" + elemento + " nao agendada para realizacao.");
    }
}
