package br.com.clinicamedica.Exception;

public class ResultadoNaoEncontradoException extends RuntimeException{

    public ResultadoNaoEncontradoException(String elemento) {
        super("\nNao foi encontrado nenhum" + elemento + "!");
    }
}
