import java.util.Scanner;
public class Ejercicio43{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te pide un número y una posicion para partir el número");
        System.out.print("Dime un número: ");
        long n = sc.nextLong();
        long nv = 0;
        int parte1 = 0;
        int parte2 = 0;
        System.out.print("Dime donde lo quieres partir: ");
        double p = sc.nextInt();
        if(n<10){
            System.out.println("El número debe ser mayor de dos cifras");
        }else{
            while(n>0){
                nv = (nv*10)+(n%10);
                n/=10;
            }
            p = Math.pow(10, p);
            parte1 = (int)(nv/p);
            parte2 = (int)(nv%p);
            int parte1v = 0;
            int parte2v = 0;
            while(parte1>0){
                parte1v=(parte1v*10)+(parte1%10);
                parte1/=10;
            }
            while(parte2>0){
                parte2v=(parte2v*10)+(parte2%10);
                parte2/=10;
            }
            System.out.println("Lo números partidos son el "+parte2v+" y el "+parte1v);
        }
    }
}