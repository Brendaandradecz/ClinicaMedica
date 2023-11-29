package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.ColetaDeAmostras;

public interface IBiomedicoController {
    boolean fazerAnaliseDeAmostras(ColetaDeAmostras coleta);
}
