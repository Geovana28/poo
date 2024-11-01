package inteiro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Inteiro inteiro = new Inteiro();
        
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 – Multiplicação");
            System.out.println("2 – Potência");
            System.out.println("3 – Divisão");
            System.out.println("4 – Verificar Par");
            System.out.println("5 – Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.print("Digite o primeiro número (a): ");
                    int a1 = entrada.nextInt();
                    System.out.print("Digite o segundo número (b): ");
                    int b1 = entrada.nextInt();
                    System.out.println("Resultado: " + inteiro.multiplicacao(a1, b1));
                    break;

                case 2: 
                    System.out.print("Digite a base (a): ");
                    int base = entrada.nextInt();
                    System.out.print("Digite o expoente (b): ");
                    int expoente = entrada.nextInt();
                    System.out.println("Resultado: " + inteiro.potencia(base, expoente));
                    break;

                case 3: 
                    System.out.print("Digite o numerador (a): ");
                    int num = entrada.nextInt();
                    System.out.print("Digite o denominador (b): ");
                    int den = entrada.nextInt();
                    int resultadoDivisao = inteiro.divisao(num, den);
                    System.out.println("Resultado: " + resultadoDivisao);
                    break;

                case 4: 
                    System.out.print("Digite um número para verificar se é par: ");
                    int numeroParaVerificar = entrada.nextInt();
                    int resto = inteiro.resto(numeroParaVerificar);
                    if (resto == 0) {
                        System.out.println(numeroParaVerificar + " é par.");
                    } else {
                        System.out.println(numeroParaVerificar + " é ímpar.");
                    }
                    break;

                case 5: 
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        entrada.close();
    }
}
