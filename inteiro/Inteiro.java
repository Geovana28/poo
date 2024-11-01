package inteiro;

public class Inteiro {

    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado = resultado +  a; 
        }
        return resultado;
    }

    public int potencia(int a, int b) {
        int resultado = 1; 
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a); 
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        if (b == 0) {
            System.out.println("Divisão por zero não é permitida. Retornando 0.");
            return 0; 
        }
        int contador = 0;
        while (a >= b) {
            a = a - b; 
            contador++; 
        }
        return contador; 
    }

    public int resto(int a) {
        int quociente = divisao(a, 2);
        return a - multiplicacao(quociente, 2); 
    }

}
