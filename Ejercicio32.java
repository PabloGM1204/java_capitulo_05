import java.util.Scanner;
public class Ejercicio32{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te coge los números pares de un número y los suma");
        System.out.print("Dime un número entero: ");
        int n = sc.nextInt();
        int p = 0;
        int c = 0;
        int t = 0;
        while(n>0){
            c = n%10;
            if((c%2)==0){
                System.out.print(c+" ");
                t +=c;
            }
            n /=10;
        }
        System.out.println("La suma total es: "+t);
    }
}