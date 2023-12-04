package br.com.clinicamedica.Exception;

public class ConsultaNaoAgendadaException extends RuntimeException{

    public ConsultaNaoAgendadaException(){
        System.out.println("\nConsulta nao agendada para realizacao.");
    }
}
