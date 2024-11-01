package time;

public class Time {
    private int horas = 0, minutos = 0, segundos = 0;

    public void setHoras(int h) {
        if (h < 0 || h > 23) {
            horas = 0;
            System.out.println("Hora inválida! Definindo para 0.");
        } else {
            horas = h;
        }
    }

    public void setMinutos(int m) {
        if (m < 0 || m > 59) {
            minutos = 0;
            System.out.println("Minuto inválido! Definindo para 0.");
        } else {
            minutos = m;
        }
    }

    public void setSegundos(int s) {
        if (s < 0 || s > 59) {
            segundos = 0;
            System.out.println("Segundo inválido! Definindo para 0.");
        } else {
            segundos = s;
        }
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public Time() {
      
    }

    public Time(int h) {
        setHoras(h);
        this.minutos = 0;
        this.segundos = 0;
    }

    public Time(int h, int m) {
        setHoras(h);
        setMinutos(m);
        this.segundos = 0;
    }

    public Time(int h, int m, int s) {
        setHoras(h);
        setMinutos(m);
        setSegundos(s);
    }

    public String getTimeFormat() {
        String horasFormatadas = (horas < 10) ? "0" + horas : String.valueOf(horas);
        String minutosFormatados = (minutos < 10) ? "0" + minutos : String.valueOf(minutos);
        String segundosFormatados = (segundos < 10) ? "0" + segundos : String.valueOf(segundos);
        
        return horasFormatadas + ":" + minutosFormatados + ":" + segundosFormatados;
    }

}
