package br.com.clinicamedica.DAO;

import br.com.clinicamedica.Contract.IDAO;
import br.com.clinicamedica.Contract.IMedicoDao;
import br.com.clinicamedica.Model.Cirurgia;
import br.com.clinicamedica.Model.Consulta;
import br.com.clinicamedica.Model.Medico;

import java.util.ArrayList;

public class MedicoDAO implements IDAO<Medico>, IMedicoDao {
    private ArrayList<Medico> medicoDao = new ArrayList<>();

    @Override
    public boolean adicionar(Medico elemento) {
        medicoDao.add(elemento);
        System.out.println("\nMedico(a) adicionado(a) ao sistema!\n");
        return true;
    }

    @Override
    public boolean buscar(String busca) {
        String buscaLowerCase = busca.toLowerCase();
        for (Medico medico: medicoDao) {
            if (medico.getCpf().toLowerCase().contains(buscaLowerCase) ||
                    medico.getCrm().toLowerCase().contains(buscaLowerCase) ||
                    medico.getNome().toLowerCase().contains(buscaLowerCase)) {
                System.out.println("\nMedico(a) encontrado(a): ");
                imprimirInfo(medico);
                return true;
            }
        }
        return false;
    }

    @Override
    public void listarTodos() {
        for (Medico medico: medicoDao) {
            imprimirInfo(medico);
        }
    }

    @Override
    public boolean remover(Medico elemento) {
        medicoDao.remove(elemento);
        System.out.println("\nMedico(a) removido(a) do sistema");
        return true;
    }

    @Override
    public ArrayList<Medico> getArray() {
        return medicoDao;
    }

    @Override
    public boolean fazerConsulta(Consulta consulta) {
        String dia = String.format(consulta.getDataHora().getDayOfMonth() +
                "/" + consulta.getDataHora().getMonthValue() +
                "/" + consulta.getDataHora().getYear() + " as " + consulta.getDataHora().getHour() +
                ":" + consulta.getDataHora().getMinute());

        System.out.println("\nINFORMACOES DA CONSULTA:");
        System.out.println("\nConsulta realizada por " + consulta.getMedico().getNome() +
                " para o paciente " + consulta.getPaciente().getNome() +
                " no dia " + dia);
        return true;
    }

    @Override
    public boolean fazerCirurgia(Cirurgia cirurgia) {
        String dia = String.format(cirurgia.getDataHora().getDayOfMonth() +
                "/" + cirurgia.getDataHora().getMonthValue() +
                "/" + cirurgia.getDataHora().getYear() + " as " + cirurgia.getDataHora().getHour() +
                ":" + cirurgia.getDataHora().getMinute());

        System.out.println("\nINFORMACOES DA CIRURGIA:");
        System.out.println("\nCirurgia realizada por " + cirurgia.getMedico().getNome() +
                " para o paciente " + cirurgia.getPaciente().getNome() +
                " no dia " + dia +
                ". Procedimento: " + cirurgia.getProcedimento());
        return true;
    }

    @Override
    public void imprimirInfo(Medico medico) {
        System.out.println("\nInformacoes de " + medico.getNome());
        System.out.println("\nNome: " + medico.getNome()
                + ". \nCRM: " + medico.getCrm()
                + ". \nCPF: " + medico.getCpf()
                + ". \nTelefone: " + medico.getTelefone()
                + ". \nEmail: " + medico.getEmail());
    }
}
