import java.util.Scanner;
public class Ejercicio54{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace una piramide vacia");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        int altc = 0;
        int esp = alt-2;
        for(int i = 0; i<alt;i++){
            System.out.print("*");
        }
        System.out.println("");
        altc = alt;
        for(int i = alt-2; i>0;i--){
            System.out.print("*");
            for(esp = altc-2;esp>1;esp--){
                System.out.print(" ");
            }
            altc--;
            System.out.println("*");
        }
        System.out.print("*");
    }
}