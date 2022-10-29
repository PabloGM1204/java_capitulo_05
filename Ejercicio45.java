import java.util.Scanner;
public class Ejercicio45{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa introduce un número y lo sustituye por otro");
        System.out.print("Dime un número: ");
        long n = sc.nextLong();
        long nc = n;
        System.out.print("Dime una posición: ");
        int pos = sc.nextInt();
        System.out.print("Dime el número a introducir: ");
        int d = sc.nextInt();
        int cont = 0;
        while(n>0){
            cont++;
            n/=10;
        }
        long pizq = nc / (long)Math.pow(10, cont-pos+1);
        pizq = pizq*10+d;
        long pder = nc % (long)Math.pow(10, cont-pos);
        n = pizq* (long)(Math.pow(10, cont-pos))+pder;
        System.out.println("El número resultante es: "+n);
    }
}