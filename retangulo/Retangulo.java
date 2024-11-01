package psc;

/**
 * Representa um retângulo com altura e largura, e métodos para calcular sua área e perímetro.
 */
public class Retangulo {
    private float altura, largura;

    /**
     * Construtor padrão que inicializa o retângulo com altura e largura iguais a zero.
     */
    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    /**
     * Retorna a altura do retângulo.
     *
     * @return a altura do retângulo
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Define a altura do retângulo.
     *
     * @param alt a altura do retângulo
     */
    public void setAltura(float alt) {
        altura = alt;
    }

    /**
     * Retorna a largura do retângulo.
     *
     * @return a largura do retângulo
     */
    public float getLargura() {
        return largura;
    }

    /**
     * Define a largura do retângulo.
     *
     * @param larg a largura do retângulo
     */
    public void setLargura(float larg) {
        largura = larg;
    }

    /**
     * Calcula a área do retângulo.
     *
     * @return a área do retângulo
     */
    public float calculaArea() {
        return altura * largura;
    }

    /**
     * Calcula o perímetro do retângulo.
     *
     * @return o perímetro do retângulo
     */
    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    /**
     * Exibe as informações do retângulo, incluindo altura, largura, área e perímetro.
     *
     * @return uma string formatada com as informações do retângulo
     */
    public String exibe() {
        return String.format("Altura: %.2f\nLargura: %.2f\nÁrea: %.2f\nPerímetro: %.2f", 
                             altura, largura, calculaArea(), calculaPerimetro());
    }
}
