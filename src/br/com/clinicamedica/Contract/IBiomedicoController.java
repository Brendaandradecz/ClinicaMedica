package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.Analise;
import br.com.clinicamedica.Model.Biomedico;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IBiomedicoController {
    boolean fazerAnaliseDeAmostras(String id, Biomedico biomedico, Paciente paciente, LocalDateTime dataHora, double resultado, ColetaDeAmostras coleta);
    boolean adicionarAnalise(Analise analise);
    boolean buscarAnalise(String busca);
    ArrayList<Analise> listarAnalises();
    boolean removerAnalise(Analise analise);
}
