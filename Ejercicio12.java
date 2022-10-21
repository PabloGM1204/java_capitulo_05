import java.util.Scanner;
public class Ejercicio12{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice n números de la sucesión de Fibonacci");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int c = 1;
        switch (n) {
            case 1:
                System.out.println("0");
                break;
            case 2:
                System.out.println("0 1");
                break;
            default:
            System.out.print("0 1");
            int x = 0;
            int y = 1;
            int h;
                for (int i = n; i>2; i--) {
                    h = x;
                    x = y;
                    y = h + y;
                    System.out.print(" "+y);
                }
                break;
        }
        
    }
}