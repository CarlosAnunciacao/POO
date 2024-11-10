
import model.Paciente;
import model.Medico;
import service.CadastroService;

import java.util.Scanner;

public class Main {
    private static CadastroService cadastroService = new CadastroService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Sistema de Gerenciamento de Consultas Médicas");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Cadastrar Médico");
            System.out.println("3. Listar Pacientes");
            System.out.println("4. Listar Médicos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    cadastrarMedico();
                    break;
                case 3:
                    cadastroService.listarPacientes();
                    break;
                case 4:
                    cadastroService.listarMedicos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarPaciente() {
        System.out.print("Nome do Paciente: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do Paciente: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço do Paciente: ");
        String endereco = scanner.nextLine();

        Paciente paciente = new Paciente(nome, cpf, endereco);
        cadastroService.cadastrarPaciente(paciente);
    }

    private static void cadastrarMedico() {
        System.out.print("Nome do Médico: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do Médico: ");
        String cpf = scanner.nextLine();
        System.out.print("Especialidade do Médico: ");
        String especialidade = scanner.nextLine();
        System.out.print("CRM do Médico: ");
        String crm = scanner.nextLine();

        Medico medico = new Medico(nome, cpf, especialidade, crm);
        cadastroService.cadastrarMedico(medico);
    }
}
