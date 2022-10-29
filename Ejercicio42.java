import java.util.Scanner;
public class Ejercicio42{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te pide un número y te dice si los 5 siguientes son primos i no");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        boolean primo = true;
        for(int i = n;i<=n+4;i++){
            for (int a = 2;a<i;a++) {
                if((i%a)==0){
                    primo = false;
                }
            }
            if(primo){
                System.out.println(i+" es primo");
                primo = true;
            }else{
                System.out.println(i+" no es primo");
                primo = true;
            }
        }
    }
}