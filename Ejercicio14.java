import java.util.Scanner;
public class Ejercicio14{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te calcula un número con exponente");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime un exponente: ");
        int e = sc.nextInt();
        System.out.println("El resultado seria: "+(Math.pow(n, e)));
    }
}