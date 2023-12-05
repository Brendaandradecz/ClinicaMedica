package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IRecepcionistaController {
    boolean marcarCirurgia(String id, LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento);

    boolean marcarColeta(String id, LocalDateTime dataHora, Enfermagem enfermeiro, String tipo, Paciente paciente, String condicaoDaAmostra);

    boolean marcarConsulta(String id, LocalDateTime dataHora, Medico medico, Paciente paciente);

    boolean alterarData(LocalDateTime alteracao, Cirurgia cirurgia);

    boolean alterarData(LocalDateTime alteracao, ColetaDeAmostras coleta);

    boolean alterarData(LocalDateTime alteracao, Consulta consulta);
    boolean adicionar(Consulta consulta);
    boolean adicionar(ColetaDeAmostras coleta);
    boolean adicionar(Cirurgia Cirurgia);
    boolean remover(Consulta consulta);
    boolean remover(ColetaDeAmostras coleta);
    boolean remover(Cirurgia Cirurgia);
    boolean buscarConsulta(String busca);
    boolean buscarColeta(String busca);
    boolean buscarCirurgia(String busca);
    ArrayList<Consulta> listarConsultas();
    ArrayList<Cirurgia> listarCirurgias();
    ArrayList<ColetaDeAmostras> listarColetas();
    Consulta encontrarConsulta(String id);
    Cirurgia encontrarCirurgia(String id);
    ColetaDeAmostras encontrarColeta(String id);
}
