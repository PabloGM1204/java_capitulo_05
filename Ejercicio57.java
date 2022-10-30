import java.util.Scanner;
public class Ejercicio57{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace una piramide vacia");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        int esp = 1;
        int esint = 1;
        for(int i = alt;i>0;i--){
                System.out.print("*");
        }
        System.out.println("");
        for(int i = 1;i<alt-1;i++){
            for(int a = 0; a<esp;a++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(esint = 0; esint<alt-i-2; esint++){
                System.out.print(" ");
            }
            esp++;
            System.out.println("*");
        }
        for(int a = 0; a<esp;a++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}