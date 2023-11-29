package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;

public interface IRecepcionistaDao {
    boolean marcarCirurgia(LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento);
    boolean marcarColeta(LocalDateTime dataHora, Biomedico biomedico, Enfermagem enfermeiro, String codigo, String tipo, Paciente paciente);
    boolean marcarConsulta(LocalDateTime dataHora, Medico medico, Paciente paciente);
}
