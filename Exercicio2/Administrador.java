package Exercicio2;

public class Administrador extends Empregado {

    private String ajudaDeCusto;

    public Administrador() {
        super();
        this.ajudaDeCusto = "";
    }

    public Administrador(String nome, String idade, String altura, String peso, String numeroSecao, String salarioBase, String INSS, String ajudaDeCusto) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, INSS);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public String getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(String ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

   
    public double calcularSalario() {
        double salario = super.calcularSalario(); 
        double ajuda = Double.parseDouble(ajudaDeCusto); 
        return salario + ajuda; 
    }

    public String toString() {
        return super.toString() + ", Ajuda de Custo: " + ajudaDeCusto;
    }
}
