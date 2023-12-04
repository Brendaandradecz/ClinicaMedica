package br.com.clinicamedica.Exception;

public class CirurgiaNaoAgendadaException extends RuntimeException{

    public CirurgiaNaoAgendadaException(){
        System.out.println("\nCirurgia nao agendada para realizacao.");
    }
}
