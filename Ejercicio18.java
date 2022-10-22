import java.util.Scanner;
public class Ejercicio18{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice los números enteros comprendidos entre dos números");
        System.out.print("Dime un número: ");
        int n1 = sc.nextInt();
        System.out.print("Dime otro número: ");
        int n2 = sc.nextInt();
        int n3 = 0;
        n3 = n2;
        if(n1 == n2){
            System.out.println("Has introducido los mismos número, deben ser distintos");
        }else if (n1>n2){
            n2 = n1;
        }else{
            for (int i = n1; i<=n2; i+=7) {
                    System.out.print(i+" ");
            }
        }
    }
}