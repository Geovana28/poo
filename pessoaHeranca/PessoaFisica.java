package pessoaHeranca;

/**
 * Representa uma pessoa física com o atributo CPF.
 * Estende a classe Pessoa.
 */
public class PessoaFisica extends Pessoa {
    private String cpf;

    /**
     * Obtém o CPF da pessoa física.
     * 
     * @return o CPF da pessoa física
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa física.
     * 
     * @param cpf o CPF a ser definido
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
