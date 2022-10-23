import java.util.Scanner;
public class Ejercicio31{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una L con *");
        System.out.print("Dime la altura de la L: ");
        int alt = sc.nextInt();
        for(int i = 1;i<alt; i++){
            System.out.println("*");
        }
        for(int i =0;i<alt/2+1;i++){
            System.out.print("* ");
        }
    }
}