import java.util.Scanner;
public class Ejercicio33{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una U");
        System.out.print("Dime la altura de la U: ");
        int alt = sc.nextInt();
        for(int i = 0;i<alt-1;i++ ){
            System.out.print("*");
            for(int e = 0; e<alt-2; e++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for(int e = 0;e<alt-2;e++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}