package br.com.clinicamedica.Contract;

import ]br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;

public interface IMedicoDao {
    boolean fazerConsulta(Consulta consulta);
    boolean fazerCirurgia(Cirurgia cirurgia);
}
