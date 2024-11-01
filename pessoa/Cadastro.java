package pessoa;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que permite o cadastro de pessoas, pessoas físicas e pessoas jurídicas.
 */
public class Cadastro {
    private List<Pessoa> pessoas;

    /**
     * Construtor da classe Cadastro que inicializa a lista de pessoas.
     */
    public Cadastro() {
        pessoas = new ArrayList<>();
    }

    /**
     * Cadastra uma pessoa no sistema.
     * 
     * @param pessoa Objeto Pessoa a ser adicionado ao cadastro
     */
    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    /**
     * Exibe todas as pessoas cadastradas.
     */
    public void exibirPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());
            }
            System.out.println(); // linha em branco para separar registros
        }
    }
}
