package cadastro;

import java.util.Scanner;

/**
 * Classe principal que inicializa o programa de cadastro de veículos.
 */
public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Exibir Veículos");
            System.out.println("3 - Sair");
            int opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                Veiculo veiculo = new Veiculo();

                System.out.print("Marca: ");
                veiculo.setMarca(input.nextLine());

                System.out.print("Modelo: ");
                veiculo.setModelo(input.nextLine());

                System.out.print("Número do Chassi: ");
                veiculo.setNumeroChassi(input.nextLine());

                System.out.print("Placa: ");
                veiculo.setPlaca(input.nextLine());

                System.out.print("Cor: ");
                veiculo.setCor(input.nextLine());

                cadastro.cadastrarVeiculo(veiculo);
                System.out.println("Veículo cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\nLista de Veículos Cadastrados:");
                cadastro.exibirVeiculos();

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
