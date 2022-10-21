import java.util.Scanner;
public class Ejercicio9{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice cuantos dígitos tiene un número");
        System.out.print("Dime un número: ");
        long n = sc.nextLong();
        long c = 1;
        while(n/10!=0){
            c++;
            n /= 10;
        }
        System.out.println("Tu número tiene "+c+" cifra/s");
    }
}