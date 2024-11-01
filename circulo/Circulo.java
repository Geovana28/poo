package circulo;

public class Circulo {
    private int x, y;
    private double raio;

    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    public int getX() { 
    	return x; 
    	}
    
    public void setX(int x) { 
    	this.x = x; 
    	}

    public int getY() { 
    	return y; 
    	}
    
    public void setY(int y) {
    	this.y = y; 
    	}

    public double getRaio() {
    	return raio;
    	}
    
    public void setRaio(double raio) {
    	this.raio = raio; 
    	}

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void moveX(int x1) {
        this.x = this.x + x1;
    }

    public void moveY(int y1) {
        this.y = this.y + y1;
    }

    public void aumenta(double r) {
        if (r > 0) {
            this.raio *= r;
        }
    }

    public String exibe() {
        return "Centro: (" + x + ", " + y + ")\n" +
               "Raio: " + raio + "\n" +
               "Área: " + calcularArea() + "\n" +
               "Perímetro: " + calcularPerimetro();
    }
}
