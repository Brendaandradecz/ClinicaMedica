package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.Analise;
import br.com.clinicamedica.Model.ColetaDeAmostras;

public interface IBiomedicoController {
    boolean fazerAnaliseDeAmostras(Analise analise, ColetaDeAmostras coleta);
}
