package br.com.clinicamedica.Main;

import br.com.clinicamedica.Controller.*;
import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnaliseController analiseController = new AnaliseController();
        BiomedicoController biomedicoController = new BiomedicoController();
        CirurgiaController cirurgiaController = new CirurgiaController();
        ColetaDeAmostrasController coletaDeAmostrasController = new ColetaDeAmostrasController();
        ConsultaController consultaController = new ConsultaController();
        EnfermagemController enfermagemController = new EnfermagemController();
        LimpezaController limpezaController = new LimpezaController();
        MedicoController medicoController = new MedicoController();
        PacienteController pacienteController = new PacienteController();
        RecepcionistaController recepcionistaController = new RecepcionistaController();

        System.out.println("Insira o nome do biomedico: ");
        String nomeBio1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfBio1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailBio1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneBio1 = scanner.nextLine();
        System.out.println("Insira o CRBM: ");
        String crbm1 = scanner.nextLine();
        Biomedico biomedico1 = new Biomedico(nomeBio1, cpfBio1, emailBio1, telefoneBio1, crbm1);
        biomedicoController.listarTodos();
        biomedicoController.adicionar(biomedico1);
        biomedicoController.adicionar(biomedico1);
        biomedicoController.buscar("02");

        System.out.println("\nInsira o nome do biomedico: ");
        String nomeBio2 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfBio2 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailBio2 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneBio2 = scanner.nextLine();
        System.out.println("Insira o CRBM: ");
        String crbm2 = scanner.nextLine();
        Biomedico biomedico2 = new Biomedico(nomeBio2, cpfBio2, emailBio2, telefoneBio2, crbm2);
        biomedicoController.adicionar(biomedico2);
        biomedicoController.listarTodos();
        biomedicoController.buscar("brenda");

        System.out.println("\nInsira o nome do paciente: ");
        String nomePaciente1 = scanner.nextLine();
        System.out.println("Insira a idade: ");
        int idade1 = scanner.nextInt();
        System.out.println("Insira o CPF: ");
        String cpfPaciente1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailPaciente1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefonePaciente1 = scanner.nextLine();
        System.out.println("O paciente possui convênio? (true/false): ");
        boolean possuiConvenio1 = scanner.nextBoolean();
        System.out.println("O paciente está em condição normal? (true/false): ");
        boolean condicaoNormal1 = scanner.nextBoolean();
        System.out.println("A pressão arterial do paciente está alterada? (true/false): ");
        boolean pressaoArterialAlterada1 = scanner.nextBoolean();
        System.out.println("O paciente está acompanhado? (true/false): ");
        boolean pacienteAcompanhado1 = scanner.nextBoolean();
        Paciente paciente1 = new Paciente(nomePaciente1, idade1, cpfPaciente1, emailPaciente1, telefonePaciente1, possuiConvenio1, condicaoNormal1, pressaoArterialAlterada1, pacienteAcompanhado1);
        pacienteController.remover(paciente1);
        pacienteController.adicionar(paciente1);
        pacienteController.listarTodos();
        pacienteController.buscar("001");

        System.out.println("\nInsira o nome do cardiologista: ");
        String nomeCardio1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfCardio1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailCardio1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneCardio1 = scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmCardio1 = scanner.nextLine();
        System.out.println("Insira a especialidade: ");
        String especialidadeCardio1 = scanner.nextLine();
        Cardiologista cardiologista1 = new Cardiologista(nomeCardio1, cpfCardio1, emailCardio1, telefoneCardio1, crmCardio1, especialidadeCardio1);
        medicoController.adicionar(cardiologista1);

        System.out.println("\nInsira o nome do ginecologista: ");
        String nomeGineco1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfGineco1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailGineco1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneGineco1 = scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmGineco1 = scanner.nextLine();
        System.out.println("Insira a especialidade: ");
        String especialidadeGineco1 = scanner.nextLine();
        Ginecologista ginecologista1 = new Ginecologista(nomeGineco1, cpfGineco1, emailGineco1, telefoneGineco1, crmGineco1, especialidadeGineco1);
        medicoController.adicionar(ginecologista1);

        System.out.println("\nInsira o nome do clínico geral: ");
        String nomeGeral1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfGeral1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailGeral1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneGeral1 = scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmGeral1 = scanner.nextLine();
        System.out.println("Insira a especialidade: ");
        String especialidadeGeral1 = scanner.nextLine();
        ClinicoGeral clinicoGeral1 = new ClinicoGeral(nomeGeral1, cpfGeral1, emailGeral1, telefoneGeral1, crmGeral1, especialidadeGeral1);
        medicoController.adicionar(clinicoGeral1);

        System.out.println("\nInsira o nome do psiquiatra: ");
        String nomePsi1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfPsi1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailPsi1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefonePs1 = scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmPsi1 = scanner.nextLine();
        System.out.println("Insira a especialidade: ");
        String especialidadePsi1 = scanner.nextLine();
        Psiquiatra psiquiatra1 = new Psiquiatra(nomePsi1, cpfPsi1, emailPsi1, telefonePs1, crmPsi1, especialidadePsi1);
        medicoController.adicionar(psiquiatra1);

        System.out.println("\nInsira o nome do urologista: ");
        String nomeUro1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfUro1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailUro1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneUro1 = scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmUro1 = scanner.nextLine();
        System.out.println("Insira a especialidade: ");
        String especialidadeUro1 = scanner.nextLine();
        Urologista urologista1 = new Urologista(nomeUro1, cpfUro1, emailUro1, telefoneUro1, crmUro1, especialidadeUro1);
        medicoController.adicionar(urologista1);

        medicoController.listarTodos();
        medicoController.buscar("0");
        medicoController.buscar("01");
        medicoController.buscar("Brena");

        System.out.println("\nInsira o nome do enfermeiro: ");
        String nomeEnf1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfEnf1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailEnf1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneEnf1 = scanner.nextLine();
        System.out.println("Insira o COREN: ");
        String corenEnf1 = scanner.nextLine();
        Enfermeiro enfermeiro1 = new Enfermeiro(nomeEnf1, cpfEnf1, emailEnf1, telefoneEnf1, corenEnf1);
        enfermagemController.adicionar(enfermeiro1);
        enfermagemController.realizarTriagem(paciente1, LocalDateTime.of(2023,12,2,12,0,0,0));

        System.out.println("\nInsira o nome do técnico em enfermagem: ");
        String nomeTecEnf1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfTecEnf1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailTecEnf1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneTecEnf1 = scanner.nextLine();
        System.out.println("Insira o COREN: ");
        String corenTecEnf1 = scanner.nextLine();
        TecnicoEmEnfermagem tecnicoEnfermagem1 = new TecnicoEmEnfermagem(nomeTecEnf1, cpfTecEnf1, emailTecEnf1, telefoneTecEnf1, corenTecEnf1);
        enfermagemController.adicionar(tecnicoEnfermagem1);

        enfermagemController.listarTodos();

        System.out.println("\nInsira o nome da recepcionista: ");
        String nomeRecep1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfRecep1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailrecep1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneRecep1 = scanner.nextLine();
        Recepcionista recepcionista1 = new Recepcionista(nomeRecep1, cpfRecep1, emailrecep1, telefoneRecep1);
        recepcionistaController.adicionar(recepcionista1);
        recepcionistaController.listarTodos();

        System.out.println("\nInsira o nome do funcionário de limpeza: ");
        String nomeFuncLimp1 = scanner.nextLine();
        System.out.println("Insira o CPF: ");
        String cpfFuncLimp1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailFuncLimp1 = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneFuncLimp1 = scanner.nextLine();
        Limpeza funcionarioLimpeza1 = new Limpeza(nomeFuncLimp1, cpfFuncLimp1, emailFuncLimp1, telefoneFuncLimp1);
        limpezaController.adicionar(funcionarioLimpeza1);
        limpezaController.listarTodos();
        /*
        System.out.println("Insira a identificação da cirurgia: ");
        String idCirurgia1 = scanner.next();
        System.out.println("Insira a data e hora da cirurgia (no formato 'yyyy-MM-ddTHH:mm:ss'): ");
        LocalDateTime dataHoraCirurgia1 = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Insira o procedimento cirúrgico: ");
        String procedimentoCirurgia1 = scanner.nextLine();
        recepcionistaController.marcarCirurgia(idCirurgia1, dataHoraCirurgia1, cardiologista1, paciente1, procedimentoCirurgia1);

        System.out.println("Insira a identificação da cirurgia: ");
        String idCirurgia2 = scanner.next();
        System.out.println("Insira a data e hora da cirurgia (no formato 'yyyy-MM-ddTHH:mm:ss'): ");
        LocalDateTime dataHoraCirurgia2 = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Insira o procedimento cirúrgico: ");
        String procedimentoCirurgia2 = scanner.nextLine();
        recepcionistaController.marcarCirurgia(idCirurgia2, dataHoraCirurgia2, clinicoGeral1, paciente1, procedimentoCirurgia2);

        System.out.println("Insira a identificação da coleta: ");
        String idColeta1 = scanner.next();
        System.out.println("Insira o tipo de amostra: ");
        String tipo1 = scanner.nextLine();
        System.out.println("Insira o código da amostra: ");
        String codigo1 = scanner.nextLine();
        System.out.println("Insira a data e hora da coleta (no formato 'yyyy-MM-ddTHH:mm:ss'): ");
        LocalDateTime dataHoraColeta1 = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Insira a condição da amostra: ");
        String condicaoDaAmostra1 = scanner.nextLine();
        recepcionistaController.marcarColeta(idColeta1, dataHoraColeta1, enfermeiro1, codigo1, tipo1, paciente1, condicaoDaAmostra1);

        System.out.println("Insira a identificação da coleta: ");
        String idColeta2 = scanner.next();
        System.out.println("Insira o tipo de amostra: ");
        String tipo2 = scanner.nextLine();
        System.out.println("Insira o código da amostra: ");
        String codigo2 = scanner.nextLine();
        System.out.println("Insira a data e hora da coleta (no formato 'yyyy-MM-ddTHH:mm:ss'): ");
        LocalDateTime dataHoraColeta2 = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Insira a condição da amostra: ");
        String condicaoDaAmostra2 = scanner.nextLine();
        recepcionistaController.marcarColeta(idColeta2, dataHoraColeta2, tecnicoEnfermagem1, codigo2, tipo2, paciente1, condicaoDaAmostra2);

        System.out.println("Insira a identificação da consulta: ");
        String idConsulta1 = scanner.next();
        LocalDateTime dataHoraConsulta1 = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Insira a condição da amostra: ");
        recepcionistaController.marcarConsulta(idConsulta1, dataHoraConsulta1, urologista1, paciente1);

        System.out.println("Insira a identificação da consulta: ");
        String idConsulta2 = scanner.next();
        LocalDateTime dataHoraConsulta2 = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Insira a condição da amostra: ");
        recepcionistaController.marcarConsulta(idConsulta2, dataHoraConsulta2, psiquiatra1, paciente1);

        System.out.println("Insira a identificação da consulta: ");
        String idConsulta3 = scanner.next();
        LocalDateTime dataHoraConsulta3 = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Insira a condição da amostra: ");
        recepcionistaController.marcarConsulta(idConsulta3, dataHoraConsulta2, ginecologista1, paciente1);
        System.out.println("\nInsira o resultado da analise: ");
        double resultado1 = scanner.nextDouble();
        biomedicoController.fazerAnaliseDeAmostras(biomedico1, paciente1,LocalDateTime.of(2023,2,2,2,2,2), resultado1, coleta1);
        analiseController.adicionar(analise1);

        System.out.println("\nInsira o resultado da analise: ");
        double resultado2 = scanner.nextDouble();
        Analise analise2 = new Analise(LocalDateTime.of(2023,2,2,2,2,2), biomedico2, paciente1, resultado2);
        analiseController.adicionar(analise2);
        analiseController.listarTodos();
        */
    }
}