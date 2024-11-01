package pessoaHeranca;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para cadastro de pessoas físicas e jurídicas.
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
     * Cadastra uma pessoa física no sistema.
     * 
     * @param pessoaFisica Objeto PessoaFisica a ser adicionado ao cadastro
     */
    public void cadastrarPessoaFisica(PessoaFisica pessoaFisica) {
        pessoas.add(pessoaFisica);
    }

    /**
     * Cadastra uma pessoa jurídica no sistema.
     * 
     * @param pessoaJuridica Objeto PessoaJuridica a ser adicionado ao cadastro
     */
    public void cadastrarPessoaJuridica(PessoaJuridica pessoaJuridica) {
        pessoas.add(pessoaJuridica);
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
