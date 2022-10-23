import java.util.Scanner;
public class Ejercicio25{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa lee un número y despues lo muestra por teclado");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int r = 0;
        if(n>=0 && n<10){
            System.out.println("Al ser sola una cifra es igual: "+n);
        }else{
            while(n>0){
                r = (r *10)+(n%10);
                n /=10;
            }
            System.out.println("Tu número dado la vuelta es: "+r);
        }
    }
}