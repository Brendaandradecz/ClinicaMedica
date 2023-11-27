package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Consulta;

public interface IRecepcionistaDao {
    boolean marcarCirurgia(Cirurgia cirurgia);
    boolean marcarColeta(ColetaDeAmostras coletaDeAmostras);
    boolean marcarConsulta(Consulta consulta);
}
