package cadastro;

import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia o cadastro de funcionários, permitindo adicionar e exibir todos os funcionários.
 */
public class Cadastro {
    private List<Funcionario> funcionarios;

    /**
     * Construtor da classe Cadastro que inicializa a lista de funcionários.
     */
    public Cadastro() {
        funcionarios = new ArrayList<>();
    }

    /**
     * Cadastra um novo funcionário no sistema.
     *
     * @param funcionario Objeto Funcionario a ser adicionado ao cadastro
     */
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    /**
     * Exibe todos os funcionários cadastrados.
     */
    public void exibirFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.exibe());
        }
    }
}
