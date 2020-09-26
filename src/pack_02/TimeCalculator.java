package Pack_02;

import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class TimeCalculator {
    public static void main(String[] args) {        
        Scanner teclado = new Scanner(System.in);
        
        byte years, months, weeks, days, hours;
        int totalHoras;
        
        System.out.print("Digite La Cant De Horas Que Desea Transformar: "); totalHoras = teclado.nextInt();
        
        /*1 Dia = 24 Horas
        1 Semana = 7 dias = 168 Horas
        1 Mes = 4 Semanas = 28 Dias = 672 Horas
        1 Año = 12 Meses = 48 Semanas = 336 Dias = 8064 Horas
        Nota Suponiendo Que Cada Mes Tiene 4 Semanas*/
        
        years = (byte)(totalHoras / 8064);
        months = (byte)(totalHoras % 8064 / 672);
        weeks = (byte)(totalHoras % 672 / 168);
        days = (byte)(totalHoras % 168 / 24);
        hours = (byte)(totalHoras % 24);
                
        System.out.println(totalHoras + " Horas Equivale A");
        System.out.println(years + (years == 1 ? " Año": " Años"));
        System.out.println(months + (months == 1 ? " Mes": " Meses"));
        System.out.println(weeks + (weeks == 1 ? " Semana": " Semanas"));
        System.out.println(days + (days == 1 ? " dia": " Dias"));
        System.out.println(hours + (hours == 1 ? " hora": " Horas"));
    }
}
