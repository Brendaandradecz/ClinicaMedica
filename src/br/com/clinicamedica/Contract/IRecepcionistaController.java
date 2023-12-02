package br.com.clinicamedica.Contract;

import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;

public interface IRecepcionistaController {
    boolean marcarCirurgia(String id, LocalDateTime dataHora, Medico medico, Paciente paciente, String procedimento);

    boolean marcarColeta(String id, LocalDateTime dataHora, Enfermagem enfermeiro, String codigo, String tipo, Paciente paciente, String condicaoDaAmostra);

    boolean marcarConsulta(String id, LocalDateTime dataHora, Medico medico, Paciente paciente);

    boolean alterarData(LocalDateTime alteracao, Cirurgia cirurgia);

    boolean alterarData(LocalDateTime alteracao, ColetaDeAmostras coleta);

    boolean alterarData(LocalDateTime alteracao, Consulta consulta);
}
