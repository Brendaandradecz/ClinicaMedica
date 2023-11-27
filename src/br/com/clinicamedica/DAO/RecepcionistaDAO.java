package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IRecepcionistaDao;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Consulta;
import br.com.clinicamedica.Model.Recepcionista;

import java.util.ArrayList;

public class RecepcionistaDAO implements IDAO<Recepcionista>, IRecepcionistaDao {
    private ArrayList<Recepcionista> recepcionistaDao = new ArrayList<>();

    @Override
    public boolean adicionar(Recepcionista elemento) {
        if (recepcionistaDao.contains(elemento)) {
            recepcionistaDao.add(elemento);
            return true
        } else {
            return false;
        }
    }

    @Override
    public Recepcionista buscar(String busca) {
        return null;
    }


    @Override
    public ArrayList<Recepcionista> listarTodos() {
        return new ArrayList<>(recepcionistaDao);
    }

    @Override
    public boolean remover(Recepcionista elemento) {
        if (recepcionistaDao.contains(elemento)) {
            recepcionistaDao.add(elemento);
            return true;
        }
        return false;
    }

    @Override
    public boolean marcarCirurgia(Cirurgia cirurgia) {
        System.out.println("Cirurgia marcada - INFORMAÇÕES DA CIRURGIA");
        return true;
    }

    @Override
    public boolean marcarColeta(ColetaDeAmostras coletaDeAmostras) {
        System.out.println("Coleta marcada - INFORMAÇÕES DA COLETA");
        return true;
    }

    @Override
    public boolean marcarConsulta(Consulta consulta) {
        System.out.println("Consulta marcada - INFORMAÇÕES DA CONSULTA");
        return true;
    }
}
