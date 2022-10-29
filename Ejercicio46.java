import java.util.Scanner;
public class Ejercicio46{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace un rectangulo vacio");
        System.out.print("Dime la anchura: ");
        int anc = sc.nextInt();
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        if(anc<=2 && alt<=2){
            System.out.println("Debe introducir datos mayores que dos");
        }else{
                for(int i = 1;i<=anc;i++){
                    System.out.print("*");
                }
                System.out.println("");
                for(int i = 1;i<=alt-2;i++){
                    System.out.print("*");
                    for(int esp = 1;esp<=anc-2;esp++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                for(int i = 1;i<=anc;i++){
                    System.out.print("*");
                }
        }
    }
}