import java.util.Scanner;
public class Ejercicio8{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace la tabla de multiplicar de un número");
        System.out.print("De que número quieres la tabla: ");
        int n = sc.nextInt();
        for(int i = 0; i<=10; i++){
            System.out.println(n+" * "+i+" = "+(i*n));
        }
    }
}