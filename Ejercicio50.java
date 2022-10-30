import java.util.Scanner;
public class Ejercicio50{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace el 155 con asteriscos");
        System.out.print("Introduzca la altura (5 como mínimo): ");
        int alt = sc.nextInt();
        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int esp = sc.nextInt();
        if(alt<5 && esp<1){
            System.out.println("Error, tienes que introducir una altura minima de 5 y un espaciado minimo de 1");
        }else{
            System.out.print("*");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.print("****");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.println("****");
            System.out.print("*");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.print("*   ");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.println("*");
            System.out.print("*");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.print("****");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.println("****");
            for(int i = 1;i<=alt-4;i++){
                System.out.print("*");
                for(int e = 1; e<=esp;e++){
                    System.out.print(" ");
                }
                System.out.print("   *");
                for(int e = 1; e<=esp;e++){
                    System.out.print(" ");
                }
                System.out.println("   *");
            }
            System.out.print("*");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.print("****");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.println("****");
        }
    }
}