import java.util.Scanner;
public class Ejercicio53{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta un triangulo");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        for(int i = 0;i<=alt;i++){
            for(int a = 0;a<alt-i;a++){
                System.out.print("*");
            }
            System.out.println(""); 
        }
    }
}