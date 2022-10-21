import java.util.Scanner;
public class Ejercicio11{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace una tabla de el cuadrado y el cubo de un número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.println("  n  |   n²   |   n³");
        System.out.println("====================");
        for(int i = 0; i<=4; i++){
            System.out.println("  "+n+"  |   "+(n*n)+"   |   "+(n*n*n));
            n+=1;
        }
    }
}