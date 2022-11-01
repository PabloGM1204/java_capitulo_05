import java.util.Scanner;
public class Ejercicio30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice las horas que hay entre dos dias de la semana");
        System.out.print("Primer día de la semana: ");
        String nd =sc.next();
        int d = 0;
        switch (nd){
            case "lunes":
                d = 1;
                break;
            case "martes":
                d = 2;
                break;
            case "miercoles":
                d = 3;
                break;
            case "jueves":
                d = 4;
                break;
            case "viernes":
                d = 5;
                break;
            case "sabado":
                d = 6;
                break;
            case "domingo":
                d = 7;
                break;
            default:
                System.out.println("Error al ingresar el día");
                break;
        }
        System.out.print("Ingresa la hora del " + nd + " (solo números): ");
        int h = sc.nextInt();
        int d2 = 0;
        System.out.print("Ingresa el segundo día de la semana: ");
        String nd2= sc.next();
        switch (nd2){
            case "lunes":
                d2 = 1;
                break;
            case "martes":
                d2 = 2;
                break;
            case "miercoles":
                d2 = 3;
                break;
            case "jueves":
                d2 = 4;
                break;
            case "viernes":
                d2 = 5;
                break;
            case "sabado":
                d2 = 6;
                break;
            case "domingo":
                d2 = 7;
                break;
            default:
                System.out.println("Error al ingresar el día");
                break;
        }
        System.out.print("Ingresa la hora del " + nd2 + " (solo números): ");
        int h2 = sc.nextInt();
        int t = ((d2-d)*24) + (h2-h);//horas transcurridas entre dos días
        System.out.println("Entre las "+ h +":00h del " + nd + " y las "+ h2 + ":00h del martes hay " + t+ " hora/s");
    }
}   