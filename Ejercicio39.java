import java.util.Scanner;
public class Ejercicio39{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra desde el 1 hasta el número que tu quieras y muestra el factorial de cada uno");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println();
        }
    }
}