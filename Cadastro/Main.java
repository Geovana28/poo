package cadastro;

import java.util.Scanner;

/**
 * Classe principal que inicializa o programa de cadastro de funcionários.
 */
public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Exibir Funcionários");
            System.out.println("3 - Sair");
            int opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = input.nextLine();

                System.out.print("Idade: ");
                int idade = input.nextInt();
                input.nextLine();

                System.out.print("Cargo: ");
                String cargo = input.nextLine();

                System.out.print("Salário: ");
                double salario = input.nextDouble();
                input.nextLine();

                System.out.print("Telefone: ");
                String telefone = input.nextLine();

                System.out.print("Endereço: ");
                String endereco = input.nextLine();

                Funcionario funcionario = new Funcionario(nome, idade, cargo, salario, telefone, endereco);
                cadastro.cadastrarFuncionario(funcionario);
                System.out.println("Funcionário cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\nLista de Funcionários:");
                cadastro.exibirFuncionarios();

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        input.close();
    }
}
