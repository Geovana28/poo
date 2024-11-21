 
 public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String ie;

    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj, String ie) {
        super (nome, telefone, endereco);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String exibe() {
        return super.exibe() + ", CNPJ: " + cnpj + ", Inscrição Estadual: " + ie;
    }
}
