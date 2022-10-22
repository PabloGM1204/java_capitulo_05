import java.util.Scanner;
public class Ejercicio16{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice si un número es primo o no");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int i = 2;
        boolean primo = true;
        do{
            if((n%i) == 0){
                primo = false;
            }
            i++;
        }while(i < n);
        if(primo){
            System.out.println("Su número es primo");
        }else{
            System.out.println("Su número no es primo");
        }
    }
}