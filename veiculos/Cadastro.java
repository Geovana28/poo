package cadastro;

import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia o cadastro de veículos, permitindo adicionar e exibir todos os veículos cadastrados.
 */
public class Cadastro {
    private List<Veiculo> veiculos;

    /**
     * Construtor da classe Cadastro que inicializa a lista de veículos.
     */
    public Cadastro() {
        veiculos = new ArrayList<>();
    }

    /**
     * Cadastra um novo veículo no sistema.
     *
     * @param veiculo Objeto Veiculo a ser adicionado ao cadastro
     */
    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    /**
     * Exibe todos os veículos cadastrados.
     */
    public void exibirVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.exibe());
        }
    }
}
