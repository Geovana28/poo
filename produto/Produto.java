package produto;

public class Produto {
    private static int ultimo_id = 0;  
    private int id;                  
    private String nome;               
    private double preco;             

    public Produto() {
        this.id = ++ultimo_id;         
        this.nome = "Nome não informado";
        this.preco = 0;
    }

    public Produto(String nome, double preco) {
        this();                      
        this.nome = nome;
        setPreco(preco);               
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
            
        } else {
            this.preco = preco;
        }
    }

    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Preço: " + preco);
    }

    public void reajustaPreco(double percentual) {
        this.preco = this.preco + this.preco * (percentual / 100);
    }

    public static int getUltimoId() {
        return ultimo_id;
    }
}
