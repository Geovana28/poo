package time;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Time time1 = new Time();
        System.out.println("Time 1 (Construtor padrão): " + time1.getTimeFormat()); 

        Time time2 = new Time(12);
        System.out.println("Time 2 (Construtor com hora): " + time2.getTimeFormat()); 

        
        Time time3 = new Time(12, 30);
        System.out.println("Time 3 (Construtor com hora e minutos): " + time3.getTimeFormat()); 

        Time time4 = new Time(12, 30, 45);
        System.out.println("Time 4 (Construtor com hora, minutos e segundos): " + time4.getTimeFormat()); 

        Time time5 = new Time(25, 61, 70); 
        System.out.println("Time 5 (Valores inválidos): " + time5.getTimeFormat()); 
    }

}
