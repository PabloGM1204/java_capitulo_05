import java.util.Scanner;
public class Ejercicio29{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra por pantalla todos los números enteros positivos menores a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime otro número: ");
        int n2 = sc.nextInt();
        for(int i = 1; i<n;i++){
            if(i%n2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}