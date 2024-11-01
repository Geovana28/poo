package cadastro;

/**
 * Representa um veículo com marca, modelo, número do chassi, placa e cor.
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private String numeroChassi;
    private String placa;
    private String cor;

    /**
     * Obtém a marca do veículo.
     *
     * @return a marca do veículo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca do veículo.
     *
     * @param marca a marca a ser definida
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtém o modelo do veículo.
     *
     * @return o modelo do veículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo do veículo.
     *
     * @param modelo o modelo a ser definido
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtém o número do chassi do veículo.
     *
     * @return o número do chassi do veículo
     */
    public String getNumeroChassi() {
        return numeroChassi;
    }

    /**
     * Define o número do chassi do veículo.
     *
     * @param numeroChassi o número do chassi a ser definido
     */
    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    /**
     * Obtém a placa do veículo.
     *
     * @return a placa do veículo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define a placa do veículo.
     *
     * @param placa a placa a ser definida
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Obtém a cor do veículo.
     *
     * @return a cor do veículo
     */
    public String getCor() {
        return cor;
    }

    /**
     * Define a cor do veículo.
     *
     * @param cor a cor a ser definida
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Exibe as informações do veículo.
     *
     * @return uma string formatada com as informações do veículo
     */
    public String exibe() {
        return String.format("Marca: %s\nModelo: %s\nNúmero do Chassi: %s\nPlaca: %s\nCor: %s\n",
                marca, modelo, numeroChassi, placa, cor);
    }
}
