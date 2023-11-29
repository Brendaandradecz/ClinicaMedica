package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.ColetaDeAmostras;

public interface IBiomedicoDao {
    double fazerAnaliseDeAmostras(ColetaDeAmostras coleta);
}
