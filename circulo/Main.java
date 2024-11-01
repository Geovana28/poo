package circulo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a coordenada x do círculo: ");
        int x = entrada.nextInt();
        System.out.print("Digite a coordenada y do círculo: ");
        int y = entrada.nextInt();
        System.out.print("Digite o raio do círculo: ");
        double raio = entrada.nextDouble();

        Circulo circulo = new Circulo(x, y, raio);

        int opcao = 0;
        
        while (opcao != 4) {
            System.out.println("\n1 – Mover");
            System.out.println("2 – Aumentar");
            System.out.println("3 – Imprimir");
            System.out.println("4 – Sair");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.print("Mover no eixo X: ");
                int moverX = entrada.nextInt();
                circulo.moveX(moverX);

                System.out.print("Mover no eixo Y: ");
                int moverY = entrada.nextInt();
                circulo.moveY(moverY);
                
            } else if (opcao == 2) {
                System.out.print("Aumentar o raio: ");
                
                
                double fatorAumento = entrada.nextDouble();
                circulo.aumenta(fatorAumento);
                
            } else if (opcao == 3) {
                System.out.println(circulo.exibe());
            }
        }
        entrada.close();
    }
}
