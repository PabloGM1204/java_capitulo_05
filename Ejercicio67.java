import java.util.Scanner;
public class Ejercicio67{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dibuja una escalera");
        System.out.print("Dime la altura de la escalera: ");
        int lera = sc.nextInt();
        System.out.print("Dime la altura del escalon: ");
        int lon = sc.nextInt();
        for(int i = 1; i<=lera; i++){
            for(int a = 1; a<=lon; a++){
                for(int e = 0; e<i; e++){
                    System.out.print("****");
                }
                System.out.println("");
            }
        }
    }
}