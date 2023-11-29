package br.com.clinicamedica.Exception;

public class ResultadoNaoEncontradoException extends RuntimeException{

    public ResultadoNaoEncontradoException() {
        super("Não foi encontrado nenhum tipo de resultado");
    }
}
