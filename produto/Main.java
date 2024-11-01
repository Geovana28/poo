package produto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro produto: ");
        String nome1 = entrada.nextLine();
        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = entrada.nextDouble();
        Produto produto1 = new Produto(nome1, preco1);

        entrada.nextLine();  
        System.out.print("Digite o nome do segundo produto: ");
        String nome2 = entrada.nextLine();
        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = entrada.nextDouble();
        Produto produto2 = new Produto(nome2, preco2);

        System.out.print("Digite o percentual de reajuste de preço: ");
        double reajuste = entrada.nextDouble();
        produto1.reajustaPreco(reajuste);
        produto2.reajustaPreco(reajuste);

        System.out.println("\nInformações do primeiro produto:");
        produto1.exibe();
        System.out.println("\nInformações do segundo produto:");
        produto2.exibe();

        System.out.println("\nÚltimo ID gerado: " + Produto.getUltimoId());

        entrada.close();
    }
}