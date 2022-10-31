import java.util.Scanner;
public class Ejercicio60{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dibuja unos calcetines de navidad");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        int esp = 3;
        for(int i = 1; i<=alt-2; i++){
            for(int j = 1; j<=esp; j++){
                System.out.print("*");
            }
            System.out.print("     ");
            for(int j = 1; j<=esp; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("******  ******");
        System.out.print("******  ******");
    }
}