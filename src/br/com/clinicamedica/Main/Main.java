package br.com.clinicamedica.Main;

import br.com.clinicamedica.Controller.*;
import br.com.clinicamedica.Model.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BiomedicoController biomedicoController = new BiomedicoController();
        EnfermagemController enfermagemController = new EnfermagemController();
        LimpezaController limpezaController = new LimpezaController();
        MedicoController medicoController = new MedicoController();
        PacienteController pacienteController = new PacienteController();
        RecepcionistaController recepcionistaController = new RecepcionistaController();

        System.out.println("\nCadastrando Paciente");
        System.out.println("Insira o nome do paciente: ");
        String nomePaciente1 = scanner.nextLine();
        System.out.println("Insira a idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailPaciente1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfPaciente1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefonePaciente1 = scanner.next();
        scanner.nextLine();
        System.out.println("O paciente possui convenio? (true/false): ");
        boolean possuiConvenio1 = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("O paciente esta em condicao normal? (true/false): ");
        boolean condicaoNormal1 = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("A pressao arterial do paciente esta alterada? (true/false): ");
        boolean pressaoArterialAlterada1 = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("O paciente esta acompanhado? (true/false): ");
        boolean pacienteAcompanhado1 = scanner.nextBoolean();
        scanner.nextLine();
        Paciente paciente1 = new Paciente(nomePaciente1, idade1, cpfPaciente1, emailPaciente1, telefonePaciente1, possuiConvenio1, condicaoNormal1, pressaoArterialAlterada1, pacienteAcompanhado1);

        System.out.println("\nCadastrando Biomedico(a)");
        System.out.println("Insira o nome do Biomedico(a): ");
        String nomeBio1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfBio1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailBio1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneBio1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o CRBM: ");
        String crbm1 = scanner.next();
        scanner.nextLine();
        Biomedico biomedico1 = new Biomedico(nomeBio1, cpfBio1, emailBio1, telefoneBio1, crbm1);

        System.out.println("\nCadastrando Biomedico(a)");
        System.out.println("Insira o nome do Biomedico(a): ");
        String nomeBio2 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfBio2 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailBio2 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneBio2 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o CRBM: ");
        String crbm2 = scanner.next();
        scanner.nextLine();
        Biomedico biomedico2 = new Biomedico(nomeBio2, cpfBio2, emailBio2, telefoneBio2, crbm2);

        System.out.println("\nCadastrando Medico(a)");
        System.out.println("Insira o nome do Cardiologista: ");
        String nomeCardio1 = scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailCardio1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfCardio1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneCardio1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmCardio1 = scanner.next();
        scanner.nextLine();
        Cardiologista cardiologista1 = new Cardiologista(nomeCardio1, cpfCardio1, emailCardio1, telefoneCardio1, crmCardio1);

        System.out.println("\nCadastrando Medico(a)");
        System.out.println("Insira o nome do Ginecologista: ");
        String nomeGineco1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfGineco1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailGineco1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneGineco1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmGineco1 = scanner.next();
        scanner.nextLine();
        Ginecologista ginecologista1 = new Ginecologista(nomeGineco1, cpfGineco1, emailGineco1, telefoneGineco1, crmGineco1);

        System.out.println("\nCadastrando Medico(a)");
        System.out.println("Insira o nome do Clínico Geral: ");
        String nomeGeral1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfGeral1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailGeral1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneGeral1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmGeral1 = scanner.next();
        scanner.nextLine();
        ClinicoGeral clinicoGeral1 = new ClinicoGeral(nomeGeral1, cpfGeral1, emailGeral1, telefoneGeral1, crmGeral1);

        System.out.println("\nCadastrando Medico(a)");
        System.out.println("Insira o nome do Psiquiatra: ");
        String nomePsi1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfPsi1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailPsi1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefonePs1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmPsi1 = scanner.next();
        scanner.nextLine();
        Psiquiatra psiquiatra1 = new Psiquiatra(nomePsi1, cpfPsi1, emailPsi1, telefonePs1, crmPsi1);

        System.out.println("\nCadastrando Medico(a)");
        System.out.println("Insira o nome do Urologista: ");
        String nomeUro1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfUro1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailUro1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneUro1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o CRM: ");
        String crmUro1 = scanner.next();
        scanner.nextLine();
        Urologista urologista1 = new Urologista(nomeUro1, cpfUro1, emailUro1, telefoneUro1, crmUro1);

        System.out.println("\nCadastrando Enfermeiro(a)");
        System.out.println("Insira o nome do Enfermeiro: ");
        String nomeEnf1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfEnf1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailEnf1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneEnf1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o COREN: ");
        String corenEnf1 = scanner.next();
        scanner.nextLine();
        Enfermeiro enfermeiro1 = new Enfermeiro(nomeEnf1, cpfEnf1, emailEnf1, telefoneEnf1, corenEnf1);

        System.out.println("\nCadastrando Tecnico em Enfermagem");
        System.out.println("Insira o nome do Técnico em Enfermagem: ");
        String nomeTecEnf1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfTecEnf1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailTecEnf1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneTecEnf1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o COREN: ");
        String corenTecEnf1 = scanner.next();
        scanner.nextLine();
        TecnicoEmEnfermagem tecnicoEnfermagem1 = new TecnicoEmEnfermagem(nomeTecEnf1, cpfTecEnf1, emailTecEnf1, telefoneTecEnf1, corenTecEnf1);

        System.out.println("\nCadastrando Recepcionista");
        System.out.println("Insira o nome da Recepcionista: ");
        String nomeRecep1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfRecep1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailrecep1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneRecep1 = scanner.next();
        scanner.nextLine();
        Recepcionista recepcionista1 = new Recepcionista(nomeRecep1, cpfRecep1, emailrecep1, telefoneRecep1);

        System.out.println("\nCadastrando Auxiliar de Limpeza");
        System.out.println("Insira o nome do Auxiliar de Limpeza: ");
        String nomeFuncLimp1 = scanner.nextLine();
        System.out.println("Insira o cpf: ");
        String cpfFuncLimp1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o email: ");
        String emailFuncLimp1 = scanner.next();
        scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefoneFuncLimp1 = scanner.next();
        scanner.nextLine();
        Limpeza funcionarioLimpeza1 = new Limpeza(nomeFuncLimp1, cpfFuncLimp1, emailFuncLimp1, telefoneFuncLimp1);

        System.out.println("\nMarcando Cirurgia");
        LocalDateTime dataHoraCirurgia1 = LocalDateTime.of(2023,12,19,10,30, 0);
        System.out.println("Insira o Procedimento Cirurgico: ");
        String procedimentoCirurgia1 = scanner.nextLine();

        recepcionistaController.marcarCirurgia("1", dataHoraCirurgia1, cardiologista1, paciente1, procedimentoCirurgia1);

        System.out.println("\nMarcando Cirurgia");
        LocalDateTime dataHoraCirurgia2 = LocalDateTime.of(2023,12,19,10,30, 0);
        System.out.println("Insira o Procedimento Cirurgico: ");
        String procedimentoCirurgia2 = scanner.nextLine();
        recepcionistaController.marcarCirurgia("2", dataHoraCirurgia2, clinicoGeral1, paciente1, procedimentoCirurgia2);

        System.out.println("\nMarcando Coleta de Amostras");
        System.out.println("Insira o tipo de amostra: ");
        String tipo1 = scanner.next();
        scanner.nextLine();
        LocalDateTime dataHoraColeta1 = LocalDateTime.of(2023,12,20,10,30, 0);
        System.out.println("Insira a condicao da amostra: ");
        String condicaoDaAmostra1 = scanner.next();
        scanner.nextLine();
        recepcionistaController.marcarColeta("3", dataHoraColeta1, enfermeiro1, tipo1, paciente1, condicaoDaAmostra1);

        System.out.println("\nMarcando Coleta de Amostras");
        System.out.println("Insira o tipo de amostra: ");
        String tipo2 = scanner.next();
        scanner.nextLine();
        LocalDateTime dataHoraColeta2 = LocalDateTime.of(2023,12,19,11,30, 0);
        System.out.println("Insira a condicao da amostra: ");
        scanner.nextLine();
        String condicaoDaAmostra2 = scanner.next();
        recepcionistaController.marcarColeta("4", dataHoraColeta2, tecnicoEnfermagem1, tipo2, paciente1, condicaoDaAmostra2);

        System.out.println("\nMarcando Consulta");
        LocalDateTime dataHoraConsulta1 = LocalDateTime.of(2023,12,20,10,30, 0);
        recepcionistaController.marcarConsulta("5", dataHoraConsulta1, urologista1, paciente1);

        System.out.println("\nMarcando Consulta");
        LocalDateTime dataHoraConsulta2 = LocalDateTime.of(2023,12,22,10,30, 0);
        recepcionistaController.marcarConsulta("6", dataHoraConsulta2, psiquiatra1, paciente1);


        System.out.println("\nMarcando Consulta");
        LocalDateTime dataHoraConsulta3 = LocalDateTime.of(2023,12,21,10,30, 0);
        recepcionistaController.marcarConsulta("7", dataHoraConsulta3, ginecologista1, paciente1);

        System.out.println("\nCadastrando Analise");
        System.out.println("Insira o resultado da analise: ");
        double resultado1 = scanner.nextDouble();
        scanner.nextLine();
        biomedicoController.fazerAnaliseDeAmostras("8",biomedico1, paciente1,LocalDateTime.of(2024,1,2,12,30,0), resultado1, recepcionistaController.encontrarColeta("3"));

        System.out.println("\nCadastrando Analise");
        System.out.println("Insira o resultado da analise: ");
        double resultado2 = scanner.nextDouble();
        scanner.nextLine();
        biomedicoController.fazerAnaliseDeAmostras("9", biomedico2, paciente1,LocalDateTime.of(2024,1,2,11,30,0), resultado2, recepcionistaController.encontrarColeta("4"));

        pacienteController.listarTodos();

        biomedicoController.remover(biomedico2);
        biomedicoController.adicionar(biomedico2);
        pacienteController.adicionar(paciente1);
        biomedicoController.adicionar(biomedico1);
        biomedicoController.adicionar(biomedico1);
        medicoController.adicionar(ginecologista1);
        medicoController.adicionar(cardiologista1);
        medicoController.adicionar(urologista1);
        medicoController.adicionar(psiquiatra1);
        medicoController.adicionar(clinicoGeral1);
        enfermagemController.adicionar(enfermeiro1);
        enfermagemController.adicionar(tecnicoEnfermagem1);
        limpezaController.adicionar(funcionarioLimpeza1);
        recepcionistaController.adicionar(recepcionista1);

        pacienteController.buscar("brenda");
        biomedicoController.buscar("samuel");
        medicoController.buscar("andrade");

        medicoController.listarTodos();
        recepcionistaController.listarConsultas();
        recepcionistaController.listarColetas();
        recepcionistaController.listarCirurgias();

        recepcionistaController.buscar("Brenda");

        medicoController.fazerCirurgia(recepcionistaController.encontrarCirurgia("1"));
        medicoController.fazerConsulta(recepcionistaController.encontrarConsulta("7"));

        enfermagemController.realizarColeta(recepcionistaController.encontrarColeta("4"));
        LocalDateTime dataHoraTriagem1 = LocalDateTime.of(2023,12,10,10,0, 0);
        enfermagemController.realizarTriagem(paciente1, dataHoraTriagem1);

        recepcionistaController.alterarData(LocalDateTime.of(2022,12,30,13,30, 0), recepcionistaController.encontrarCirurgia("1") );
    }
}