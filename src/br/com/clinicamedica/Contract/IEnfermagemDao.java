package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Enfermeiro;
import br.com.clinicamedica.Model.Paciente;

public interface IEnfermagemDao {
    boolean realizarTriagem(Paciente paciente);
    boolean realizarColeta(Paciente paciente, ColetaDeAmostras coletaDeAmostras);
}
