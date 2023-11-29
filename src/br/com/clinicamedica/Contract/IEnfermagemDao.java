package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;

public interface IEnfermagemDao {
    boolean realizarTriagem(Paciente paciente, LocalDateTime dataHora);
    boolean realizarColeta(ColetaDeAmostras coletaDeAmostras);
}
