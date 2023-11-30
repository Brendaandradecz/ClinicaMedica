package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.Analise;
import br.com.clinicamedica.Model.ColetaDeAmostras;

public interface IBiomedicoDao {

    double fazerAnaliseDeAmostras(Analise analise, ColetaDeAmostras coleta);
}
