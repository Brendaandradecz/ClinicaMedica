package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IEnfermagemDao;
import br.com.clinicamedica.Model.ColetaDeAmostras;
import br.com.clinicamedica.Model.Enfermagem;
import br.com.clinicamedica.Model.Paciente;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EnfermagemDAO implements IDAO<Enfermagem>, IEnfermagemDao {
    private ArrayList<Enfermagem> enfermagemDao = new ArrayList<>();

    @Override
    public boolean adicionar(Enfermagem elemento) {
        enfermagemDao.add(elemento);
        System.out.println("Enfermeiro(a) adicionado ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        for (Enfermagem enfermagem : enfermagemDao) {
            if (enfermagem.getCpf().equals(busca) || enfermagem.getCoren().equals(busca) || enfermagem.getNome().equals(busca)) {
                System.out.println("\nInformações de " + enfermagem.getNome());
                System.out.println("Nome: " + enfermagem.getNome()
                        + ". \nCRBM: " + enfermagem.getCoren()
                        + ". \nCPF: " + enfermagem.getCpf()
                        + ". \nTelefone: " + enfermagem.getTelefone()
                        + ". \nEmail: " + enfermagem.getEmail());
                return true;
            }
        }
        return false;
    }


    @Override
    public ArrayList<Enfermagem> listarTodos() {
        for (Enfermagem enfermagem : enfermagemDao) {
            System.out.println("\nInformações de " + enfermagem.getNome());
            System.out.println("Nome: " + enfermagem.getNome()
                    + ". \nCRBM: " + enfermagem.getCoren()
                    + ". \nCPF: " + enfermagem.getCpf()
                    + ". \nTelefone: " + enfermagem.getTelefone()
                    + ". \nEmail: " + enfermagem.getEmail());
        }
        return enfermagemDao;
    }

    @Override
    public ArrayList<Enfermagem> getArray() {
        return enfermagemDao;
    }

    @Override
    public boolean remover(Enfermagem elemento) {
        enfermagemDao.remove(elemento);
        System.out.println("Enfermeiro(a) removido(a) do sistema\n");
        return true;
    }

    @Override
    public boolean realizarTriagem(Paciente paciente, LocalDateTime dataHora) {
        System.out.println("INFORMAÇÕES DA TRIAGEM:");
        System.out.println("Triagem realizada para o paciente " + paciente.getNome() +
                " em " + dataHora +
                ". Condição: " + paciente.isCondicaoNormal());
        return true;
    }

    @Override
    public boolean realizarColeta(ColetaDeAmostras coleta) {
        System.out.println("INFORMAÇÕES DA COLETA DE AMOSTRAS:");
        System.out.println("Coleta de amostras realizada para o paciente " + coleta.getPaciente().getNome() +
                ". Tipo de amostra: " + coleta.getTipo() +
                ". Data e hora da coleta: " + coleta.getDataHora());
        return true;
    }
}

