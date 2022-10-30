import java.util.Scanner;
public class Ejercicio56{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta un triangulo");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        int esp = 1;
        for(int i = alt;i>0;i--){
            for(esp = 1;esp<=alt-i;esp++){
                System.out.print(" ");
            }
            for(int a = i;a>0;a--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}