package pessoaHeranca;

/**
 * Classe base Pessoa com o atributo nome.
 */
public class Pessoa {
    private String nome;

    /**
     * Obtém o nome da pessoa.
     * 
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome o nome a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
