package pessoaHeranca;

/**
 * Representa uma pessoa jurídica com o atributo CNPJ.
 * Estende a classe Pessoa.
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    /**
     * Obtém o CNPJ da pessoa jurídica.
     * 
     * @return o CNPJ da pessoa jurídica
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da pessoa jurídica.
     * 
     * @param cnpj o CNPJ a ser definido
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
