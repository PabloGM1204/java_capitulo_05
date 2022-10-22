import java.util.Scanner;
public class Ejercicio23{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa permite ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000");
        System.out.println("Dime números:");
        int t = 0;
        int cont = 0;
        do{
            int n = sc.nextInt();
            t +=n;
            cont++;
        }while(t <=10000);
        System.out.println("Total acumulado: "+t);
        System.out.println("Números introducidos: "+cont);
        System.out.println("La media sería de: "+(double) t/ (double)cont);


    }
}