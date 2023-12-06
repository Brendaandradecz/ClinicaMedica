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
        System.out.println("\nEnfermeiro(a) adicionado ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        String buscaLowerCase = busca.toLowerCase();
        for (Enfermagem enfermagem : enfermagemDao) {
            if (enfermagem.getCpf().toLowerCase().contains(buscaLowerCase) ||
                    enfermagem.getCoren().toLowerCase().contains(buscaLowerCase) ||
                    enfermagem.getNome().toLowerCase().contains(buscaLowerCase)) {
                System.out.println("\nEnfermeiro(a) encontrado(a):");
                imprimirInfo(enfermagem);
                return true;
            }
        }
        return false;
    }


    @Override
    public ArrayList<Enfermagem> listarTodos() {
        for (Enfermagem enfermagem : enfermagemDao) {
            imprimirInfo(enfermagem);
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
        System.out.println("\nEnfermeiro(a) removido(a) do sistema\n");
        return true;
    }

    @Override
    public boolean realizarTriagem(Paciente paciente, LocalDateTime dataHora) {
        String dia = String.format(dataHora.getDayOfMonth() +
                "/" + dataHora.getMonthValue() +
                "/" + dataHora.getYear() + " as " + dataHora.getHour() +
                ":" + dataHora.getMinute());

        String condicao;

        if(paciente.isCondicaoNormal()){
            condicao = "Sim";
        }else {
            condicao = "Não";
        }
        System.out.println("\nINFORMACOES DA TRIAGEM:");
        System.out.println("\nTriagem realizada para o paciente " + paciente.getNome() +
                " em " + dia +
                ". Condição Normal: " + condicao);
        return true;
    }

    @Override
    public boolean realizarColeta(ColetaDeAmostras coleta) {
        String dia = String.format(coleta.getDataHora().getDayOfMonth() +
                "/" + coleta.getDataHora().getMonthValue() +
                "/" + coleta.getDataHora().getYear() + " as " + coleta.getDataHora().getHour() +
                ":" + coleta.getDataHora().getMinute());

        System.out.println("\nINFORMACOES DA COLETA DE AMOSTRAS:");
        System.out.println("\nColeta de amostras realizada para o paciente " + coleta.getPaciente().getNome() +
                ". Tipo de amostra: " + coleta.getTipo() +
                ". Data e hora da coleta: " + dia);
        return true;
    }

    @Override
    public void imprimirInfo(Enfermagem enfermagem) {
        System.out.println("\nInformações de " + enfermagem.getNome());
        System.out.println("Nome: " + enfermagem.getNome()
                + ". \nCRBM: " + enfermagem.getCoren()
                + ". \nCPF: " + enfermagem.getCpf()
                + ". \nTelefone: " + enfermagem.getTelefone()
                + ". \nEmail: " + enfermagem.getEmail());
    }
}

