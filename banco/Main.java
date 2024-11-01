package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.print("Informe o número da conta: ");
        int numeroConta = entrada.nextInt();
        
        System.out.print("Informe o número da agência: ");
        int numeroAgencia = entrada.nextInt();
        
        contaCorrente.iniciarContaCorrente(numeroConta, numeroAgencia);

        System.out.print("Informe um valor para depósito: ");
        double valorDeposito = entrada.nextDouble();
        contaCorrente.depositar(valorDeposito);

        System.out.println("\nDados da conta após depósito:");
        System.out.println(contaCorrente.exibe());

        System.out.print("\nInforme um valor para saque: ");
        double valorSaque = entrada.nextDouble();
        contaCorrente.sacar(valorSaque);

        System.out.println("\nDados da conta após saque:");
        System.out.println(contaCorrente.exibe());

        entrada.close();
    }
}
