import java.util.Scanner;
public class Ejercicio15{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la potencia de varios número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime el exponente: ");
        int e = sc.nextInt();
        int t = 1;
        System.out.println(n+"^1"+" = "+(n*t));
        for(int i = 2;i<=e;i++){
            t *=n;
            System.out.println(n+"^"+i+" = "+(n*t));
        }
    }
}