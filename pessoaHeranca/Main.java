package pessoaHeranca;

import java.util.Scanner;

/**
 * Classe principal que inicializa o programa de cadastro de pessoas.
 */
public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Exibir Cadastro");
            System.out.println("4 - Sair");
            int opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                PessoaFisica pessoaFisica = new PessoaFisica();
                System.out.print("Nome: ");
                pessoaFisica.setNome(input.nextLine());
                System.out.print("CPF: ");
                pessoaFisica.setCpf(input.nextLine());
                cadastro.cadastrarPessoaFisica(pessoaFisica);
                System.out.println("Pessoa Física cadastrada com sucesso!");

            } else if (opcao == 2) {
                PessoaJuridica pessoaJuridica = new PessoaJuridica();
                System.out.print("Nome: ");
                pessoaJuridica.setNome(input.nextLine());
                System.out.print("CNPJ: ");
                pessoaJuridica.setCnpj(input.nextLine());
                cadastro.cadastrarPessoaJuridica(pessoaJuridica);
                System.out.println("Pessoa Jurídica cadastrada com sucesso!");

            } else if (opcao == 3) {
                System.out.println("\nCadastro de Pessoas:");
                cadastro.exibirPessoas();

            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        input.close();
    }
}
