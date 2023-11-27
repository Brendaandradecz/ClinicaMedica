package br.com.clinicamedica.Main;

import br.com.clinicamedica.Controller.AnaliseController;
import br.com.clinicamedica.Model.Analise;
import br.com.clinicamedica.Model.Cardiologista;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Cardiologista cardiologista = new Cardiologista("a", "a", "a", "a", "a", "a");
        Paciente paciente = new Paciente("a", "a", "a", "a", true);
        Analise analise = new Analise(
                LocalDateTime.of(2022, 9,9, 10,5),cardiologista, paciente,
                "a");
        Analise analise2 = new Analise(
                LocalDateTime.of(2022, 9,9, 10,5),cardiologista, paciente,
                "a");
        AnaliseController analiseController = new AnaliseController();
        analiseController.remover(analise2);
        analiseController.adicionar(analise);
        analiseController.adicionar(analise);
        analiseController.remover(analise);
        analiseController.listarTodos();
    }
}